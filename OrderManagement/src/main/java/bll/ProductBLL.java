package bll;

import bll.validators.NrValidator;
import bll.validators.Validator;
import dao.ProductDAO;
import model.Product;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;


public class ProductBLL
{
    private static ProductDAO p  = new ProductDAO();
    private static List<Validator<Product>> valid;

    public ProductBLL(){
        valid=new ArrayList<Validator<Product>>();
        valid.add(new NrValidator());
    }

    public static void add(Product pr){
        try{
            for (Validator<Product> i : valid)
                i.validate(pr);
            p.insert(pr,1);


        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Inserare produs nereusita" );

        }
    }

    public static void delete(int id){
        try{
            p.delete(id);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Stergere produs nereusita" );
        }
    }

    public static void update(int id,Product pr){
        try{
            p.updateProductById(id,pr.getName(),pr.getPrice(),pr.getCurrentStock());
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Editare produs nereusita" );
        }
    }

    public static Product find(int id){

        return p.findById(id);
    }


    public static JTable view(){
        ArrayList<Product> products=p.viewAll();
        JTable table=p.viewAll2(products);
        return  table;
    }
}
