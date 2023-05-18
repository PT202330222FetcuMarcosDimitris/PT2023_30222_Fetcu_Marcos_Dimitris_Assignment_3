package presentation;

import javax.swing.*;
import java.awt.*;

public class ViewAllView2 extends JFrame
{
    private JPanel mainPanel;
    private JLabel titleLabel;
    private JScrollPane scroll;
    private JTable table;
    private JButton backButton;

    public ViewAllView2(String title) throws HeadlessException
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

    public JScrollPane getScroll()
    {
        return scroll;
    }

    public void setScroll(JScrollPane scroll)
    {
        this.scroll = scroll;
    }

    public JTable getTable()
    {
        return table;
    }

    public void setTable(JTable table)
    {
        this.table = table;
    }

    public JButton getBackButton()
    {
        return backButton;
    }
}
