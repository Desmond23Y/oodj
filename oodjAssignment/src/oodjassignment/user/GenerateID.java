/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oodjassignment.user;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class GenerateID {
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

    // Save the booking to a file
    public void saveBooking(String record, String filePath) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(filePath, true))) {
            bw.write(record + "\n");
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, "Something went wrong while saving booking data.");
        }
    }

    // Update the schedule status to "Pending"
    public void updateSchedule(javax.swing.JTable Aschedule, int selectedRow) {
        DefaultTableModel model = (DefaultTableModel) Aschedule.getModel();
        model.setValueAt("Pending", selectedRow, 6); // Update status to 'Pending'
    }

    // Update the schedule file
    public void updateScheduleFile(javax.swing.JTable Aschedule, int selectedRow) {
        String scheduleFilePath = "src\\\\oodjassignment\\\\database\\\\Schedule.txt";
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

        // Find and update the corresponding line in scheduleLines with "Pending" status
        String updatedRecord = Aschedule.getValueAt(selectedRow, 0).toString() + "/" +
                Aschedule.getValueAt(selectedRow, 1).toString() + "/" +
                Aschedule.getValueAt(selectedRow, 2).toString() + "/" +
                Aschedule.getValueAt(selectedRow, 3).toString() + "/" +
                Aschedule.getValueAt(selectedRow, 4).toString() + "/" +
                Aschedule.getValueAt(selectedRow, 5).toString() + "/" +
                "Pending" + "/" +
                Aschedule.getValueAt(selectedRow, 7).toString(); // Updated line

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
