package presentation;

import javax.swing.*;

public class MainView extends JFrame
{
    private JPanel mainPanel;
    private JLabel titleLabel;
    private JLabel selectLabel;
    private JLabel picLabel;
    private JButton clientButton;
    private JButton orderButton;
    private JButton productButton;

    public MainView(String title) {
        super(title);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setContentPane(mainPanel);
        this.pack();
        /*
        Startt.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                int simt, mina, maxa, mins, maxs;
                String s;
                s = textField1.getText();
                simt = Integer.valueOf(s);

                s = textField2.getText();
                mina = Integer.valueOf(s);

                s = textField3.getText();
                maxa = Integer.valueOf(s);

                s = textField4.getText();
                mins = Integer.valueOf(s);

                s = textField1.getText();
                maxs = Integer.valueOf(s);


            }
        });
        */

    }

    public JPanel getMainPanel()
    {
        return mainPanel;
    }

    public void setMainPanel(JPanel mainPanel)
    {
        this.mainPanel = mainPanel;
    }

    public JLabel getTitleLabel()
    {
        return titleLabel;
    }

    public void setTitleLabel(JLabel titleLabel)
    {
        this.titleLabel = titleLabel;
    }

    public JLabel getSelectLabel()
    {
        return selectLabel;
    }

    public void setSelectLabel(JLabel selectLabel)
    {
        this.selectLabel = selectLabel;
    }

    public JLabel getPicLabel()
    {
        return picLabel;
    }

    public void setPicLabel(JLabel picLabel)
    {
        this.picLabel = picLabel;
    }

    public JButton getClientButton()
    {
        return clientButton;
    }

    public void setClientButton(JButton clientButton)
    {
        this.clientButton = clientButton;
    }

    public JButton getOrderButton()
    {
        return orderButton;
    }

    public void setOrderButton(JButton orderButton)
    {
        this.orderButton = orderButton;
    }

    public JButton getProductButton()
    {
        return productButton;
    }

    public void setProductButton(JButton productButton)
    {
        this.productButton = productButton;
    }
}
