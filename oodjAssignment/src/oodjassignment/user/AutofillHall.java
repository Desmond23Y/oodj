/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oodjassignment.user;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class AutofillHall {
    
    public void loadSchedule(javax.swing.JTable Aschedule) {
        String filePath = "src\\\\oodjassignment\\\\database\\\\Schedule.txt";
        File file = new File(filePath);

        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            // Get the table model from the JTable
            DefaultTableModel model = (DefaultTableModel) Aschedule.getModel();

            // Clear existing rows in the table model to prevent duplication
            model.setRowCount(0);

            // Read each line from the file and add it to the table model
            String line;
            while ((line = br.readLine()) != null) {
                String[] dataRow = line.split("/"); // Adjust the delimiter if necessary
                model.addRow(dataRow);
            }
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, "Something went wrong: " + ex.getMessage());
        }
    }

    // Get the customer ID from cookie file
    public static String getCustomerID() {
        try (BufferedReader reader = new BufferedReader(new FileReader("src/oodjassignment/database/cookie.txt"))) {
            String line;
            if ((line = reader.readLine()) != null) {
                String[] userData = line.split(",");
                if (userData.length == 7) {
                    return userData[0]; // Assuming CustomerID is the first value in userData
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error loading Customer ID.");
        }
        return null;
    }
    
        public void autofillFields(JTable scheduleTable, JTextField type, JTextField no, JTextField price, 
                                    JTextField date, JTextField time, JTextField duration, JTextField remark) {
            int selectedRow = scheduleTable.getSelectedRow(); // Get the selected row from the schedule table

            if (selectedRow != -1) {
                DefaultTableModel model = (DefaultTableModel) scheduleTable.getModel();

                // Autofill the fields with the selected schedule details
                type.setText(model.getValueAt(selectedRow, 0).toString());
                no.setText(model.getValueAt(selectedRow, 1).toString());
                price.setText(model.getValueAt(selectedRow, 2).toString());
                date.setText(model.getValueAt(selectedRow, 3).toString());
                time.setText(model.getValueAt(selectedRow, 4).toString());
                duration.setText(model.getValueAt(selectedRow, 5).toString());
                remark.setText(model.getValueAt(selectedRow, 7).toString()); // Adjust index if needed
            } else {
                JOptionPane.showMessageDialog(null, "Please select a schedule first.", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
}
