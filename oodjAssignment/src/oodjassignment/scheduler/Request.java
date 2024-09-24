/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oodjassignment.scheduler;

/**
 *
 * @author Acer
 */
// Request.java
// Request.java
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import javax.swing.table.DefaultTableModel;

public class Request {
    private String filePath;

    public Request(String filePath) {
        this.filePath = filePath;
    }

    // Method to read file and add only "Request for cancel" records to the JTable
    public void readFileToTable(DefaultTableModel model) throws IOException {
        model.setRowCount(0); // Clear the existing rows

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] bookingData = line.split("/");

                // Check if the status is "Request for cancel"
                if ("Request for cancel".equals(bookingData[8])) {
                    model.addRow(bookingData); // Add the matching data to the table
                }
            }
        } catch (IOException e) {
            throw new IOException("Error reading booking file: " + e.getMessage());
        }
    }
}


