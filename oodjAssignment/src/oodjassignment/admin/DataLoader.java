package oodjassignment.admin;

import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class DataLoader {

    public void loadTableData(JTable table, String fileName) {
        DefaultTableModel model = (DefaultTableModel) table.getModel();
        model.setRowCount(0);  // Clear the table before loading new data

        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] data = line.split(","); // Assuming data is comma-separated
                model.addRow(data);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
