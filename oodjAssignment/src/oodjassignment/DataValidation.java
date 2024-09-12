package oodjassignment;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashSet;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class DataValidation {

    // To store existing names for uniqueness check
    private static HashSet<String> nameSet = new HashSet<>();

    // Method to validate User ID (1 letter + 4 digits)
    public static boolean isValidUserId(String userId) {
        return userId.matches("^[A-Z]\\d{4}$");
    }

    // Method to validate phone number (10-11 digits)
    public static boolean isValidPhoneNumber(String phoneNumber) {
        return phoneNumber.matches("^\\d{10,11}$");
    }

    // Method to validate email (must contain "@" and ".com")
    public static boolean isValidEmail(String email) {
        String emailPattern = "^[\\w\\.-]+@[\\w\\.-]+\\.[a-z]{2,}$";
        return email.matches(emailPattern);
    }

    // Method to validate password (1 uppercase, 1 symbol, 1 digit, 8+ characters)
    public static boolean isValidPassword(String password) {
        String passwordPattern = "^(?=.*[A-Z])(?=.*\\d)(?=.*[@#$%^&+=!]).{8,}$";
        return password.matches(passwordPattern);
    }
    
    public static boolean isDuplicate(String userId, String name, String phoneNumber, String email) {
        // List of files to check
        String[] files = {"src/oodjassignment/database/User.txt", "src/oodjassignment/database/Administrator.txt", "src/oodjassignment/database/Scheduler.txt", "src/oodjassignment/database/Manager.txt"};

        for (String file : files) {
            if (checkDuplicate(file, userId, name, phoneNumber, email)) {
                return true; // Duplicate found in any file
            }
        }
        return false; // No duplicates found
    }
    
    private static boolean checkDuplicate(String fileName, String userId, String name, String phoneNumber, String email) {
    try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
        String line;
        while ((line = reader.readLine()) != null) {
            String[] parts = line.split(","); // Adjust based on your file format
            if (parts.length > 4) {
                String existingUserId = parts[0].trim();
                String existingName = parts[1].trim();
                String existingPhoneNumber = parts[2].trim();
                String existingEmail = parts[3].trim();

                // Check for duplicates in all fields
                if (userId.equals(existingUserId) || name.equals(existingName) || phoneNumber.equals(existingPhoneNumber) || email.equals(existingEmail)) {
                    return true; // Duplicate found
                }
            }
        }
    } catch (IOException e) {
        e.printStackTrace();
    }
    return false; // No duplicates found
}

    // Method to check for duplicates across files, excluding the current record
    public static boolean isDuplicateForUpdate(String userId, String name, String phoneNumber, String email, int selectedRow, JTable table) {
        // Check for duplicates in JTable
        DefaultTableModel model = (DefaultTableModel) table.getModel();
        for (int row = 0; row < model.getRowCount(); row++) {
            if (row == selectedRow) {
                continue;  // Skip the row being updated
            }
            String existingUserId = model.getValueAt(row, 0).toString();
            String existingName = model.getValueAt(row, 1).toString();
            String existingPhone = model.getValueAt(row, 2).toString();
            String existingEmail = model.getValueAt(row, 3).toString();

            if (existingUserId.equals(userId) || existingName.equals(name) || existingPhone.equals(phoneNumber) || existingEmail.equals(email)) {
                return true;  // Duplicate found
            }
        }
        // Check for duplicates in files, excluding the current userId
        String[] files = {"src/oodjassignment/database/User.txt", "src/oodjassignment/database/Administrator.txt", "src/oodjassignment/database/Scheduler.txt", "src/oodjassignment/database/Manager.txt"};
        for (String file : files) {
            if (checkDuplicateUpdate(file, userId, name, phoneNumber, email)) {
                return true; // Duplicate found in files
            }
        }
        return false;  // No duplicates found
    }

    // Method to check for duplicates in files, excluding the current record based on userId
    private static boolean checkDuplicateUpdate(String fileName, String userId, String name, String phoneNumber, String email) {
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(","); // Adjust based on your file format
                if (parts.length > 4) {
                    String existingUserId = parts[0].trim();
                    String existingName = parts[1].trim();
                    String existingPhoneNumber = parts[2].trim();
                    String existingEmail = parts[3].trim();

                    // Skip the row being updated based on userId
                    if (!userId.equals(existingUserId) && (name.equals(existingName) || phoneNumber.equals(existingPhoneNumber) || email.equals(existingEmail))) {
                        return true;  // Duplicate found
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return false; // No duplicates found
    }
}
