package dao;

import connection.ConnectionFactory;
import model.Order;
import start.ReflectionExample;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.sql.*;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * This class contains the data access to the database and run the queries for order operations
 */

public class OrderDAO implements GenericDAO<Order>
{
    protected static final Logger LOGGER = Logger.getLogger(OrderDAO.class.getName());
    private static final String insertStatement = "INSERT INTO schooldb.order (id,clientId,productId,quantity,price)"
            + " VALUES (?,?,?,?,?)";
    private final static String findStatement = "SELECT * FROM Order where id = ?";
    private final static String selectAllStatement = "SELECT * FROM schooldb.order";
    private final static String deleteStatement = "DELETE FROM Order WHERE clientId=?";
    private final static String updateStatement = "UPDATE Order SET CLIENTID= ?,PRODUCTID= ?,QUANTITY= ?,PRICE= ? WHERE ID= ? ";


    @Override
    public Order findById(int id)
    {
        Order toReturn = null;

        Connection dbConnection = ConnectionFactory.getConnection();
        PreparedStatement statement = null;
        ResultSet rs = null;
        try {
            statement = dbConnection.prepareStatement(findStatement);
            statement.setLong(1, id);
            rs = statement.executeQuery();
            rs.next();

            String clientId = rs.getString("clientId");
            String productId = rs.getString("productId");
            String quantity = rs.getString("quantity");
            String price = rs.getString("price");

            toReturn = new Order(id,Integer.parseInt(clientId),Integer.parseInt(productId),Integer.parseInt(quantity));

        } catch (SQLException e) {
            LOGGER.log(Level.WARNING,"OrderDAO:fillById:  " + e.getMessage());
        } finally {
            ConnectionFactory.close(rs);
            ConnectionFactory.close(statement);
            ConnectionFactory.close(dbConnection);
        }
        return toReturn;
    }

    @Override
    public int insert(Order order, int value)
        {

        Connection dbConnection = ConnectionFactory.getConnection();
        PreparedStatement statement= null;
        int insertedId = -1;
        try
        {
            statement = dbConnection.prepareStatement(insertStatement, Statement.RETURN_GENERATED_KEYS);

            statement.setString(1, Integer.toString(order.getId()));
            statement.setString(2, Integer.toString(order.getClientId()));
            statement.setString(3,Integer.toString(order.getProductId()));
            statement.setString(4, Integer.toString(order.getQuantity()));
            statement.setString(5, Double.toString(order.getPrice()));
            statement.executeUpdate();

            ResultSet rs = statement.getGeneratedKeys();
            if (rs.next()) {
                insertedId = rs.getInt(1);
            }
        } catch (SQLException e) {
            LOGGER.log(Level.WARNING, "OrderRepository:insert " + e.getMessage());
        } finally
        {
            ConnectionFactory.close(statement);
            ConnectionFactory.close(dbConnection);
        }
        return insertedId;
    }

    @Override
    public Order updateCustomerById(int id, String s1, String s2, String s3, String s4)
    {
        return null;
    }

    @Override
    public Order updateProductById(int id, String s1, Double s2, int stock)
    {
        return null;
    }


    @Override
    public int delete(int id)
    {
        Connection dbConnection = ConnectionFactory.getConnection();

        PreparedStatement statement = null;
        int Id = -1;
        try {
            statement = dbConnection.prepareStatement(deleteStatement, Statement.RETURN_GENERATED_KEYS);
            statement.setString(1,id+"");
            statement.executeUpdate();

            ResultSet rs = statement.getGeneratedKeys();
            if (rs.next()) {
                Id = rs.getInt(1);
            }
        } catch (SQLException e) {
            LOGGER.log(Level.WARNING, "OrderRepository:delete " + e.getMessage());
        } finally
        {
            ConnectionFactory.close(statement);
            ConnectionFactory.close(dbConnection);
        }
        return Id;
    }

    @Override
    public ArrayList<Order> viewAll()
    {
        ArrayList<Order> toReturn = new ArrayList<Order>();

        Connection dbConnection = ConnectionFactory.getConnection();
        PreparedStatement statement = null;
        ResultSet rs = null;
        try {
            statement = dbConnection.prepareStatement(selectAllStatement);
            rs = statement.executeQuery();
            while(rs.next())
            {
                String id = rs.getString("id");
                String clientId = rs.getString("clientId");
                String productId = rs.getString("productId");
                String quantity = rs.getString("quantity");
                String price = rs.getString("price");
                Order toAdd = new Order(Integer.parseInt(id),Integer.parseInt(clientId),Integer.parseInt(productId),Integer.parseInt(quantity));
                toReturn.add(toAdd);

            }
        } catch (SQLException e) {
            LOGGER.log(Level.WARNING,"OrderRepository:viewALL:  " + e.getMessage());
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
