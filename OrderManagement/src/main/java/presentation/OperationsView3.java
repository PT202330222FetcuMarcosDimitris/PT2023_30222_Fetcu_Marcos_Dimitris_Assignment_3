package presentation;

import javax.swing.*;
import java.awt.*;

public class OperationsView3 extends JFrame
{
    private JPanel mainPanel;
    private JButton addButton;
    private JLabel titleLabel;
    private JLabel picLabel;
    private JLabel selectLabel;
    private JButton viewAllButton;
    private JButton backButton;

    public OperationsView3(String title) throws HeadlessException
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

    public JButton getAddButton()
    {
        return addButton;
    }

    public void setAddButton(JButton addButton)
    {
        this.addButton = addButton;
    }

    public JLabel getTitleLabel()
    {
        return titleLabel;
    }

    public void setTitleLabel(JLabel titleLabel)
    {
        this.titleLabel = titleLabel;
    }

    public JLabel getPicLabel()
    {
        return picLabel;
    }

    public void setPicLabel(JLabel picLabel)
    {
        this.picLabel = picLabel;
    }

    public JLabel getSelectLabel()
    {
        return selectLabel;
    }

    public void setSelectLabel(JLabel selectLabel)
    {
        this.selectLabel = selectLabel;
    }

    public JButton getViewAllButton()
    {
        return viewAllButton;
    }

    public void setViewAllButton(JButton viewAllButton)
    {
        this.viewAllButton = viewAllButton;
    }

    public JButton getBackButton()
    {
        return backButton;
    }
}
