package dao;

import javax.swing.*;
import java.util.ArrayList;

public interface GenericDAO<T>
{

    public T findById(int id);

    public T updateCustomerById(int id, String s1, String s2, String s3, String s4);
    public T updateProductById(int id, String s1, Double s2, int stock);

    public int  insert(T t, int value);
    public int delete(int  id);
    public ArrayList<T> viewAll();

    public JTable viewAll2( ArrayList<?> objects);

}
