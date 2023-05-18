package presentation;

import bll.ClientBLL;
import bll.OrderBLL;
import bll.ProductBLL;
import dao.ClientDAO;
import dao.ProductDAO;
import model.Bill;
import model.Client;
import model.Order;
import model.Product;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class Controller
{

    public void startf1()
    {
        MainView frame1=new MainView("My Order Management App");
        frame1.setVisible(true);

        frame1.getClientButton().addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                frame1.setVisible(false);
                OperationsView frame2=new OperationsView("");
                frame2.setVisible(true);

                frame2.getBackButton().addActionListener(new ActionListener()
                {

                    @Override
                    public void actionPerformed(ActionEvent e)
                    {
                        frame2.setVisible(false);
                        frame1.setVisible(true);
                            }
                        });


                frame2.getAddButton().addActionListener(new ActionListener()
                {

                    @Override
                    public void actionPerformed(ActionEvent e)
                    {
                        frame2.setVisible(false);
                        AddClientView frame3=new AddClientView("");
                        frame3.setVisible(true);

                        frame3.getBackButton().addActionListener(new ActionListener()
                        {

                            @Override
                            public void actionPerformed(ActionEvent e)
                            {
                                frame3.setVisible(false);
                                frame2.setVisible(true);
                            }
                        });

                        frame3.getOkButon().addActionListener(new ActionListener()
                        {

                            @Override
                            public void actionPerformed(ActionEvent e)
                            {

                               String s,newname,newemail,newphoneNr,newAdress;
                               int id;
                                s = frame3.getIdText().getText();
                                id=Integer.parseInt(s);

                                s=frame3.getNameText().getText();
                                newname=s;

                                s=frame3.getEmailText().getText();
                                newemail=s;

                                s=frame3.getPhoneText().getText();
                                newphoneNr=s;

                                s=frame3.getAddressText().getText();
                                newAdress=s;

                                Client newClient=new Client(id,newname,newemail,newphoneNr,newAdress);

                                ClientBLL clientBll=new ClientBLL();
                                clientBll.add(newClient);

                            }
                        });


                    }
                });

                frame2.getEditButton().addActionListener(new ActionListener()
                {
                    @Override
                    public void actionPerformed(ActionEvent e)
                    {
                        frame2.setVisible(false);
                        EditClientView frame4=new EditClientView("");
                        frame4.setVisible(true);

                        frame4.getBackButton().addActionListener(new ActionListener()
                        {

                            @Override
                            public void actionPerformed(ActionEvent e)
                            {

                                frame4.setVisible(false);
                                frame2.setVisible(true);

                            }
                        });

                        frame4.getOkButton().addActionListener(new ActionListener()
                        {

                            @Override
                            public void actionPerformed(ActionEvent e)
                            {

                                String s,newname,newemail,newphoneNr,newAdress;
                                int id;
                                s = frame4.getIdText().getText();
                                id=Integer.parseInt(s);
                                System.out.println(s);
                                s=frame4.getNameText().getText();
                                newname=s;
                                System.out.println(s);
                                s=frame4.getEmailText().getText();
                                newemail=s;
                                System.out.println(s);
                                s=frame4.getPhoneText().getText();
                                newphoneNr=s;
                                System.out.println(s);
                                s=frame4.getAddressText().getText();
                                newAdress=s;
                                System.out.println(s);
                                System.out.println(newAdress);
                                Client newClient=new Client(id,newname,newemail,newphoneNr,newAdress);
                                System.out.println(newClient.getAddress());
                                ClientBLL clientBll=new ClientBLL();
                                clientBll.updateClient(newClient.getId(),newClient);

                            }
                        });


                    }
                });

                frame2.getDeleteButton().addActionListener(new ActionListener()
                {
                    @Override
                    public void actionPerformed(ActionEvent e)
                    {
                        frame2.setVisible(false);
                        DeleteClientView frame5=new DeleteClientView("");
                        frame5.setVisible(true);

                        frame5.getBackButton().addActionListener(new ActionListener()
                        {
                            @Override
                            public void actionPerformed(ActionEvent e)
                            {
                                frame5.setVisible(false);
                                frame2.setVisible(true);

                            }
                        });

                frame5.getOKButton().addActionListener(new ActionListener()
                        {

                            @Override
                            public void actionPerformed(ActionEvent e)
                            {

                                String s;
                                int id;
                                s = frame5.getIdText().getText();
                                id=Integer.parseInt(s);

                                ClientBLL clientBll=new ClientBLL();
                                clientBll.delete(id);

                            }
                        });


                    }
                });

                frame2.getViewButton().addActionListener(new ActionListener()
                {
                    @Override
                    public void actionPerformed(ActionEvent e)
                    {
                        frame2.setVisible(false);
                        ViewAllView frame6=new ViewAllView("");
                        ClientBLL clientBll=new ClientBLL();

                       JTable table= clientBll.afisareClient();
                        JTable table2=frame6.getTable();
                        JScrollPane pane=frame6.getScroll();
                        pane.setViewportView(null);
                        pane.setViewportView(table);
                        frame6.setVisible(true);

                        frame6.getBackButton().addActionListener(new ActionListener()
                        {
                            @Override
                            public void actionPerformed(ActionEvent e)
                            {
                                frame6.setVisible(false);
                                frame2.setVisible(true);

                            }
                        });

                    }
                });

            }
        });
        ///////////
        frame1.getProductButton().addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                frame1.setVisible(false);
                OperationsView2 frame2=new OperationsView2("");
                frame2.setVisible(true);

                frame2.getBackButton().addActionListener(new ActionListener()
                {
                    @Override
                    public void actionPerformed(ActionEvent e)
                    {
                        frame2.setVisible(false);

                        frame1.setVisible(true);

                    }
                });


                frame2.getAddButton().addActionListener(new ActionListener()
                {
                    @Override
                    public void actionPerformed(ActionEvent e)
                    {
                        frame2.setVisible(false);
                        AddProductView frame3=new AddProductView("");
                        frame3.setVisible(true);

                        frame3.getBackButton().addActionListener(new ActionListener()
                        {
                            @Override
                            public void actionPerformed(ActionEvent e)
                            {
                                frame3.setVisible(false);
                                frame2.setVisible(true);

                            }
                        });
                        frame3.getOkButton().addActionListener(new ActionListener()
                        {

                            @Override
                            public void actionPerformed(ActionEvent e)
                            {

                                String s,newname;
                                int newId,newStock;
                                Double newPrice;

                                s = frame3.getIdText().getText();
                                newId=Integer.parseInt(s);

                                s=frame3.getNameText().getText();
                                newname=s;

                                s=frame3.getPriceText().getText();
                                newPrice=Double.parseDouble(s);

                                s=frame3.getStockText().getText();
                                newStock=Integer.parseInt(s);

                                Product newProduct=new Product(newId,newname,newPrice,newStock);

                                ProductBLL productBll=new ProductBLL();
                                productBll.add(newProduct);

                            }
                        });

                    }
                });

                frame2.getEditButton().addActionListener(new ActionListener()
                {
                    @Override
                    public void actionPerformed(ActionEvent e)
                    {
                        frame2.setVisible(false);
                        EditProductView frame4=new EditProductView("");
                        frame4.setVisible(true);

                        frame4.getBackButton().addActionListener(new ActionListener()
                        {
                            @Override
                            public void actionPerformed(ActionEvent e)
                            {
                                frame4.setVisible(false);
                                frame2.setVisible(true);

                            }
                        });
                        frame4.getOkButton().addActionListener(new ActionListener()
                        {

                            @Override
                            public void actionPerformed(ActionEvent e)
                            {

                                String s,newname;
                                int newId,newStock;
                                Double newPrice;

                                s = frame4.getIdText().getText();
                                newId=Integer.parseInt(s);

                                s=frame4.getNameText().getText();
                                newname=s;

                                s=frame4.getPriceText().getText();
                                newPrice=Double.parseDouble(s);

                                s=frame4.getQuantityText().getText();
                                newStock=Integer.parseInt(s);

                                Product newProduct=new Product(newId,newname,newPrice,newStock);

                                ProductBLL productBll=new ProductBLL();
                                productBll.update(newId,newProduct);

                            }
                        });

                    }
                });

                frame2.getDeleteButton().addActionListener(new ActionListener()
                {
                    @Override
                    public void actionPerformed(ActionEvent e)
                    {
                        frame2.setVisible(false);
                        DeleteProductView frame5=new DeleteProductView("");
                        frame5.setVisible(true);

                        frame5.getBackButton().addActionListener(new ActionListener()
                        {
                            @Override
                            public void actionPerformed(ActionEvent e)
                            {
                                frame5.setVisible(false);
                                frame2.setVisible(true);

                            }
                        });

                        frame5.getOKButton().addActionListener(new ActionListener()
                        {

                            @Override
                            public void actionPerformed(ActionEvent e)
                            {

                                String s;
                                int id;
                                s = frame5.getIdText().getText();
                                id=Integer.parseInt(s);

                                ProductBLL productBll=new ProductBLL();
                                productBll.delete(id);

                            }
                        });

                    }
                });

                frame2.getViewAllButton().addActionListener(new ActionListener()
                {
                    @Override
                    public void actionPerformed(ActionEvent e)
                    {
                        frame2.setVisible(false);
                        ViewAllView2 frame6=new ViewAllView2("");
                       // frame6.setVisible(true);
                        ProductBLL productbll=new ProductBLL();

                        JTable table= productbll.view();
                        JTable table2=frame6.getTable();
                        JScrollPane pane=frame6.getScroll();
                        pane.setViewportView(null);
                        pane.setViewportView(table);
                        frame6.setVisible(true);

                        frame6.getBackButton().addActionListener(new ActionListener()
                        {
                            @Override
                            public void actionPerformed(ActionEvent e)
                            {
                                frame6.setVisible(false);
                                frame2.setVisible(true);

                            }
                        });

                    }
                });

            }
        });
        ///////
        frame1.getOrderButton().addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                frame1.setVisible(false);
                OperationsView3 frame2=new OperationsView3("");
                frame2.setVisible(true);

                frame2.getBackButton().addActionListener(new ActionListener()
                {
                    @Override
                    public void actionPerformed(ActionEvent e)
                    {
                        frame2.setVisible(false);
                        frame1.setVisible(true);

                    }
                });

                frame2.getAddButton().addActionListener(new ActionListener()
                {
                    @Override
                    public void actionPerformed(ActionEvent e)
                    {
                        frame2.setVisible(false);
                        AddOrderView frame3=new  AddOrderView("");

                        ClientDAO clientdao=new ClientDAO();
                        ArrayList<Client> clients=clientdao.viewAll();

                        ProductDAO productdao=new ProductDAO();
                        ArrayList<Product> products=productdao.viewAll();

                        JComboBox combo1=frame3.getComboBox1();
                        combo1.removeAllItems();

                        for (Client client : clients)
                        {
                            String name = Integer.toString(client.getId());
                            combo1.addItem(name);
                        }

                        JComboBox combo2=frame3.getComboBox2();
                        combo2.removeAllItems();

                        for (Product product : products)
                        {
                            String name = Integer.toString(product.getId());
                            combo2.addItem(name);
                        }

                         frame3.setVisible(true);

                        frame3.getBackButton().addActionListener(new ActionListener()
                        {
                            @Override
                            public void actionPerformed(ActionEvent e)
                            {
                                frame3.setVisible(false);
                                frame2.setVisible(true);

                            }
                        });

                        frame3.getOKButton().addActionListener(new ActionListener()
                        {

                            @Override
                            public void actionPerformed(ActionEvent e)
                            {

                                String s;
                                int newid,newcid,newpid,newq;

                                s = frame3.getIdText().getText();
                                newid=Integer.parseInt(s);

                                s = (String) frame3.getComboBox1().getSelectedItem();
                                newcid=Integer.parseInt(s);

                                s = (String) frame3.getComboBox2().getSelectedItem();
                                newpid=Integer.parseInt(s);

                                s=frame3.getQuantityText().getText();
                                newq=Integer.parseInt(s);

                                Order newOrder=new Order(newid,newcid,newpid,newq);

                                OrderBLL orderBll=new OrderBLL();
                               orderBll.add(newOrder);
                               Bill bill=new Bill(newOrder);
                            }
                        });

                    }
                });


                frame2.getViewAllButton().addActionListener(new ActionListener()
                {
                    @Override
                    public void actionPerformed(ActionEvent e)
                    {
                        frame2.setVisible(false);
                        ViewAllView3 frame6=new ViewAllView3("");

                       OrderBLL orderbll=new OrderBLL();

                        JTable table= orderbll.view();
                        JTable table2=frame6.getTable();
                        JScrollPane pane=frame6.getScroll();
                        pane.setViewportView(null);
                        pane.setViewportView(table);

                        frame6.setVisible(true);

                        frame6.getBackButton().addActionListener(new ActionListener()
                        {
                            @Override
                            public void actionPerformed(ActionEvent e)
                            {
                                frame6.setVisible(false);
                                frame2.setVisible(true);

                            }
                        });

                    }
                });

            }
        });


    }

}
