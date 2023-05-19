package dao;

import javax.swing.*;
import java.util.ArrayList;

/**
 * This interface declares the operations that should be implemented.
 * @param <T>
 */

public interface GenericDAO<T>
{
    /**
     * This method search into the database by id
     * @param id
     * @return an object Client, Product or Order
     */
    public T findById(int id);

    /**
     * This method updates Client Table by id
     * @param id
     * @param s1
     * @param s2
     * @param s3
     * @param s4
     * @return
     */
    public T updateCustomerById(int id, String s1, String s2, String s3, String s4);

    /**
     * This method updates Product Table by id
     * @param id
     * @param s1
     * @param s2
     * @param stock
     * @return
     */
    public T updateProductById(int id, String s1, Double s2, int stock);


    /**
     * This method insert one element in table
     * @param t
     * @param value
     * @return
     */
    public int  insert(T t, int value);

    /**
     * This method delete an item by id
     * @param id
     * @return
     */
    public int delete(int  id);

    /**
     * This method return an ArrayList with all object from the database
     * @return
     */
    public ArrayList<T> viewAll();

    /**
     * This method returns a JTable with all object from the database
     * @param objects
     * @return
     */

    public JTable viewAll2( ArrayList<?> objects);

}
