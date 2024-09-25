/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oodjassignment;

import java.io.BufferedWriter;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Register {

    private static final String FILE_PATH = "src/oodjassignment/database/User.txt";

    // Method to generate user ID (e.g., U0001)
    public String generateID(int ID) {
        return String.format("U%04d", ID);
    }

    // Method to get the next available user ID
    public int getNextID() {
        int nextID = 1;
        try (BufferedReader br = new BufferedReader(new FileReader(FILE_PATH))) {
            String lastLine = "", currentLine;
            while ((currentLine = br.readLine()) != null) {
                lastLine = currentLine;
            }
            if (!lastLine.isEmpty()) {
                String[] fields = lastLine.split(",");
                String lastID = fields[0].substring(1);  // Get the numeric part of the ID
                nextID = Integer.parseInt(lastID) + 1;   // Increment the ID
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return nextID;
    }

    // Method to register a new user and write the details to the file
    public String registerUser(String username, String phone, String email, String password) {
        if (username.isEmpty() || phone.isEmpty() || email.isEmpty() || password.isEmpty()) {
            return null; // Return null if registration fails
        }

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(FILE_PATH, true))) {
            String ID = generateID(getNextID());
            String record = ID + "," + username + "," + phone + "," + email + "," + password + ",ACTIVE";
            bw.write(record + "\n");
            return ID; // Return the generated user ID on successful registration
        } catch (IOException ex) {
            ex.printStackTrace();
            return null; // Return null in case of an exception
        }
    }
}
