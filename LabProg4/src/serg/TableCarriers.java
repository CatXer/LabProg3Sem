package serg;


// Пример работы со стандартной моделью таблицы JTable

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableCellRenderer;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;

public class TableCarriers extends JFrame {
    // Модель данных таблицы
    private DefaultTableModel tableModel;
    private JTable table1;
    private ArrayList<Carrier> carriers = new ArrayList<>();

    private JTextField tfId;
    private JTextField tfType;
    private JTextField tfName;
    private JTextField tfTrack;
    private JTextField tfVolume;
    private JCheckBox chGlobal;
    // Заголовки столбцов
    private Object[] columnsHeader = new String[]{"id", "type", "name", "track id", "volume(m^3)", "global"};

    public TableCarriers() {
        super("Carriers");
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        // Создание стандартной модели
        tableModel = new DefaultTableModel();
        // Определение столбцов

        tableModel.setColumnIdentifiers(columnsHeader);
        // Создание таблицы на основании модели данных
        table1 = new JTable(tableModel) {
            private static final long serialVersionUID = 1L;

            @Override
            public Component prepareRenderer(TableCellRenderer renderer, int row, int column) {

                Component component = super.prepareRenderer(renderer, row, column);

                switch (column) {
                    case 0:
                        component.setBackground(Color.gray);
                        break;
                    case 1:
                        component.setBackground(Color.GREEN);
                        break;
                    case 2:
                        component.setBackground(Color.RED);
                        break;
                    case 3:
                        component.setBackground(Color.WHITE);
                        break;
                    case 4:
                        component.setBackground(Color.YELLOW);
                        break;
                    case 5:
                        if (Boolean.parseBoolean(table1.getValueAt(row, column).toString()))
                            component.setBackground(Color.GREEN);
                        break;

                }
                return component;
            }

            @Override
            public Class getColumnClass(int column) {
                switch (column) {
                    case 0:
                        return Integer.class;
                    case 1:
                    case 2:
                    case 3:
                        return String.class;
                    case 4:
                        return Double.class;
                    default:
                        return Boolean.class;
                }
            }
        };

        // Создание кнопки добавления строки таблицы
        JButton add = new JButton("Добавить");
        add.addActionListener(e ->

        {
            Carrier carrier = new Carrier(Integer.parseInt(tfId.getText()), tfType.getText(), tfName.getText(), tfTrack.getText(), Double.parseDouble(tfVolume.getText()), chGlobal.isSelected());
            addRow(carrier);
        });
        // Создание кнопки удаления строки таблицы
        JButton remove = new JButton("Удалить");
        remove.addActionListener(e -> {
            // Номер выделенной строки
            int idx = table1.getSelectedRow();
            // Удаление выделенной строки
            if (idx == -1) {
                idx = table1.getRowCount() - 1;
            }
            if (idx >= 0)
                tableModel.removeRow(idx);
        });

        // Формирование интерфейса
        Box contents = new Box(BoxLayout.Y_AXIS);
        contents.add(new

                JScrollPane(table1));

        getContentPane().

                add(contents);


        JPanel controls = new JPanel();

        tfId = new

                JTextField(8);
        tfId.addKeyListener(new

                                    KeyAdapter() {
                                        public void keyTyped(KeyEvent e) {
                                            char c = e.getKeyChar();
                                            if (((c < '0') || (c > '9')) && (c != KeyEvent.VK_BACK_SPACE)) {
                                                e.consume(); // consume non-numbers
                                            }
                                        }
                                    });


        tfType = new

                JTextField(8);

        tfName = new

                JTextField(10);

        tfTrack = new

                JTextField(8);

        tfVolume = new

                JTextField(8);
        tfVolume.addKeyListener(new

                                        KeyAdapter() {
                                            public void keyTyped(KeyEvent e) {
                                                char c = e.getKeyChar();
                                                if (((c < '0') || (c > '9')) && (c != KeyEvent.VK_BACK_SPACE)) {
                                                    e.consume(); // consume non-numbers
                                                }
                                            }
                                        });
        chGlobal = new

                JCheckBox();

        controls.add(tfId);
        controls.add(tfType);
        controls.add(tfName);
        controls.add(tfTrack);
        controls.add(tfVolume);
        controls.add(chGlobal);
        controls.add(add);
        controls.add(remove);

        getContentPane().

                add(controls, "South");
        // Вывод окна на экран

        pack();

        setLocationRelativeTo(null);

        setVisible(true);
    }

    private void addRow(Carrier carrier) {
        carriers.add(carrier);
        tableModel.addRow(new Object[]{carrier.getId(), carrier.getType(), carrier.getName(), carrier.getTrackId(), carrier.getVolume(), carrier.isGlobal()});
    }


    public static void main(String[] args) {
        new TableCarriers();
    }

}