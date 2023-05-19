package model;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;

/**
 * @Author: Fetcu Marcos Dimitris
 * TP Assignment3
 * @Since: May 18, 2023
 */

public record Bill(Order order)
{
    /**
     * This is the constructor that generates the Bill.txt
     * @param order The order that was added successfully
     */
    public Bill(Order order)
    {
        this.order=new Order(order.getId(),order.getClientId(),order.getProductId(),order.getQuantity());
        String timeStamp = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new java.util.Date());
        try {
            FileWriter fileWriter = new FileWriter("Order"+order.getId()+".txt");
            PrintWriter printWriter = new PrintWriter(fileWriter);
            printWriter.println(timeStamp+"\n\n\n");
            printWriter.println("Order ID: " + order.getId());
            printWriter.println("Client ID: " + order.getClientId());
            printWriter.println("Product ID: " + order.getProductId());
            printWriter.println("Quantity: " + order.getQuantity());
            printWriter.println("Total Price: " + order.getPrice());
            printWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }

}
