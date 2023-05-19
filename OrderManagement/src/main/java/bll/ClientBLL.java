package bll;

import bll.validators.EmailValidator;
import bll.validators.Validator;
import dao.ClientDAO;
import model.Client;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

/**
 * This Class does the operations on the Client database
 */

public class ClientBLL
{
    private static ClientDAO c=new ClientDAO();
    private static List<Validator<Client>> valid=new ArrayList<Validator<Client>>();

    public ClientBLL()
    {
        valid.add(new EmailValidator());
    }

    /**
     * An object (type Client) is verified if it has valid inputs and is added to the database
     * @param client
     */
    public static void add(Client client)
    {
        try
        {
              for (Validator<Client> i : valid)
                i.validate(client);
            c.insert(client, 1);
        }
        catch (Exception e)
        {
            JOptionPane.showMessageDialog(null, "eroare adaugare client, deoarece emailul introdus nu este corect" );
        }
    }

    public static Client find(int id){
        return c.findById(id);
    }

    /**
     * This method provides the id to be deleted from the table
     * @param id
     */
    public static void delete(int id){
        try{
                c.delete(id);
            }

         catch (Exception e) {
            JOptionPane.showMessageDialog(null, "eroare stergere client" );

        }
    }

    /**
     * This method updates a client by id
     * @param id
     * @param client
     */
    public static void updateClient(int id,Client client)
    {
        try{
            c.updateCustomerById(id,client.getName(),client.getEmail(),client.getPhoneNumber(),client.getAddress());
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "eroare update client" );
        }

    }

    /**
     * this method provides the JTable that is displayed in the interface
     * @return JTable
     */
    public static JTable afisareClient(){
        ArrayList<Client> clients=c.viewAll();
       JTable table=c.viewAll2(clients);
        return  table;

    }
}

