package serg;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MyJFrame extends JFrame {
    private final Color menuBg = new Color(51, 51, 54);
    private final Color menuSelected = new Color(68, 68, 68);
    private final Color panelBg = new Color(34, 34, 38);


    private final Font menuElFont = new Font("Impact", Font.PLAIN, 20);
    private final Font menuSubElFont = new Font("Impact", Font.PLAIN, 14);


    private JLabel label1;
    private JLabel label2;

    public MyJFrame(String title) {
        super(title);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setSize(1000, 400);
        setLocationRelativeTo(null);

        buildMenu();
        buildPanel();

        setVisible(true);
    }

    private void buildPanel() {
        JPanel panel = new JPanel();
        panel.setBackground(panelBg);
        panel.setLayout(new GridLayout());
        label1 = new JLabel("Label 1!", SwingConstants.CENTER);
        label2 = new JLabel("Label 2!", SwingConstants.CENTER);
        label1.setForeground(Color.WHITE);
        label2.setForeground(Color.WHITE);
        label1.setFont(new Font("Impact", Font.PLAIN, 10));
        label2.setFont(new Font("Impact", Font.PLAIN, 10));

        panel.add(label1);
        panel.add(label2);
        add(panel);
    }

    private void buildMenu() {
        JMenuBar menuBar = new JMenuBar();
        menuBar.setBackground(menuBg);
        //menubar.setBorder(new BevelBorder(BevelBorder.LOWERED, menuBg, menuBg));
        menuBar.setBorderPainted(false);

        JMenu fontMenu = new JMenu("Fonts");
        JMenu m1 = new JMenu("Label-1");
        JMenu m2 = new JMenu("Label-2");

        m1.setBackground(menuBg);
        m1.setForeground(Color.BLACK);
        m1.setBorderPainted(false);
        m1.setFont(menuSubElFont);
        m2.setBackground(menuBg);
        m2.setForeground(Color.BLACK);
        m2.setBorderPainted(false);
        m2.setFont(menuSubElFont);

        addFontItems(m1, m2);

        fontMenu.setBackground(menuBg);
        fontMenu.setForeground(Color.WHITE);
        fontMenu.setBorderPainted(false);
        fontMenu.setFont(menuElFont);

        fontMenu.add(m1);
        fontMenu.add(m2);

        menuBar.add(fontMenu);
        setJMenuBar(menuBar);
    }

    private void addFontItems(JMenu m1, JMenu m2) {
        //String[] fonts = GraphicsEnvironment.getLocalGraphicsEnvironment().getAvailableFontFamilyNames();
        JMenuItem mi1;
        JMenuItem mi2;

        for (int i = 0; i < 80; i+=5) {
            int currentI = i;
            mi1 = new JMenuItem(i + "sp");
            mi2 = new JMenuItem(i + "sp");

            mi1.setFont(new Font("Impact", Font.PLAIN, 14));
            mi1.addMouseListener(new MouseAdapter() {
                @Override
                public void mousePressed(MouseEvent e) {
                    label1.setFont(new Font("Impact", Font.PLAIN, currentI));
                }
            });

            mi2.setFont(new Font("Impact", Font.PLAIN, 14));
            mi2.addMouseListener(new MouseAdapter() {
                @Override
                public void mousePressed(MouseEvent e) {
                    label2.setFont(new Font("Impact", Font.PLAIN, currentI));
                }
            });

            m1.add(mi1);
            m2.add(mi2);
        }
    }
}
