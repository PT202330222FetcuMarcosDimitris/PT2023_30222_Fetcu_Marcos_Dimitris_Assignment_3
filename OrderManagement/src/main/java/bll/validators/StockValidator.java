package bll.validators;

import dao.ProductDAO;
import model.Order;
import model.Product;

import java.util.ArrayList;

public class StockValidator implements Validator<Order>
{
    public void validate(Order o)
    {
        ProductDAO productdao=new ProductDAO();
        ArrayList<Product> products=productdao.viewAll();

        for (Product product : products)
        {
            int auxid = product.getId();
            if(auxid==o.getProductId())
            {
                if(product.getCurrentStock()<o.getQuantity())
                    throw new IllegalArgumentException("Cantitate mai mica decat 0");
            }
        }
    }

}
