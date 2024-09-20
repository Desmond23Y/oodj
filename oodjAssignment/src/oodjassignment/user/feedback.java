/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
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
import javax.swing.JOptionPane;

/**
 *
 * @author User
 */
public class feedback extends javax.swing.JFrame {

    /**
     * Creates new form feedback
     */
    public feedback() {
        initComponents();
        // Set the hallType ComboBox to include the desired items
        hallType.setModel(new DefaultComboBoxModel<>(new String[] {"Auditorium", "Banquet Hall", "Meeting Room"}));
        
        // Set default items in hall ComboBox when the form initializes
        hall.setModel(new DefaultComboBoxModel<>(new String[] {"HALL 1", "HALL 2", "HALL 3"}));
        
        autofillId();
        id.setEditable(false);
        
        setRealTimeDate();
        date.setEditable(false);
    }
    
    public String generateID(int ID) 
    {
    return String.format("C%04d", ID);
    }
    
    public int getNextID() {
    int nextID = 1;  // Start with 1 if file is empty
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


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        id = new javax.swing.JTextField();
        hallType = new javax.swing.JComboBox<>();
        hall = new javax.swing.JComboBox<>();
        date = new javax.swing.JTextField();
        feedback = new javax.swing.JTextField();
        send = new javax.swing.JButton();
        logout = new javax.swing.JButton();
        background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Segoe UI Black", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Customer Feedback");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 40, -1, -1));

        jLabel1.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Hall type:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 230, -1, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Hall No:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 310, -1, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Date:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 380, -1, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Customer ID:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 160, -1, -1));

        jLabel7.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Feedback:");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 450, -1, -1));

        id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idActionPerformed(evt);
            }
        });
        getContentPane().add(id, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 160, 200, 30));

        hallType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        hallType.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hallTypeActionPerformed(evt);
            }
        });
        getContentPane().add(hallType, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 232, 200, 30));

        hall.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        getContentPane().add(hall, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 310, 200, 30));
        getContentPane().add(date, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 380, 200, 30));
        getContentPane().add(feedback, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 450, 200, 120));

        send.setBackground(new java.awt.Color(0, 137, 248));
        send.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        send.setForeground(new java.awt.Color(255, 255, 255));
        send.setText("Send Feedback");
        send.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sendActionPerformed(evt);
            }
        });
        getContentPane().add(send, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 620, -1, -1));

        logout.setBackground(new java.awt.Color(0, 137, 248));
        logout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/oodjassignment/picture/logout.png"))); // NOI18N
        logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutActionPerformed(evt);
            }
        });
        getContentPane().add(logout, new org.netbeans.lib.awtextra.AbsoluteConstraints(1140, 10, 50, -1));

        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/oodjassignment/picture/blue.jpg"))); // NOI18N
        getContentPane().add(background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1200, 800));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void logoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutActionPerformed
       new
       homepage().setVisible(true);
       dispose();
    }//GEN-LAST:event_logoutActionPerformed

    
    private void autofillId() {
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
        } catch (Exception e) {
            e.printStackTrace();  // Print error stack trace if any exception occurs
        }

        if (userId != null) {
            id.setText(userId);  // Autofill the ID JTextField with the user ID
        }
    }
    
    private void setRealTimeDate() {
        LocalDate currentDate = LocalDate.now();  // Get the current date
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        String formattedDate = currentDate.format(formatter); 
        date.setText(formattedDate);  
    }
        
    private void hallTypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hallTypeActionPerformed
    String selectedHallType = hallType.getSelectedItem().toString();

    // Switch to update the hall ComboBox based on the hall type selection
    switch (selectedHallType) {
        case "Auditorium":
        case "Banquet Hall":
            hall.setModel(new DefaultComboBoxModel<>(new String[] {"HALL 1", "HALL 2", "HALL 3"}));
            break;
        case "Meeting Room":
            hall.setModel(new DefaultComboBoxModel<>(new String[] {"ROOM 1", "ROOM 2", "ROOM 3"}));
            break;
        default:
            hall.setModel(new DefaultComboBoxModel<>(new String[] {}));  // Empty if no match
            break;
    }
    }//GEN-LAST:event_hallTypeActionPerformed

    private void idActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idActionPerformed

    }//GEN-LAST:event_idActionPerformed

    private void sendActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sendActionPerformed
        // Get all the necessary data from the JTextFields and JComboBoxes
    String customerId = id.getText();
    String hallTypeValue = hallType.getSelectedItem().toString();
    String hallNoValue = hall.getSelectedItem().toString();
    String dateValue = date.getText();
    String feedbackText = feedback.getText();
    
    // Generate a new Case ID
    int nextID = getNextID();
    String caseId = generateID(nextID);

    // Prepare the feedback data to save
    String feedbackData = caseId + "," + customerId + "," + hallTypeValue + "," + hallNoValue + "," + dateValue + "," + feedbackText + ", No" + ", No";

    // Save the feedback data to feedback.txt
    String filePath = "src/oodjassignment/database/feedback.txt";
    try (BufferedWriter bw = new BufferedWriter(new FileWriter(filePath, true))) {
        bw.write(feedbackData);
        bw.newLine();  // Move to the next line for future data
    } catch (IOException e) {
        e.printStackTrace();  // Handle any errors
        JOptionPane.showMessageDialog(this, "Error saving feedback. Please try again.", "Error", JOptionPane.ERROR_MESSAGE);
        return;
    }
    
    // Show a success message after saving
    JOptionPane.showMessageDialog(this, "Feedback submitted successfully!", "Success", JOptionPane.INFORMATION_MESSAGE);
    new
    feedback().setVisible(true);
    dispose();
    }//GEN-LAST:event_sendActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(feedback.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(feedback.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(feedback.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(feedback.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new feedback().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel background;
    private javax.swing.JTextField date;
    private javax.swing.JTextField feedback;
    private javax.swing.JComboBox<String> hall;
    private javax.swing.JComboBox<String> hallType;
    private javax.swing.JTextField id;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JButton logout;
    private javax.swing.JButton send;
    // End of variables declaration//GEN-END:variables
}
