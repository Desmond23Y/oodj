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
        String filePath = "src/oodjassignment/database/User.txt";
        File inputFile = new File(filePath);
        StringBuilder fileContent = new StringBuilder();
        boolean isUpdated = false;

        try (BufferedReader reader = new BufferedReader(new FileReader(inputFile))) {
            String currentLine;
            while ((currentLine = reader.readLine()) != null) {
                String[] details = currentLine.split(",");
                if (details[0].equals(id)) {
                    String updatedRecord = String.join(",", id, username, phone, email, password, "ACTIVE");
                    fileContent.append(updatedRecord).append(System.lineSeparator());
                    isUpdated = true;
                } else {
                    fileContent.append(currentLine).append(System.lineSeparator());
                }
            }
            if (isUpdated) {
                try (BufferedWriter writer = new BufferedWriter(new FileWriter(inputFile))) {
                    writer.write(fileContent.toString());
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
