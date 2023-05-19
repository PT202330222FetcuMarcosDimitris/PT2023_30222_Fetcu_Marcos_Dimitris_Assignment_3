package bll;

import bll.validators.StockValidator;
import bll.validators.Validator;
import dao.OrderDAO;
import dao.ProductDAO;
import model.Order;
import model.Product;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

/**
 * This Class does the operations on the Order database
 */

public class OrderBLL
{
    private static OrderDAO o = new OrderDAO();

    private static List<Validator<Order>> valid=new ArrayList<Validator<Order>>();



    public OrderBLL()
    {
        valid.add(new StockValidator());

        /**
         * An object (type Order) is verified if it has valid inputs and is added to the database
         */
    }
    public static void add(Order newOrder)
    {
        try
        {
            for (Validator<Order> i : valid)
                i.validate(newOrder);
            o.insert(newOrder,1);

            ProductDAO productdao=new ProductDAO();
            ArrayList<Product> products=productdao.viewAll();

            for (Product product : products)
            {
                int auxid = product.getId();
                if(auxid==newOrder.getProductId())
                {
                    Product newProduct=new Product(product.getId(),product.getName(),product.getPrice(),product.getCurrentStock()-newOrder.getQuantity());
                    ProductBLL productBll=new ProductBLL();
                    productBll.update(product.getId(),newProduct);

                }
            }



        }
        catch (Exception e)
        {
            JOptionPane.showMessageDialog(null, "Stock insuficient");
        }
    }

    /**
     * this method provides the JTable that is displayed in the interface
     * @return JTable
     */
    public static JTable view(){
        ArrayList<Order> orders=o.viewAll();
        JTable table=o.viewAll2(orders);
        return  table;
    }


}
