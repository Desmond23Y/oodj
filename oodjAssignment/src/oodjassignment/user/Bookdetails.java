/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package oodjassignment.user;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;


public class Bookdetails {
    private final String filePath = "src/oodjassignment/database/Booking.txt";

    public void loadBookings(DefaultTableModel model) {
        File file = new File(filePath);
        try {
            BufferedReader br = new BufferedReader(new FileReader(file));
            model.setRowCount(0);  // Clear existing rows
            String line;
            while ((line = br.readLine()) != null) {
                String[] dataRow = line.split("/");
                model.addRow(dataRow);
            }
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, "Error loading bookings: " + ex.getMessage());
        }
    }
    
    public static void select(JTable table, JTextField bkid, JTextField customer, JTextField type, JTextField no) {
        DefaultTableModel model = (DefaultTableModel) table.getModel();
        int selectedRow = table.getSelectedRow();
        if (selectedRow != -1) { // Ensure there is a selected row
            bkid.setText(model.getValueAt(selectedRow, 0).toString());
            customer.setText(model.getValueAt(selectedRow, 1).toString());
            type.setText(model.getValueAt(selectedRow, 2).toString());
            no.setText(model.getValueAt(selectedRow, 3).toString());
        } else {
            JOptionPane.showMessageDialog(null, "Please select a row.");
        }
    }

    public void updateBookingRequest(DefaultTableModel model, int selectedRow, String reason) {
        List<String> lines = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] columns = line.split("/");
                if (columns[0].equals(model.getValueAt(selectedRow, 0).toString())) {
                    columns[8] = "Request for cancel";
                    columns[9] = reason;
                    line = String.join("/", columns);
                }
                lines.add(line);
            }
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, "Error reading booking data: " + ex.getMessage());
            return;
        }

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(filePath))) {
            for (String line : lines) {
                bw.write(line + "\n");
            }
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, "Error saving booking data: " + ex.getMessage());
        }
    }
}
