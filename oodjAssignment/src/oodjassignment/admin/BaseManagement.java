package oodjassignment.admin;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.RowFilter;
import javax.swing.table.TableRowSorter;
import java.util.ArrayList;
import java.util.List;

public class BaseManagement {

    protected DefaultTableModel model;
    protected TableRowSorter<DefaultTableModel> sorter;
    protected DataHandling dataHandler;  // Reference to DataHandling class

    public BaseManagement(DefaultTableModel model, String filePath) {
        this.model = model;
        this.sorter = new TableRowSorter<>(model);
        this.dataHandler = new DataHandling(filePath); // Initialize DataHandling with file path
    }

    public TableRowSorter<DefaultTableModel> getSorter() {
        return sorter;
    }

    public void showAccountsFromFile() {
        model.setRowCount(0);
        List<String[]> data = dataHandler.readData(); // Use DataHandling to read data

        if (data != null) {
            for (String[] row : data) {
                model.addRow(row); // Populate the table with the data
            }
        } else {
            JOptionPane.showMessageDialog(null, "No accounts available.");
        }
    }

    public void createAccount(String[] data) {
        if (data.length == 0) {
            JOptionPane.showMessageDialog(null, "Account data is missing.");
            return;
        }

        try {
            if (dataHandler.writeData(data)) {  // Ensure writeData returns a boolean
                JOptionPane.showMessageDialog(null, "Account created successfully.");
                showAccountsFromFile();
            } else {
                JOptionPane.showMessageDialog(null, "An error occurred while writing to the file.");
            }
        } catch (Exception e) {  // Corrected Exception handling
            JOptionPane.showMessageDialog(null, "An error occurred while writing to the file.");
            e.printStackTrace();
        }
    }

    public void updateAccount(int rowIndex, String[] data) {
        if (dataHandler.updateData(rowIndex, data)) {  // Use DataHandling to update data
            JOptionPane.showMessageDialog(null, "Account updated successfully.");
            showAccountsFromFile();
        } else {
            JOptionPane.showMessageDialog(null, "An error occurred while updating the file.");
        }
    }

    public void deleteAccount(int rowIndex) {
        if (dataHandler.deleteData(rowIndex)) {  // Use DataHandling to delete data
            JOptionPane.showMessageDialog(null, "Account deleted successfully.");
            showAccountsFromFile();
        } else {
            JOptionPane.showMessageDialog(null, "An error occurred while deleting the account.");
        }
    }

    public void searchAccounts(String[] fieldValues, int[] columnIndices) {
        if (fieldValues.length != columnIndices.length) {
            throw new IllegalArgumentException("Field values and column indices arrays must have the same length.");
        }

        List<RowFilter<DefaultTableModel, Object>> filters = new ArrayList<>();
        for (int i = 0; i < fieldValues.length; i++) {
            if (!fieldValues[i].isEmpty()) {
                filters.add(RowFilter.regexFilter(fieldValues[i], columnIndices[i]));
            }
        }

        RowFilter<DefaultTableModel, Object> compoundFilter = RowFilter.andFilter(filters);
        sorter.setRowFilter(compoundFilter);
    }
}
