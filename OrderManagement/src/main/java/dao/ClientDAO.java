package dao;

import connection.ConnectionFactory;
import model.Client;
import start.ReflectionExample;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.sql.*;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ClientDAO implements GenericDAO<Client>
{

    protected static final Logger LOGGER = Logger.getLogger(ClientDAO.class.getName());
    private static final String insertStatement = "INSERT INTO client (id,name,email,phoneNumber,address)"
            + " VALUES (?,?,?,?,?)";
    private final static String findStatement = "SELECT * FROM Client where id = ?";
    private final static String updateStatement = "UPDATE client SET name=?, email=?, phoneNumber=?, address=? WHERE id=? ";
    private final static String deleteStatement = "DELETE FROM client WHERE id=? ";
    private final static String selectAllStatement = "SELECT * FROM 	Client";

    @Override
    public Client findById(int id)
    {
        Client aux=new Client();

        Connection dbConnection = ConnectionFactory.getConnection();
        PreparedStatement statement = null;
        ResultSet rs = null;
        try {
            statement = dbConnection.prepareStatement(findStatement);
            statement.setLong(1,id);
            rs = statement.executeQuery();
            rs.next();

            String name = rs.getString("name");
            String email = rs.getString("email");
            String phoneNumber = rs.getString("phoneNumber");
            String address = rs.getString("address");

            aux = new Client(id,name,email,phoneNumber,address);

        } catch (SQLException e) {
            LOGGER.log(Level.WARNING,"ClientDAO:fillById:  " + e.getMessage());
        } finally {
            ConnectionFactory.close(rs);
            ConnectionFactory.close(statement);
            ConnectionFactory.close(dbConnection);
        }
        return aux;
    }

    @Override
    public int insert(Client client, int value)
    {
        Connection dbConnection = ConnectionFactory.getConnection();


        PreparedStatement statement = null;
        int insertId = -1;
        try {
            statement = dbConnection.prepareStatement(insertStatement, Statement.RETURN_GENERATED_KEYS);

            statement.setString(1, Integer.toString(client.getId()));
            statement.setString(2, client.getName());
            statement.setString(3, client.getEmail());
            statement.setString(4, client.getPhoneNumber());
            statement.setString(5, client.getAddress());
            statement.executeUpdate();


            ResultSet rs = statement.getGeneratedKeys();
            if (rs.next()) {
                insertId = rs.getInt(1);
            }
        } catch (SQLException e) {
            LOGGER.log(Level.WARNING, "ClientDAO:insert " + e.getMessage());
        } finally
        {
            ConnectionFactory.close(statement);
            ConnectionFactory.close(dbConnection);
        }
        return insertId;
    }

    @Override
    public Client updateCustomerById(int id, String s1, String s2, String s3, String s4)
    {
        Connection dbConnection = ConnectionFactory.getConnection();
        Client aux=null;
        PreparedStatement statement = null;
        int updatedId = -1;
        try {
            statement = dbConnection.prepareStatement(updateStatement, Statement.RETURN_GENERATED_KEYS);
            statement.setString(1, s1);
            statement.setString(2, s2);
            statement.setString(3, s3);
            statement.setString(4, s4);
            statement.setInt(5,id);
            statement.executeUpdate();

            ResultSet rs = statement.getGeneratedKeys();
            if (rs.next()) {
                updatedId = rs.getInt(1);
            }
        } catch (SQLException e) {
            LOGGER.log(Level.WARNING, "ClientDAO:update " + e.getMessage());
        } finally
        {
            ConnectionFactory.close(statement);
            ConnectionFactory.close(dbConnection);
            aux = new Client(id,s1,s2,s3,s4);
        }
        return aux;
    }

    @Override
    public Client updateProductById(int id, String s1, Double s2, int stock)
    {
        return null;
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
            }
        } catch (SQLException e) {
            LOGGER.log(Level.WARNING, "ClientDAO:delete " + e.getMessage());
            deleteId=-1;
        } finally
        {
            ConnectionFactory.close(statement);
            ConnectionFactory.close(dbConnection);
        }

        return deleteId;
    }

    @Override
    public ArrayList<Client> viewAll()
    {
        ArrayList<Client> toReturn = new ArrayList<Client>();

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
                String email = rs.getString("email");
                String phone = rs.getString("phoneNumber");
                String address = rs.getString("Address");

                Client toAdd = new Client(Integer.parseInt(id), name,email,phone, address);
                toReturn.add(toAdd);

            }
        } catch (SQLException e) {
            LOGGER.log(Level.WARNING,"ClientDAO:viewall:  " + e.getMessage());
        } finally {
            ConnectionFactory.close(rs);
            ConnectionFactory.close(statement);
            ConnectionFactory.close(dbConnection);
        }

        return toReturn;
    }

    @Override
    public JTable viewAll2( ArrayList<?> objects)
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
