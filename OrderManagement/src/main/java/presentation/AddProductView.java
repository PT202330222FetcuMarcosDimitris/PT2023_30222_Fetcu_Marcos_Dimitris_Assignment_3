package presentation;

import javax.swing.*;
import java.awt.*;

public class AddProductView extends JFrame
{
    private JPanel mainPanel;
    private JTextField idText;
    private JTextField nameText;
    private JTextField priceText;
    private JTextField stockText;
    private JButton okButton;
    private JLabel titleLabel;
    private JLabel nameLabel;
    private JLabel idLabel;
    private JLabel priceLabel;
    private JLabel stockLabel;
    private JButton backButton;

    public AddProductView(String title) throws HeadlessException
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

    public JTextField getIdText()
    {
        return idText;
    }

    public void setIdText(JTextField idText)
    {
        this.idText = idText;
    }

    public JTextField getNameText()
    {
        return nameText;
    }

    public void setNameText(JTextField nameText)
    {
        this.nameText = nameText;
    }

    public JTextField getPriceText()
    {
        return priceText;
    }

    public void setPriceText(JTextField priceText)
    {
        this.priceText = priceText;
    }

    public JTextField getStockText()
    {
        return stockText;
    }

    public void setStockText(JTextField stockText)
    {
        this.stockText = stockText;
    }

    public JButton getOkButton()
    {
        return okButton;
    }

    public void setOkButton(JButton okButton)
    {
        this.okButton = okButton;
    }

    public JLabel getTitleLabel()
    {
        return titleLabel;
    }

    public void setTitleLabel(JLabel titleLabel)
    {
        this.titleLabel = titleLabel;
    }

    public JLabel getNameLabel()
    {
        return nameLabel;
    }

    public void setNameLabel(JLabel nameLabel)
    {
        this.nameLabel = nameLabel;
    }

    public JLabel getIdLabel()
    {
        return idLabel;
    }

    public void setIdLabel(JLabel idLabel)
    {
        this.idLabel = idLabel;
    }

    public JLabel getPriceLabel()
    {
        return priceLabel;
    }

    public void setPriceLabel(JLabel priceLabel)
    {
        this.priceLabel = priceLabel;
    }

    public JLabel getStockLabel()
    {
        return stockLabel;
    }

    public void setStockLabel(JLabel stockLabel)
    {
        this.stockLabel = stockLabel;
    }

    public JButton getBackButton()
    {
        return backButton;
    }
}
