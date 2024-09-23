/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oodjassignment.user;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import javax.swing.DefaultComboBoxModel;

public class Feedb {
    public String generateID(int ID) {
        return String.format("C%04d", ID);
    }

    public int getNextID() {
        int nextID = 1;  // Start with 1 if the file is empty
        String filePath = "src/oodjassignment/database/feedback.txt";
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String lastLine = "", currentLine;
            while ((currentLine = br.readLine()) != null) {
                lastLine = currentLine;  // Keep reading until the last line
            }
            if (!lastLine.isEmpty()) {
                String[] fields = lastLine.split(",");  // Split the last line by commas
                String lastID = fields[0].substring(1); // Remove the 'C' from the case ID
                nextID = Integer.parseInt(lastID) + 1;  // Increment the ID
            }
        } catch (IOException e) {
            e.printStackTrace();  // Handle any IO errors
        }
        return nextID;  // Return the next ID
    }
    
    public String getUserIdFromCookie() {
        String filePath = "src/oodjassignment/database/cookie.txt";  // Path to your cookie file
        String userId = null;

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line = br.readLine(); // Read the first line from the file
            if (line != null) {
                String[] parts = line.split(","); // Split the line by commas
                if (parts.length >= 1) {
                    userId = parts[0]; // Extract the User ID (assuming it's the first element)
                }
            }
        } catch (IOException e) {
            e.printStackTrace();  // Handle any IO errors
        }
        
        return userId;  // Return the user ID or null if not found
    }
    
    public DefaultComboBoxModel<String> getHallsForType(String hallType) {
        switch (hallType) {
            case "Auditorium":
            case "Banquet Hall":
                return new DefaultComboBoxModel<>(new String[]{"HALL 1", "HALL 2", "HALL 3"});
            case "Meeting Room":
                return new DefaultComboBoxModel<>(new String[]{"ROOM 1", "ROOM 2", "ROOM 3"});
            default:
                return new DefaultComboBoxModel<>(new String[]{});
        }
    }

    public void saveFeedback(String feedbackData) {
        String filePath = "src/oodjassignment/database/feedback.txt";
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(filePath, true))) {
            bw.write(feedbackData);
            bw.newLine();  // Move to the next line for future data
        } catch (IOException e) {
            e.printStackTrace();  // Handle any errors
        }
    }

    public String getCurrentDate() {
        LocalDate currentDate = LocalDate.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        return currentDate.format(formatter);
    }
}