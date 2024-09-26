package oodjassignment.user;

import java.io.*;
import java.util.*;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class Bookdetails {

    private final String bookingFilePath = "src/oodjassignment/database/Booking.txt";
    private final String cookieFilePath = "src/oodjassignment/database/cookie.txt";

    // Method to load bookings, filtering by the user ID from cookie.txt
    public void loadBookings(DefaultTableModel model) {
        File file = new File(bookingFilePath);
        String userID = getCustomerID();  // Get the user ID from cookie.txt
        try {
            BufferedReader br = new BufferedReader(new FileReader(file));
            model.setRowCount(0);  // Clear existing rows
            String line;
            while ((line = br.readLine()) != null) {
                String[] dataRow = line.split("/");
                // Only add rows where the user ID matches
                if (dataRow[1].equals(userID)) {
                    model.addRow(dataRow);
                }
            }
            br.close();
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, "Error loading bookings: " + ex.getMessage());
        }
    }

    // Method to get the current user ID from cookie.txt
    public String getCustomerID() {
        File file = new File(cookieFilePath);
        String userID = "";
        try {
            BufferedReader br = new BufferedReader(new FileReader(file));
            userID = br.readLine().split(",")[0];  // Assuming the user ID is the first element in cookie.txt
            br.close();
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, "Error reading user data: " + ex.getMessage());
        }
        return userID;
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

    // Update booking request and add cancellation reason
    public void updateBookingRequest(DefaultTableModel model, int selectedRow, String reason) {
        List<String> lines = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(bookingFilePath))) {
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

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(bookingFilePath))) {
            for (String updatedLine : lines) {
                bw.write(updatedLine + "\n");
            }
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, "Error saving booking data: " + ex.getMessage());
        }
    }
}