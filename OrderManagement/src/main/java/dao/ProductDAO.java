package dao;

import connection.ConnectionFactory;
import model.Product;
import start.ReflectionExample;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.sql.*;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 * This class contains the data access to the database and run the queries for product operations
 */

public class ProductDAO implements GenericDAO<Product>
{

    protected static final Logger LOGGER = Logger.getLogger(ProductDAO.class.getName());
    private static final String insertStatement = "INSERT INTO Product (id,name,price,currentStock)"
            + " VALUES (?,?,?,?)";
    private final static String findStatement = "SELECT * FROM Product where id = ?";
    private final static String updateStatement = "UPDATE Product SET name= ?,price= ?,currentStock= ? WHERE id= ? ";
    private final static String deleteStatement = "DELETE FROM Product WHERE ID= ? ";
    private final static String selectAllStatement = "SELECT * FROM 	Product";

    @Override
    public Product findById(int id)
    {
        Product toReturn = null;

        Connection dbConnection = ConnectionFactory.getConnection();
        PreparedStatement statement = null;
        ResultSet rs = null;
        try {
            statement = dbConnection.prepareStatement(findStatement);
            statement.setLong(1, id);
            rs = statement.executeQuery();
            rs.next();

            String name = rs.getString("name");
            String price=rs.getString("price");
            String currentStock=rs.getString("currentStock");
            toReturn = new Product(id,name,Double.parseDouble(price), Integer.valueOf(currentStock));

        } catch (SQLException e) {
            LOGGER.log(Level.WARNING,"ProductRepository:fillById:  " + e.getMessage());
        } finally {
            ConnectionFactory.close(rs);
            ConnectionFactory.close(statement);
            ConnectionFactory.close(dbConnection);
        }
        return toReturn;
    }

    @Override
    public int insert(Product product, int value)
    {
        Connection dbConnection = ConnectionFactory.getConnection();

        PreparedStatement statement = null;
        int insertedId = -1;
        try {
            statement = dbConnection.prepareStatement(insertStatement, Statement.RETURN_GENERATED_KEYS);

            statement.setString(1, Integer.toString(product.getId()));
            statement.setString(2, product.getName());
            statement.setString(3, product.getPrice()+"");
            statement.setString(4, product.getCurrentStock()+"");
            statement.executeUpdate();

            ResultSet rs = statement.getGeneratedKeys();
            if (rs.next()) {
                insertedId = rs.getInt(1);
            }
        } catch (SQLException e) {
            LOGGER.log(Level.WARNING, "ProductRepository:insert " + e.getMessage());
        } finally
        {
            ConnectionFactory.close(statement);
            ConnectionFactory.close(dbConnection);
        }

        return insertedId;
    }

    @Override
    public Product updateCustomerById(int id, String s1, String s2, String s3, String s4)
    {
        return null;
    }

    @Override
    public Product updateProductById(int id, String s1, Double s2, int stock)
    {
        Connection dbConnection = ConnectionFactory.getConnection();
        Product toReturn=null;
        PreparedStatement statement = null;
        //StockRepositiry stockRp =new StockRepositiry();
        int updatedId = -1;
        try {
            statement = dbConnection.prepareStatement(updateStatement, Statement.RETURN_GENERATED_KEYS);
            statement.setString(1, s1);
            statement.setDouble(2, s2);
            statement.setInt(3, stock);
            statement.setInt(4,id);
            statement.executeUpdate();

            ResultSet rs = statement.getGeneratedKeys();
            if (rs.next()) {
                updatedId = rs.getInt(1);
            }
        } catch (SQLException e) {
            LOGGER.log(Level.WARNING, "CustomerRepository: update " + e.getMessage());
        } finally
        {
            ConnectionFactory.close(statement);
            ConnectionFactory.close(dbConnection);
            toReturn = new Product(id, s1,s2,stock);
        }
        return toReturn;
    }


    @Override
    public int delete(int id)
    {
        Connection dbConnection = ConnectionFactory.getConnection();
        PreparedStatement statement = null;


        int deleteId = 1;
        try {
            statement = dbConnection.prepareStatement(deleteStatement, Statement.RETURN_GENERATED_KEYS);
            statement.setString(1, id+"");
            statement.executeUpdate();

            ResultSet rs = statement.getGeneratedKeys();
            if (rs.next()) {
                deleteId = rs.getInt(1);
                System.out.println(deleteId);
            }
        } catch (SQLException e) {

        } finally
        {
            ConnectionFactory.close(statement);
            ConnectionFactory.close(dbConnection);
        }
        return deleteId;
    }

    @Override
    public ArrayList<Product> viewAll()
    {
        ArrayList<Product> toReturn = new ArrayList<Product>();

        Connection dbConnection = ConnectionFactory.getConnection();
        PreparedStatement statement = null;
        ResultSet rs = null;

        try {
            statement = dbConnection.prepareStatement(selectAllStatement);
            rs = statement.executeQuery();
            while(rs.next())
            {
                String id = rs.getString("id");
                String name = rs.getString("name");
                String price = rs.getString("price");
                String currentStock = rs.getString("currentStock");
                Product toAdd = new Product(Integer.parseInt(id), name, Double.parseDouble(price), Integer.parseInt(currentStock) );
                toReturn.add(toAdd);
            }
        } catch (SQLException e) {
            LOGGER.log(Level.WARNING,"ProductRepository:viewALL:  " + e.getMessage());
        } finally {
            ConnectionFactory.close(rs);
            ConnectionFactory.close(statement);
            ConnectionFactory.close(dbConnection);
        }
        return toReturn;
    }

    @Override
    public JTable viewAll2(ArrayList<?> objects)
    {
        ReflectionExample r=new ReflectionExample();
        String[] columnNames = r.retrieveProperties(objects.get(0));

        DefaultTableModel tableModel = new DefaultTableModel(columnNames, 0);

        for (Object object : objects) {

            Object[] rowData =r.getRows(object);
            tableModel.addRow(rowData);
        }

        return new JTable(tableModel);
    }


}
