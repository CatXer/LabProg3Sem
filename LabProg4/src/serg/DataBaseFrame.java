package serg;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class DataBaseFrame extends JFrame {


    private ArrayList<Carrier> carriers = new ArrayList<>();

    private JPanel controlPanel;
    private JTable table;


    public DataBaseFrame() {
        super("Test SQL");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        setSize(800, 600);
        setLayout(new BorderLayout());

        buildTablePanel();
        buildControlPanel();

        pack();
        setLocationRelativeTo(null);

        setVisible(true);
    }


    private void buildTablePanel() {
        table = new JTable(10, 6);
        table.setGridColor(Color.BLUE);
        //table.
        add(table, BorderLayout.CENTER);
    }

    private void buildControlPanel() {
        controlPanel = new JPanel();
        controlPanel.setBackground(Color.GREEN);
        add(controlPanel, BorderLayout.SOUTH);
    }


}
