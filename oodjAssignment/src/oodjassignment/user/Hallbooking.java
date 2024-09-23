/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oodjassignment.user;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class Hallbooking {
    public String generateBookingID(int nextID) {
        return "HB" + String.format("%04d", nextID);
    }

    // Get the next booking ID from Booking.txt
    public int getNextBookingID() {
        int nextID = 1; // Default starting ID
        String filePath = "src/oodjassignment/database/Booking.txt"; // Path to your booking file

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String lastLine = "", currentLine;

            // Read the file line by line to get the last one
            while ((currentLine = br.readLine()) != null) {
                lastLine = currentLine.trim(); // Remove any leading/trailing whitespace
            }

            // Process the last line to get the last booking ID
            if (!lastLine.isEmpty()) {
                String[] fields = lastLine.split("/"); // Assuming the data is delimited by "/"
                String lastID = fields[0]; // First field is the booking ID, e.g., "HB0001"

                if (lastID.startsWith("HB")) { // Ensure the ID has the expected "HB" prefix
                    String numericPart = lastID.substring(2);  // Get the numeric part after "HB"
                    nextID = Integer.parseInt(numericPart) + 1;   // Increment the numeric part
                }
            }
        } catch (IOException | NumberFormatException e) {
            e.printStackTrace();
        }

        return nextID; // Return the next available ID
    }
    
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

            String status = model.getValueAt(selectedRow, 6).toString(); // Assuming column 6 holds the status
            if ("Available".equals(status)) {
            // Autofill the fields with the selected schedule details
            type.setText(model.getValueAt(selectedRow, 0).toString());
            no.setText(model.getValueAt(selectedRow, 1).toString());
            price.setText(model.getValueAt(selectedRow, 2).toString());
            date.setText(model.getValueAt(selectedRow, 3).toString());
            time.setText(model.getValueAt(selectedRow, 4).toString());
            duration.setText(model.getValueAt(selectedRow, 5).toString());
            remark.setText(model.getValueAt(selectedRow, 7).toString()); 
        } else {
            JOptionPane.showMessageDialog(null, "Not Available", "Error", JOptionPane.ERROR_MESSAGE);
        }
    } else {
        JOptionPane.showMessageDialog(null, "Please select a schedule first.", "Error", JOptionPane.ERROR_MESSAGE);
    }
}

    
        public String prepareBookingRecord(DefaultTableModel model, int selectedRow, String bookingId, String customerId, String remarks) {
        return bookingId + "/" + customerId + "/" +
                model.getValueAt(selectedRow, 0).toString() + "/" + // Hall Type
                model.getValueAt(selectedRow, 1).toString() + "/" + // Hall Number
                model.getValueAt(selectedRow, 2).toString() + "/" + // Price
                model.getValueAt(selectedRow, 3).toString() + "/" + // Date
                model.getValueAt(selectedRow, 4).toString() + "/" + // Time
                model.getValueAt(selectedRow, 5).toString() + "/" + // Duration
                "Pending" + "/" + // Status
                remarks;
    }

    // Method to save the booking record to files
    public void saveBooking(String record) {
        try {
            // Save to Booking.txt
            saveToFile(record, "src/oodjassignment/database/Booking.txt");
            // Save to Pending.txt
            saveToFile(record, "src/oodjassignment/database/Pending.txt");
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Something went wrong while saving the booking record.");
        }
    }
    
    private void saveToFile(String record, String filePath) throws IOException {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(filePath, true))) {
            bw.write(record + "\n");
        }
    }

    // Update the schedule status to "Pending"
    public void updateScheduleFile(javax.swing.JTable Aschedule, int selectedRow, String remarks) {
        String scheduleFilePath = "src/oodjassignment/database/Schedule.txt";
        List<String> scheduleLines = new ArrayList<>();

        // Read all lines from Schedule.txt into a list
        try (BufferedReader br = new BufferedReader(new FileReader(scheduleFilePath))) {
            String line;
            while ((line = br.readLine()) != null) {
                scheduleLines.add(line);
            }
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, "Something went wrong while reading schedule data.");
        }

        // Create updated record with "Pending" status
        String updatedRecord = Aschedule.getValueAt(selectedRow, 0).toString() + "/" +
                Aschedule.getValueAt(selectedRow, 1).toString() + "/" +
                Aschedule.getValueAt(selectedRow, 2).toString() + "/" +
                Aschedule.getValueAt(selectedRow, 3).toString() + "/" +
                Aschedule.getValueAt(selectedRow, 4).toString() + "/" +
                Aschedule.getValueAt(selectedRow, 5).toString() + "/" +
                "Pending" + "/" +
                remarks; // Remarks

        // Replace the corresponding line in the scheduleLines list
        scheduleLines.set(selectedRow, updatedRecord);

        // Write the updated list back to the Schedule.txt file
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(scheduleFilePath))) {
            for (String scheduleLine : scheduleLines) {
                bw.write(scheduleLine + "\n");
            }
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, "Something went wrong while updating schedule data.");
        }
    }
}