package presentation;

import javax.swing.*;
import java.awt.*;

public class DeleteProductView extends JFrame
{
    private JPanel mainPanel;
    private JLabel titleLabel;
    private JTextField idText;
    private JButton OKButton;
    private JLabel idLabel;
    private JButton backButton;

    public DeleteProductView(String title) throws HeadlessException
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

    public JButton getOKButton()
    {
        return OKButton;
    }

    public void setOKButton(JButton OKButton)
    {
        this.OKButton = OKButton;
    }

    public JLabel getIdLabel()
    {
        return idLabel;
    }

    public void setIdLabel(JLabel idLabel)
    {
        this.idLabel = idLabel;
    }

    public JButton getBackButton()
    {
        return backButton;
    }
}
