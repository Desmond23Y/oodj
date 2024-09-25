/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oodjassignment.user;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JOptionPane;

/**
 *
 * @author User
 */
public class UserProfile {
    private String id;
    private String username;
    private String phone;
    private String email;
    private String password;
    private String accountStatus;

    public UserProfile(String id, String username, String phone, String email, String password, String accountStatus) {
        this.id = id;
        this.username = username;
        this.phone = phone;
        this.email = email;
        this.password = password;
        this.accountStatus = accountStatus;
    }

    public static UserProfile autofillUserData() {
        try (BufferedReader reader = new BufferedReader(new FileReader("src/oodjassignment/database/cookie.txt"))) {
            String line;
            if ((line = reader.readLine()) != null) {
                String[] userData = line.split(",");
                if (userData.length == 7) {
                    return new UserProfile(userData[0], userData[1], userData[2], userData[3], userData[4], userData[5]);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error loading user data.");
        }
        return null;
    }

    public void updateUserProfile() {
        String userFilePath = "src/oodjassignment/database/User.txt";
        String cookieFilePath = "src/oodjassignment/database/cookie.txt";
        File userFile = new File(userFilePath);
        File cookieFile = new File(cookieFilePath);

        StringBuilder fileContent = new StringBuilder();
        StringBuilder cookieContent = new StringBuilder();
        boolean isUpdated = false;

        try (BufferedReader reader = new BufferedReader(new FileReader(userFile))) {
            String currentLine;
            while ((currentLine = reader.readLine()) != null) {
                String[] details = currentLine.split(",");
                if (details[0].equals(id)) {  // Assuming details[0] is the user ID
                // Trim and uppercase the ID to prevent extra spaces or case issues

                    // Update the record (no need to modify role in User.txt, but add to cookie)
                    String updatedRecord = String.join(",", id, username, phone, email, password, "ACTIVE");
                    fileContent.append(updatedRecord).append(System.lineSeparator());

                    // Append to cookie with the role
                    String updatedCookieRecord = String.join(",", id, username, phone, email, password, "ACTIVE", "USER");
                    cookieContent.append(updatedCookieRecord).append(System.lineSeparator());

                    isUpdated = true;
                } else {
                    fileContent.append(currentLine).append(System.lineSeparator());
                }
            }

            if (isUpdated) {
                // Write updated content to User.txt
                try (BufferedWriter writer = new BufferedWriter(new FileWriter(userFile))) {
                    writer.write(fileContent.toString());
                }

                // Write the same updated data with role to cookie.txt
                try (BufferedWriter writer = new BufferedWriter(new FileWriter(cookieFile))) {
                    writer.write(cookieContent.toString());
                }

                JOptionPane.showMessageDialog(null, "Update Successfully!!");
            } else {
                JOptionPane.showMessageDialog(null, "User ID not found.");
            }
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, "Something went wrong: " + ex.getMessage());
            ex.printStackTrace();
        }
    }

    // Getters for the fields
    public String getId() {
        return id;
    }

    public String getUsername() {
        return username;
    }

    public String getPhone() {
        return phone;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public String getAccountStatus() {
        return accountStatus;
    }
}
