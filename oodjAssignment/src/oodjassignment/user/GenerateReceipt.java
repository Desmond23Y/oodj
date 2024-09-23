/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oodjassignment.user;

import javax.swing.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class GenerateReceipt {
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
