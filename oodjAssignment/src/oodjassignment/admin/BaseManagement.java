package oodjassignment.admin;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.io.*;
import java.util.*;
import javax.swing.table.TableRowSorter;

public class BaseManagement {

    private Map<String, String> filePaths;

    public BaseManagement() {
        filePaths = new HashMap<>();
        filePaths.put("User", "src/oodjassignment/database/User.txt");
        filePaths.put("Scheduler", "src/oodjassignment/database/Scheduler.txt");
        filePaths.put("Administrator", "src/oodjassignment/database/Administrator.txt");
        filePaths.put("Manager", "src/oodjassignment/database/Manager.txt");
    }
    
    public void DisplayToTextFields(JTable table, int row, JTextField tfId, JTextField tfName,
                                   JTextField tfPhone, JTextField tfEmail, JTextField tfPassword,
                                   JComboBox<String> cbStatus) {
        DefaultTableModel model = (DefaultTableModel) table.getModel();

        tfId.setText(model.getValueAt(row, 0).toString());
        tfName.setText(model.getValueAt(row, 1).toString());
        tfPhone.setText(model.getValueAt(row, 2).toString());
        tfEmail.setText(model.getValueAt(row, 3).toString());

        // Set the password field; this is the last column for 'User' table
        if (table.getName().equals("User")) {
            tfPassword.setText(model.getValueAt(row, 4).toString());
            cbStatus.setSelectedItem(model.getValueAt(row, 5).toString());
        } else {
            tfPassword.setText(model.getValueAt(row, 4).toString());
        }
    }

    public void createAccount(JTable table, String[] data) {
        DefaultTableModel model = (DefaultTableModel) table.getModel();
        model.addRow(data);
        saveToFile(table);
    }

    public void updateAccount(JTable table, int row, String[] data) {
        DefaultTableModel model = (DefaultTableModel) table.getModel();
        int columnCount = model.getColumnCount();
        for (int i = 0; i < Math.min(data.length, columnCount); i++) {
            model.setValueAt(data[i], row, i);
        }
        saveToFile(table);
    }

    public void deleteAccount(JTable table, int row) {
        DefaultTableModel model = (DefaultTableModel) table.getModel();
        model.removeRow(row);
        saveToFile(table);
    }

    public void searchAccounts(JTable table, String[] fieldValues, int[] columnIndices) {
        DefaultTableModel model = (DefaultTableModel) table.getModel();
        TableRowSorter<DefaultTableModel> sorter = new TableRowSorter<>(model);
        table.setRowSorter(sorter);

        RowFilter<DefaultTableModel, Object> filter = new RowFilter<DefaultTableModel, Object>() {
            @Override
            public boolean include(Entry<? extends DefaultTableModel, ? extends Object> entry) {
                for (int i = 0; i < fieldValues.length; i++) {
                    String cellValue = (String) entry.getValue(columnIndices[i]);
                    if (!cellValue.contains(fieldValues[i])) {
                        return false;
                    }
                }
                return true;
            }
        };
        sorter.setRowFilter(filter);
    }

    private void saveToFile(JTable table) {
        String tableName = table.getName();
        String filePath = filePaths.get(tableName);

        if (filePath != null) {
            try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))) {
                DefaultTableModel model = (DefaultTableModel) table.getModel();
                for (int row = 0; row < model.getRowCount(); row++) {
                    StringBuilder sb = new StringBuilder();
                    for (int col = 0; col < model.getColumnCount(); col++) {
                        sb.append(model.getValueAt(row, col)).append(",");
                    }
                    writer.write(sb.toString().replaceAll(",$", "") + "\n");
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        } else {
            System.err.println("No file path found for table: " + tableName);
        }
    }
}
