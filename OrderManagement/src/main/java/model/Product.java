package model;

/**
 * @Author: Fetcu Marcos Dimitris
 * TP Assignment3
 * @Since: May 18, 2023
 */
public class Product
{
    private int id;
    private String name;
    private Double price;
    private int currentStock;

    /**
     * This is the constructor for a product. This class only has setters and getters
     * @param id
     * @param name
     * @param price
     * @param currentStock
     */

    public Product(int id, String name, Double price, int currentStock)
    {
        this.id = id;
        this.name = name;
        this.price = price;
        this.currentStock = currentStock;
    }

    public int getId()
    {
        return id;
    }

    public void setId(int id)
    {
        this.id = id;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public Double getPrice()
    {
        return price;
    }

    public void setPrice(Double price)
    {
        this.price = price;
    }

    public int getCurrentStock()
    {
        return currentStock;
    }

    public void setCurrentStock(int currentStock)
    {
        this.currentStock = currentStock;
    }

    @Override
    public String toString() {
        return "Product [id=" + id + ", name=" + name + ", price=" + price + ", currentStock=" + currentStock + "]";
    }
}
