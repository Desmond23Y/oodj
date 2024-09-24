/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oodjassignment.scheduler;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Locale;
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

    // Check for maintenance conflicts
    if (isUnderMaintenance(halltype.getSelectedItem().toString(), hall_no.getSelectedItem().toString(), Date.getText(), time.getText())) {
        JOptionPane.showMessageDialog(null, "This hall is under maintenance during the selected time. Please choose another time.");
        return;
    }

    // Check if the schedule already exists
    if (scheduleExists(halltype.getSelectedItem().toString(), hall_no.getSelectedItem().toString(), Date.getText(), time.getText(), duration.getText(), Price.getText())) {
        JOptionPane.showMessageDialog(null, "This schedule already exists. Please choose a different time or hall.");
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
        durationText,
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

    // Method to check if the schedule already exists
    private boolean scheduleExists(String halltype, String hall_no, String date, String time, String duration, String price) {
        try (BufferedReader br = new BufferedReader(new FileReader("src\\\\oodjassignment\\\\database\\\\Schedule.txt"))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] scheduleData = line.split("/");
                String scheduledHallType = scheduleData[0];
                String scheduledHallNo = scheduleData[1];
                String scheduledPrice = scheduleData[2];
                String scheduledDate = scheduleData[3];
                String scheduledTime = scheduleData[4];
                String scheduledDuration = scheduleData[5];

                // Compare with the existing schedule entry
                if (halltype.equals(scheduledHallType) && hall_no.equals(scheduledHallNo) && date.equals(scheduledDate) &&
                    time.equals(scheduledTime) && duration.equals(scheduledDuration) && price.equals(scheduledPrice)) {
                    return true; // The same schedule already exists
                }
            }
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, "Error reading schedule file: " + ex.getMessage());
        }
        return false;
    }

    // Method to check if the hall is under maintenance
    private boolean isUnderMaintenance(String halltype, String hall_no, String date, String time) {
        try (BufferedReader br = new BufferedReader(new FileReader("src\\\\oodjassignment\\\\database\\\\schedule_maintenance.txt"))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] maintenanceData = line.split("/");
                String maintenanceHallType = maintenanceData[0];
                String maintenanceHallNo = maintenanceData[1];
                String maintenanceStartDate = maintenanceData[2];
                String maintenanceEndDate = maintenanceData[3];
                String maintenanceTime = maintenanceData[4];

                // Check if the hall and date/time overlap with the maintenance schedule
                if (halltype.equals(maintenanceHallType) && hall_no.equals(maintenanceHallNo) &&
                    date.equals(maintenanceStartDate) && timeOverlaps(time, maintenanceTime)) {
                    return true; // There's a conflict with the maintenance schedule
                }
            }
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, "Error reading maintenance schedule file: " + ex.getMessage());
        }
        return false;
    }

    // Method to check if times overlap
    private boolean timeOverlaps(String bookingTime, String maintenanceTime) {
        // Assuming time format is like "11am - 1pm", we can split the times and check overlap
        String[] bookingTimes = bookingTime.split(" - ");
        String[] maintenanceTimes = maintenanceTime.split(" - ");

        // Convert times to comparable format (for simplicity, we assume times are non-overlapping within a single day)
        return bookingTimes[1].compareTo(maintenanceTimes[0]) > 0 && bookingTimes[0].compareTo(maintenanceTimes[1]) < 0;
    }

    // Method to validate date format
    // Method to validate date format
    private boolean isValidDate(String dateStr) {
        SimpleDateFormat sdf = new SimpleDateFormat(DATE_FORMAT, Locale.ENGLISH); // Use English month names
        sdf.setLenient(false); // Set lenient to false to strictly parse the date

        // Trim the date string to remove any leading or trailing spaces
        String trimmedDateStr = dateStr.trim();

        try {
            sdf.parse(trimmedDateStr);
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