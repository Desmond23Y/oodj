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
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author User
 */
public class Pay {
    
        public static void autofillUserData(JTextField id, JTextField type, JTextField hall, JTextField price, JTextField cfPrice) {
        try (BufferedReader reader = new BufferedReader(new FileReader("src/oodjassignment/database/Pending.txt"))) {
            String line;

            // Read the first line from the file
            if ((line = reader.readLine()) != null) {
                // Split the line to extract user data
                String[] userData = line.split("/");

                // Auto-fill the text fields with user data
                if (userData.length == 10) {
                    id.setText(userData[1]);
                    type.setText(userData[2]);
                    hall.setText(userData[3]);
                    price.setText(userData[4]);
                    cfPrice.setText(userData[4]);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error loading user data.");
        }
    }
    

        public static void updateBookingAndSchedule(JTextField type, JTextField hall) {
            String[] filePaths = {
                "src/oodjassignment/database/Booking.txt",
                "src/oodjassignment/database/Schedule.txt",
            };

            for (String filePath : filePaths) {
                List<String> fileContent = new ArrayList<>();
                try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
                    String line;
                    while ((line = reader.readLine()) != null) {
                        fileContent.add(line);
                    }
                } catch (IOException e) {
                    JOptionPane.showMessageDialog(null, "Error reading the file: " + filePath);
                    return; // Exit the method on error
                }

                for (int i = 0; i < fileContent.size(); i++) {
                    String line = fileContent.get(i);
                    String[] parts = line.split("/");

                    // Check for Booking.txt
                    if (filePath.contains("Booking.txt") && parts.length == 10) {
                        if (parts[2].equals(type.getText()) && parts[3].equals(hall.getText()) && parts[8].equals("Pending")) {
                            parts[8] = "Booked";
                            fileContent.set(i, String.join("/", parts));
                            break;
                        }
                    } 
                    // Check for Schedule.txt
                    else if (filePath.contains("Schedule.txt") && parts.length == 8) {
                        if (parts[0].equals(type.getText()) && parts[1].equals(hall.getText()) && parts[6].equals("Pending")) {
                            parts[6] = "Booked";
                            fileContent.set(i, String.join("/", parts));
                            break;
                        }
                    }
                }

                try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))) {
                    for (String updatedLine : fileContent) {
                        writer.write(updatedLine);
                        writer.newLine();
                    }
                } catch (IOException e) {
                    JOptionPane.showMessageDialog(null, "Error writing to the file: " + filePath);
                }
            }
        }

        public static void updatePendingFile(JTextField type, JTextField hall) {
            String pendingFilePath = "src/oodjassignment/database/Pending.txt";
            List<String> pendingContent = new ArrayList<>();
            try (BufferedReader reader = new BufferedReader(new FileReader(pendingFilePath))) {
                String line;
                while ((line = reader.readLine()) != null) {
                    pendingContent.add(line);
                }
            } catch (IOException e) {
                JOptionPane.showMessageDialog(null, "Error reading Pending.txt");
                return; // Exit the method on error
            }

            for (int i = 0; i < pendingContent.size(); i++) {
                String line = pendingContent.get(i);
                String[] parts = line.split("/");
                if (parts[2].equals(type.getText()) && parts[3].equals(hall.getText())) {
                    pendingContent.remove(i);
                    break;
                }
            }

            try (BufferedWriter writer = new BufferedWriter(new FileWriter(pendingFilePath))) {
                for (String updatedLine : pendingContent) {
                    writer.write(updatedLine);
                    writer.newLine();
                }
            } catch (IOException e) {
                JOptionPane.showMessageDialog(null, "Error writing to Pending.txt");
            }
        }
        
        public static void generateReceipt(String hallType, String hall, String price) {
        // Get the current date and time
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");

        // Create receipt details
        String receipt = "----------- Receipt -----------\n" +
                         "Date: " + dtf.format(now) + "\n" +
                         "Hall Type: " + hallType + "\n" +
                         "Hall: " + hall + "\n" +
                         "Price: " + price + "\n" +
                         "-------------------\n" +
                         "Thank you for your payment!";

        // Display the receipt in a dialog box
        JOptionPane.showMessageDialog(null, receipt, "Payment Receipt", JOptionPane.INFORMATION_MESSAGE);
    }
}
