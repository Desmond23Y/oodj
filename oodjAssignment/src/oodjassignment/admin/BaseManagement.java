package oodjassignment.admin;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.RowFilter;
import javax.swing.table.TableRowSorter;
import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class BaseManagement {

    protected DefaultTableModel model;
    protected TableRowSorter<DefaultTableModel> sorter; // Add this line
    protected String filePath;

    public BaseManagement(DefaultTableModel model, String filePath) {
        this.model = model;
        this.filePath = filePath;
        this.sorter = new TableRowSorter<>(model); // Correctly initialize the sorter
    }

    public TableRowSorter<DefaultTableModel> getSorter() {
        return sorter;
    }

    public void showDataFromFile() {
        model.setRowCount(0);
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] data = line.split(",");
                model.addRow(data);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void createRecord(String[] data) {
        if (data.length == 0) {
            JOptionPane.showMessageDialog(null, "Data is missing.");
            return;
        }
        String newRecord = String.join(",", data) + "\n";
        try (FileWriter writer = new FileWriter(filePath, true)) {
            writer.write(newRecord);
            JOptionPane.showMessageDialog(null, "Record created successfully.");
        } catch (IOException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "An error occurred while writing to the file.");
        }
        showDataFromFile();
    }

    public void updateRecord(int rowIndex, String[] data) {
        String updatedLine = String.join(",", data) + "\n";
        StringBuilder updatedFileContent = new StringBuilder();
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            int lineCount = 0;
            while ((line = br.readLine()) != null) {
                if (lineCount == rowIndex) {
                    updatedFileContent.append(updatedLine);
                } else {
                    updatedFileContent.append(line).append("\n");
                }
                lineCount++;
            }
        } catch (IOException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "An error occurred while reading the file.");
        }
        try (FileWriter writer = new FileWriter(filePath)) {
            writer.write(updatedFileContent.toString());
        } catch (IOException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "An error occurred while writing to the file.");
        }
        showDataFromFile();
    }

    public void deleteRecord(int rowIndex) {
        StringBuilder updatedFileContent = new StringBuilder();
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            int lineCount = 0;
            while ((line = br.readLine()) != null) {
                if (lineCount != rowIndex) {
                    updatedFileContent.append(line).append("\n");
                }
                lineCount++;
            }
        } catch (IOException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "An error occurred while reading the file.");
        }
        try (FileWriter writer = new FileWriter(filePath)) {
            writer.write(updatedFileContent.toString());
        } catch (IOException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "An error occurred while writing to the file.");
        }
        showDataFromFile();
    }

    public void search(String[] fieldValues, int[] columnIndices) {
        // Ensure fieldValues and columnIndices have the same length
        if (fieldValues.length != columnIndices.length) {
            throw new IllegalArgumentException("Field values and column indices arrays must have the same length.");
        }

        // Create a RowFilter for each column index and value
        List<RowFilter<DefaultTableModel, Object>> filters = new ArrayList<>();
        for (int i = 0; i < fieldValues.length; i++) {
            if (!fieldValues[i].isEmpty()) {
                filters.add(RowFilter.regexFilter(fieldValues[i], columnIndices[i]));
            }
        }

        // Combine filters into a compound filter
        RowFilter<DefaultTableModel, Object> compoundFilter = RowFilter.andFilter(filters);
        sorter.setRowFilter(compoundFilter);
    }
}
