package presentation;

import javax.swing.*;
import java.awt.*;

public class OperationsView2 extends JFrame
{
    private JPanel mainPanel;
    private JButton addButton;
    private JButton deleteButton;
    private JButton editButton;
    private JButton viewAllButton;
    private JLabel titleLabel;
    private JLabel picLabel;
    private JLabel selectLabel;
    private JButton backButton;

    public OperationsView2(String title) throws HeadlessException
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

    public JButton getDeleteButton()
    {
        return deleteButton;
    }

    public void setDeleteButton(JButton deleteButton)
    {
        this.deleteButton = deleteButton;
    }

    public JButton getEditButton()
    {
        return editButton;
    }

    public void setEditButton(JButton editButton)
    {
        this.editButton = editButton;
    }

    public JButton getViewAllButton()
    {
        return viewAllButton;
    }

    public void setViewAllButton(JButton viewAllButton)
    {
        this.viewAllButton = viewAllButton;
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

    public JButton getBackButton()
    {
        return backButton;
    }
}
