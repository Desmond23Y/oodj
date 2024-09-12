package oodjassignment;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashSet;

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
        String[] files = {"user.txt", "administrator.txt", "scheduler.txt", "manager.txt"};

        for (String file : files) {
            if (checkFileForDuplicate(file, userId, name, phoneNumber, email)) {
                return true; // Duplicate found in any file
            }
        }
        return false;
    }

    public static boolean checkFileForDuplicate(String fileName, String userId, String name, String phoneNumber, String email) {
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(","); // Adjust based on your file format
                if (parts.length > 4) {
                    String existingUserId = parts[0].trim();
                    String existingName = parts[1].trim();
                    String existingPhoneNumber = parts[2].trim();
                    String existingEmail = parts[3].trim();

                    if (userId.equals(existingUserId) || name.equals(existingName) || phoneNumber.equals(existingPhoneNumber) || email.equals(existingEmail)) {
                        return true; // Duplicate found
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return false;
    }

    public static boolean isDuplicateForUpdate(String userId, String name, String phoneNumber, String email, int excludeRow) {
        // List of files to check
        String[] files = {"src/oodjassignment/database/User.txt", "src/oodjassignment/database/Administrator.txt", "src/oodjassignment/database/Scheduler.txt", "src/oodjassignment/database/Manager.txt"};

        for (String file : files) {
            if (checkFileForDuplicateExcludingRow(file, userId, name, phoneNumber, email, excludeRow)) {
                return true; // Duplicate found in any file
            }
        }
        return false; // No duplicates found
    }

    private static boolean checkFileForDuplicateExcludingRow(String fileName, String userId, String name, String phoneNumber, String email, int excludeRow) {
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            int row = 0;
            while ((line = reader.readLine()) != null) {
                if (row != excludeRow) { // Skip the row to exclude
                    String[] parts = line.split(","); // Adjust based on your file format
                    if (parts.length > 4) {
                        String existingUserId = parts[0].trim();
                        String existingName = parts[1].trim();
                        String existingPhoneNumber = parts[2].trim();
                        String existingEmail = parts[3].trim();

                        if (userId.equals(existingUserId) || name.equals(existingName) || phoneNumber.equals(existingPhoneNumber) || email.equals(existingEmail)) {
                            return true; // Duplicate found
                        }
                    }
                }
                row++;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return false; // No duplicates found
    }

}
