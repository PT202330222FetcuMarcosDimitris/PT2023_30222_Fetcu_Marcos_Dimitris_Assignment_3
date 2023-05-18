package presentation;

import javax.swing.*;
import java.awt.*;

public class DeleteClientView extends JFrame
{
    private JPanel mainPanel;
    private JLabel titleLabel;
    private JTextField idText;
    private JLabel idLabel;
    private JButton OKButton;
    private JButton backButton;

    public DeleteClientView(String title) throws HeadlessException
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

    public JLabel getIdLabel()
    {
        return idLabel;
    }

    public void setIdLabel(JLabel idLabel)
    {
        this.idLabel = idLabel;
    }

    public JButton getOKButton()
    {
        return OKButton;
    }

    public void setOKButton(JButton OKButton)
    {
        this.OKButton = OKButton;
    }

    public JButton getBackButton()
    {
        return backButton;
    }
}
