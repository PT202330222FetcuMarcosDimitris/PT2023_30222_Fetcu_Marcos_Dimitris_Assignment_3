package presentation;

import javax.swing.*;
import java.awt.*;

public class AddOrderView extends JFrame
{
    private JPanel mainPanel;
    private JComboBox combo1;
    private JComboBox combo2;
    private JLabel clientLabel;
    private JLabel productLabel;
    private JLabel quantityLabel;
    private JTextField quantityText;
    private JLabel idLabel;
    private JTextField idText;
    private JButton OKButton;
    private JButton backButton;

    public AddOrderView(String title) throws HeadlessException
    {
        super(title);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setContentPane(mainPanel);
        this.pack();
    }

    public JPanel getMainPanel()
    {
        return mainPanel;
    }

    public void setMainPanel(JPanel mainPanel)
    {
        this.mainPanel = mainPanel;
    }

    public JComboBox getComboBox1()
    {
        return combo1;
    }

    public void setComboBox1(JComboBox comboBox1)
    {
        this.combo1 = comboBox1;
    }

    public JComboBox getComboBox2()
    {
        return combo2;
    }

    public void setComboBox2(JComboBox comboBox2)
    {
        this.combo2 = comboBox2;
    }

    public JLabel getClientLabel()
    {
        return clientLabel;
    }

    public void setClientLabel(JLabel clientLabel)
    {
        this.clientLabel = clientLabel;
    }

    public JLabel getProductLabel()
    {
        return productLabel;
    }

    public void setProductLabel(JLabel productLabel)
    {
        this.productLabel = productLabel;
    }

    public JLabel getQuantityLabel()
    {
        return quantityLabel;
    }

    public void setQuantityLabel(JLabel quantityLabel)
    {
        this.quantityLabel = quantityLabel;
    }

    public JTextField getTextField1()
    {
        return quantityText;
    }

    public void setTextField1(JTextField textField1)
    {
        this.quantityText = textField1;
    }

    public JLabel getIdLabel()
    {
        return idLabel;
    }

    public void setIdLabel(JLabel idLabel)
    {
        this.idLabel = idLabel;
    }

    public JTextField getTextField2()
    {
        return idText;
    }

    public void setTextField2(JTextField textField2)
    {
        this.idText = textField2;
    }

    public JButton getOKButton()
    {
        return OKButton;
    }

    public void setOKButton(JButton OKButton)
    {
        this.OKButton = OKButton;
    }

    public JTextField getIdText()
    {
        return idText;
    }

    public void setIdText(JTextField idText)
    {
        this.idText = idText;
    }

    public JTextField getQuantityText()
    {
        return quantityText;
    }

    public void setQuantityText(JTextField quantityText)
    {
        this.quantityText = quantityText;
    }

    public JButton getBackButton()
    {
        return backButton;
    }
}
