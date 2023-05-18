package model;

import dao.ProductDAO;

import java.util.ArrayList;

public class Order
{
    private int id;
    private int clientId;
    private int productId;
    private int quantity;
    private Double price;

    public Order(int id, int clientId, int productId, int quantity)
    {
        this.id = id;
        this.clientId = clientId;
        this.productId = productId;
        this.quantity = quantity;

        ProductDAO productdao=new ProductDAO();
        ArrayList<Product> products=productdao.viewAll();

        for (Product product : products)
        {
            int auxid = product.getId();
            if(auxid==productId)
            {
                this.price=product.getPrice()*quantity;
            }
        }
    }

    public Order()
    {
    }

    public int getId()
    {
        return id;
    }

    public void setId(int id)
    {
        this.id = id;
    }

    public int getClientId()
    {
        return clientId;
    }

    public void setClientId(int clientId)
    {
        this.clientId = clientId;
    }

    public int getProductId()
    {
        return productId;
    }

    public void setProductId(int productId)
    {
        this.productId = productId;
    }

    public int getQuantity()
    {
        return quantity;
    }

    public void setQuantity(int quantity)
    {
        this.quantity = quantity;
    }

    public Double getPrice()
    {
        return price;
    }

    public void setPrice(Double price)
    {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Order [id=" + id + ", clientId=" + clientId + ", productId=" + productId + ", quantity=" + quantity + ", price=" + price
                + "]";
    }
}
