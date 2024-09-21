/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oodjassignment.scheduler;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Acer
 */
public class MTable {
    
    private static final String DATE_FORMAT = "dd MMMM yyyy"; // Correct date format

    public void addScheduleRecord(JComboBox<String> halltype, JComboBox<String> hall_no, JTextField start_date, JTextField end_date, JTextField time, JTextField duration, JTextField review, JTable maintenance) {
        // Check if any field is empty
        if (start_date.getText().equals("") || end_date.getText().equals("") || time.getText().equals("") || duration.getText().equals("") || review.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Please Enter All Data !");
            return;
        }

        // Validate date format
        if (!isValidDate(start_date.getText()) || !isValidDate(end_date.getText())) {
            JOptionPane.showMessageDialog(null, "Please enter the dates in the format: " + DATE_FORMAT);
            return;
        }

        // Process the duration
        String durationText = duration.getText().trim();
        if (isNumeric(durationText)) {
            durationText += " hours"; // Append "hours" if the input is just a number
        } else if (!durationText.endsWith(" hours")) {
            // Optionally handle cases where the input is invalid
            durationText += " hours"; // Append "hours" if it doesn't
        }

        // Add the data to the table model
        DefaultTableModel model = (DefaultTableModel) maintenance.getModel();
        String[] record = {
            (String) halltype.getSelectedItem(),
            (String) hall_no.getSelectedItem(),
            start_date.getText(),
            end_date.getText(),
            time.getText(),
            durationText, // Use the processed duration
            review.getText()
        };
        model.addRow(record);

        // Write the data to a file
        try (BufferedWriter bw = new BufferedWriter(new FileWriter("src\\\\oodjassignment\\\\database\\\\Schedule_maintenance.txt", true))) {
            String rec = (String) halltype.getSelectedItem() + "/" + (String) hall_no.getSelectedItem() + "/" + start_date.getText() + "/" + end_date.getText() + "/" + time.getText() + "/" + durationText + "/" + review.getText();
            bw.write(rec + "\n");
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, "Something Went Wrong: " + ex.getMessage());
        }
    }

    // Method to validate date format
    private boolean isValidDate(String dateStr) {
        SimpleDateFormat sdf = new SimpleDateFormat(DATE_FORMAT);
        sdf.setLenient(false); // Set lenient to false to strictly parse the date
        try {
            sdf.parse(dateStr);
            return true; // Date format is valid
        } catch (ParseException e) {
            return false; // Invalid date format
        }
    }

    // Method to check if a string is numeric
    private boolean isNumeric(String str) {
        return str.matches("\\d+"); // Matches one or more digits
    }
    
     public void EditSelectedRowData(JComboBox<String> halltype, JComboBox<String> hall_no, JTextField start_date, JTextField end_date, JTextField time, JTextField duration, JTextField review, JTable maintenance) {
        DefaultTableModel model = (DefaultTableModel) maintenance.getModel();

        // Check if a row is selected before loading data
        int selectedRow = maintenance.getSelectedRow();
        if (selectedRow == -1) {
            return;  // No row selected
        }

        // Set the form fields with the data from the selected row
        halltype.setSelectedItem(model.getValueAt(selectedRow, 0).toString());
        hall_no.setSelectedItem(model.getValueAt(selectedRow, 1).toString());
        start_date.setText(model.getValueAt(selectedRow, 2).toString());
        end_date.setText(model.getValueAt(selectedRow, 3).toString());
        time.setText(model.getValueAt(selectedRow, 4).toString());
        duration.setText(model.getValueAt(selectedRow, 5).toString());
        review.setText(model.getValueAt(selectedRow, 6).toString());
    }
     
     public void updateScheduleRecord(JComboBox<String> halltype, JComboBox<String> hall_no, JTextField start_date, JTextField end_date, JTextField time, JTextField duration, JTextField review, JTable maintenance) {
        DefaultTableModel model = (DefaultTableModel) maintenance.getModel();
        
        // Get the selected row index
        int selectedRow = maintenance.getSelectedRow();
        if (selectedRow == -1) {
            JOptionPane.showMessageDialog(null, "Please select a row to update.");
            return;
        }

        // Update the table model with new data
        model.setValueAt(halltype.getSelectedItem(), selectedRow, 0);
        model.setValueAt(hall_no.getSelectedItem(), selectedRow, 1);
        model.setValueAt(start_date.getText(), selectedRow, 2);
        model.setValueAt(end_date.getText(), selectedRow, 3);
        model.setValueAt(time.getText(), selectedRow, 4);
        model.setValueAt(duration.getText(), selectedRow, 5);
        model.setValueAt(review.getText(), selectedRow, 6);

        // Write the updated table data to the file
        try (BufferedWriter bw = new BufferedWriter(new FileWriter("src\\\\oodjassignment\\\\database\\\\Schedule_maintenance.txt"))) {
            for (int i = 0; i < model.getRowCount(); i++) {
                String rec = model.getValueAt(i, 0).toString() + "/" +
                             model.getValueAt(i, 1).toString() + "/" +
                             model.getValueAt(i, 2).toString() + "/" +
                             model.getValueAt(i, 3).toString() + "/" +
                             model.getValueAt(i, 4).toString() + "/" +
                             model.getValueAt(i, 5).toString() + "/" +
                             model.getValueAt(i, 6).toString();
                bw.write(rec + "\n");
            }
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, "Something went wrong: " + ex.getMessage());
        }
    }
     
     public void removeScheduleRecord(JTable maintenance) {
        DefaultTableModel model = (DefaultTableModel) maintenance.getModel();
        
        // Get the selected row index
        int selectedRow = maintenance.getSelectedRow();
        if (selectedRow == -1) {
            JOptionPane.showMessageDialog(null, "Please select a row to delete.");
            return;
        }

        // Remove the selected row
        model.removeRow(selectedRow);

        // Write the updated table data to the file
        try (BufferedWriter bw = new BufferedWriter(new FileWriter("src\\\\oodjassignment\\\\database\\\\Schedule_maintenance.txt"))) {
            for (int i = 0; i < model.getRowCount(); i++) {
                String rec = model.getValueAt(i, 0).toString() + "/" +
                             model.getValueAt(i, 1).toString() + "/" +
                             model.getValueAt(i, 2).toString() + "/" +
                             model.getValueAt(i, 3).toString() + "/" +
                             model.getValueAt(i, 4).toString() + "/" +
                             model.getValueAt(i, 5).toString() + "/" +
                             model.getValueAt(i, 6).toString();
                bw.write(rec + "\n");
            }
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, "Something went wrong: " + ex.getMessage());
        }
    }
}
