package presentation;

import javax.swing.*;
import java.awt.*;

public class EditProductView extends JFrame
{
    private JPanel mainPanel;
    private JLabel titleLabel;
    private JTextField idText;
    private JTextField nameText;
    private JTextField priceText;
    private JTextField quantityText;
    private JLabel idLabel;
    private JLabel nameLabel;
    private JLabel priceLabel;
    private JLabel quantityLabel;
    private JButton okButton;
    private JButton backButton;

    public EditProductView(String title) throws HeadlessException
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

    public JLabel getTitleLabel()
    {
        return titleLabel;
    }

    public void setTitleLabel(JLabel titleLabel)
    {
        this.titleLabel = titleLabel;
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

    public JTextField getQuantityText()
    {
        return quantityText;
    }

    public void setQuantityText(JTextField quantityText)
    {
        this.quantityText = quantityText;
    }

    public JLabel getIdLabel()
    {
        return idLabel;
    }

    public void setIdLabel(JLabel idLabel)
    {
        this.idLabel = idLabel;
    }

    public JLabel getNameLabel()
    {
        return nameLabel;
    }

    public void setNameLabel(JLabel nameLabel)
    {
        this.nameLabel = nameLabel;
    }

    public JLabel getPriceLabel()
    {
        return priceLabel;
    }

    public void setPriceLabel(JLabel priceLabel)
    {
        this.priceLabel = priceLabel;
    }

    public JLabel getQuantityLabel()
    {
        return quantityLabel;
    }

    public void setQuantityLabel(JLabel quantityLabel)
    {
        this.quantityLabel = quantityLabel;
    }

    public JButton getOkButton()
    {
        return okButton;
    }

    public void setOkButton(JButton okButton)
    {
        this.okButton = okButton;
    }

    public JButton getBackButton()
    {
        return backButton;
    }
}
