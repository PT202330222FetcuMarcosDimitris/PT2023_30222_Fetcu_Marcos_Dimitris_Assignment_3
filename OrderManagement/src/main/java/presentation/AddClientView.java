package presentation;

import javax.swing.*;

public class AddClientView extends JFrame
{
    private JPanel mainPanel;
    private JTextField idText;
    private JTextField nameText;
    private JTextField emailText;
    private JTextField phoneText;
    private JTextField addressText;
    private JLabel idLabel;
    private JLabel nameLabel;
    private JLabel emailLabel;
    private JLabel phoneLabel;
    private JLabel addressLabel;
    private JButton okButon;
    private JButton backButton;

    public AddClientView(String title)
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

    public JTextField getEmailText()
    {
        return emailText;
    }

    public void setEmailText(JTextField emailText)
    {
        this.emailText = emailText;
    }

    public JTextField getPhoneText()
    {
        return phoneText;
    }

    public void setPhoneText(JTextField phoneText)
    {
        this.phoneText = phoneText;
    }

    public JTextField getAddressText()
    {
        return addressText;
    }

    public void setAddressText(JTextField addressText)
    {
        this.addressText = addressText;
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

    public JLabel getEmailLabel()
    {
        return emailLabel;
    }

    public void setEmailLabel(JLabel emailLabel)
    {
        this.emailLabel = emailLabel;
    }

    public JLabel getPhoneLabel()
    {
        return phoneLabel;
    }

    public void setPhoneLabel(JLabel phoneLabel)
    {
        this.phoneLabel = phoneLabel;
    }

    public JLabel getAddressLabel()
    {
        return addressLabel;
    }

    public void setAddressLabel(JLabel addressLabel)
    {
        this.addressLabel = addressLabel;
    }

    public JButton getOkButon()
    {
        return okButon;
    }

    public JButton getBackButton()
    {
        return backButton;
    }

    public void setOkButon(JButton okButon)
    {
        this.okButon = okButon;
    }
}
