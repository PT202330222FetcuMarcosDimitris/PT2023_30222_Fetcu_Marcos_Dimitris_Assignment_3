package presentation;

import javax.swing.*;
import java.awt.*;

public class OperationsView extends JFrame
{
    private JPanel mainPanel;
    private JLabel titleLabel;
    private JLabel picLabel;
    private JLabel selectLabel;
    private JButton deleteButton;
    private JButton viewButton;
    private JButton addButton;
    private JButton editButton;
    private JButton backButton;

    public OperationsView(String title) throws HeadlessException
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

    public JButton getDeleteButton()
    {
        return deleteButton;
    }

    public void setDeleteButton(JButton deleteButton)
    {
        this.deleteButton = deleteButton;
    }

    public JButton getViewButton()
    {
        return viewButton;
    }

    public void setViewButton(JButton viewButton)
    {
        this.viewButton = viewButton;
    }

    public JButton getAddButton()
    {
        return addButton;
    }

    public void setAddButton(JButton addButton)
    {
        this.addButton = addButton;
    }

    public JButton getEditButton()
    {
        return editButton;
    }

    public void setEditButton(JButton editButton)
    {
        this.editButton = editButton;
    }

    public JButton getBackButton()
    {
        return backButton;
    }
}
