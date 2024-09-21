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
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Acer
 */
public class ATable {
    
    
    public void editSchedule(DefaultTableModel model, JComboBox<String> halltype, JComboBox<String> hall_no, JTextField Price, JTextField Date, JTextField time, JTextField duration, JComboBox<String> status, JTextField Remarks, JTable Aschedule) {
        halltype.setSelectedItem(model.getValueAt(Aschedule.getSelectedRow(), 0).toString());
        hall_no.setSelectedItem(model.getValueAt(Aschedule.getSelectedRow(), 1).toString());
        Price.setText(model.getValueAt(Aschedule.getSelectedRow(), 2).toString());
        Date.setText(model.getValueAt(Aschedule.getSelectedRow(), 3).toString());
        time.setText(model.getValueAt(Aschedule.getSelectedRow(), 4).toString());
        duration.setText(model.getValueAt(Aschedule.getSelectedRow(), 5).toString());
        status.setSelectedItem(model.getValueAt(Aschedule.getSelectedRow(), 6).toString());
        Remarks.setText(model.getValueAt(Aschedule.getSelectedRow(), 7).toString());
    }   
    
    private static final String DATE_FORMAT = "dd MMMM yyyy"; // Define the expected date format

    public void addSchedule(JTextField Remarks, JTextField Date, JTextField Price, JTextField time, JTextField duration, JComboBox<String> halltype, JComboBox<String> hall_no, JComboBox<String> status, JTable Aschedule) {
        // Check for empty fields
        if (Remarks.getText().equals("") || Date.getText().equals("") || Price.getText().equals("") || time.getText().equals("") || duration.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Please Enter All Data !");
            return;
        }

        // Validate the date format
        if (!isValidDate(Date.getText())) {
            JOptionPane.showMessageDialog(null, "Please enter the date in the format: " + DATE_FORMAT);
            return;
        }

        // Process the duration
        String durationText = duration.getText().trim();
        if (isNumeric(durationText)) {
            durationText += " hours"; // Append "hours" if the input is just a number
        }

        // Add the data to the table model
        DefaultTableModel model = (DefaultTableModel) Aschedule.getModel();
        String[] record = {
            (String) halltype.getSelectedItem(),
            (String) hall_no.getSelectedItem(),
            Price.getText(),
            Date.getText(),
            time.getText(),
            durationText, // Use the processed duration
            (String) status.getSelectedItem(),
            Remarks.getText()
        };
        model.addRow(record);

        // Write the data to a file
        try (BufferedWriter bw = new BufferedWriter(new FileWriter("src\\\\oodjassignment\\\\database\\\\Schedule.txt", true))) {
            String rec = halltype.getSelectedItem() + "/" + hall_no.getSelectedItem() + "/" + Price.getText() + "/" + Date.getText() + "/" + time.getText() + "/" + durationText + "/" + status.getSelectedItem() + "/" + Remarks.getText();
            bw.write(rec + "\n");
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, "Something Wrong: " + ex.getMessage());
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
    
    public void deleteSchedule(JTable Aschedule) {
        DefaultTableModel model = (DefaultTableModel) Aschedule.getModel();
        if (Aschedule.getSelectedRow() == -1) {
            JOptionPane.showMessageDialog(null, "No row selected!");
            return;
        }
        
        model.removeRow(Aschedule.getSelectedRow());
        int tablelist = model.getRowCount();

        try (BufferedWriter bw = new BufferedWriter(new FileWriter("src\\\\oodjassignment\\\\database\\\\Schedule.txt"))) {
            for (int i = 0; i < tablelist; i++) {
                String rec = model.getValueAt(i, 0).toString() + "/" + model.getValueAt(i, 1).toString() + "/" + model.getValueAt(i, 2).toString() + "/" + model.getValueAt(i, 3).toString() + "/" + model.getValueAt(i, 4).toString() + "/" + model.getValueAt(i, 5).toString() + "/" + model.getValueAt(i, 6).toString() + "/" + model.getValueAt(i, 7).toString();
                bw.write(rec + "\n");
            }
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, "Something went wrong");
        }
    }
    
    public void updateSchedule(JTable Aschedule, JComboBox<String> halltype, JComboBox<String> hall_no, JTextField Price, JTextField Date, JTextField time, JTextField duration, JComboBox<String> status, JTextField Remarks) {
        DefaultTableModel model = (DefaultTableModel) Aschedule.getModel();
        int selectedRow = Aschedule.getSelectedRow();
        
        if (selectedRow == -1) {
            JOptionPane.showMessageDialog(null, "No row selected!");
            return;
        }

        model.setValueAt(halltype.getSelectedItem(), selectedRow, 0);
        model.setValueAt(hall_no.getSelectedItem(), selectedRow, 1);
        model.setValueAt(Price.getText(), selectedRow, 2);
        model.setValueAt(Date.getText(), selectedRow, 3);
        model.setValueAt(time.getText(), selectedRow, 4);
        model.setValueAt(duration.getText(), selectedRow, 5);
        model.setValueAt(status.getSelectedItem(), selectedRow, 6);
        model.setValueAt(Remarks.getText(), selectedRow, 7);

        int tablelist = model.getRowCount();
        
        try (BufferedWriter bw = new BufferedWriter(new FileWriter("src\\\\oodjassignment\\\\database\\\\Schedule.txt"))) {
            for (int i = 0; i < tablelist; i++) {
                String rec = model.getValueAt(i, 0).toString() + "/" + model.getValueAt(i, 1).toString() + "/" + model.getValueAt(i, 2).toString() + "/" + model.getValueAt(i, 3).toString() + "/" + model.getValueAt(i, 4).toString() + "/" + model.getValueAt(i, 5).toString() + "/" + model.getValueAt(i, 6).toString() + "/" + model.getValueAt(i, 7).toString();
                bw.write(rec + "\n");
            }
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, "Something went wrong");
        }
    }
    
    
}
