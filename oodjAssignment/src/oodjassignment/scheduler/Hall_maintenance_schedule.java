/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package oodjassignment.scheduler;

import java.awt.Color;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import oodjassignment.Loginpage;

/**
 *
 * @author Acer
 */
public class Hall_maintenance_schedule extends javax.swing.JFrame {

    /**
     * Creates new form Hall_maintenance_schedule
     */
    public Hall_maintenance_schedule() {
        initComponents();
        String filePath = "src\\\\oodjassignment\\\\database\\\\Schedule_maintenance.txt";
        File file = new File(filePath);

        try {
            // Create a BufferedReader to read the file
            BufferedReader br = new BufferedReader(new FileReader(file));

            // Get the table model from the JTable
            DefaultTableModel model = (DefaultTableModel) maintenance.getModel();

            // Clear existing rows in the table model to prevent duplication
            model.setRowCount(0);

            // Read each line from the file and add it to the table model
            String line;
            while ((line = br.readLine()) != null) {
                String[] dataRow = line.split("/"); // Adjust the delimiter if necessary
                model.addRow(dataRow);
            }
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(this, "Something went wrong: " + ex.getMessage());
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        logout = new javax.swing.JButton();
        smallb = new javax.swing.JPanel();
        start_date = new javax.swing.JTextField();
        end_date = new javax.swing.JTextField();
        review = new javax.swing.JTextField();
        ht = new javax.swing.JLabel();
        sd = new javax.swing.JLabel();
        ed = new javax.swing.JLabel();
        duration = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        Add = new javax.swing.JButton();
        Delete = new javax.swing.JButton();
        Save = new javax.swing.JButton();
        Edit = new javax.swing.JButton();
        Reset = new javax.swing.JButton();
        halltype = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        time = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        maintenance = new javax.swing.JTable();
        background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(1000, 800));
        setMinimumSize(new java.awt.Dimension(1000, 800));
        setPreferredSize(new java.awt.Dimension(1000, 800));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        logout.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        logout.setForeground(new java.awt.Color(102, 102, 102));
        logout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/oodjassignment/picture/logout.png"))); // NOI18N
        logout.setText("Back");
        logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutActionPerformed(evt);
            }
        });
        getContentPane().add(logout, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        smallb.setBackground(new java.awt.Color(0, 137, 248));

        start_date.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N

        end_date.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N

        review.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        review.setForeground(new java.awt.Color(153, 153, 153));
        review.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        review.setText("Review");
        review.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                reviewFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                reviewFocusLost(evt);
            }
        });

        ht.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        ht.setForeground(new java.awt.Color(255, 255, 255));
        ht.setText("Hall Type :");

        sd.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        sd.setForeground(new java.awt.Color(255, 255, 255));
        sd.setText("Start Date :");

        ed.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        ed.setForeground(new java.awt.Color(255, 255, 255));
        ed.setText("End Date :");

        duration.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N

        jLabel1.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Duration :");

        Add.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        Add.setText("Add");
        Add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddActionPerformed(evt);
            }
        });

        Delete.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        Delete.setText("Delete");
        Delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteActionPerformed(evt);
            }
        });

        Save.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        Save.setText("Update");
        Save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SaveActionPerformed(evt);
            }
        });

        Edit.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        Edit.setText("Edit");
        Edit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditActionPerformed(evt);
            }
        });

        Reset.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        Reset.setText("Clear");
        Reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ResetActionPerformed(evt);
            }
        });

        halltype.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        halltype.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Auditorium", "Bonquet Hall", "Meeting Room" }));

        jLabel2.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Time :");

        time.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N

        javax.swing.GroupLayout smallbLayout = new javax.swing.GroupLayout(smallb);
        smallb.setLayout(smallbLayout);
        smallbLayout.setHorizontalGroup(
            smallbLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(smallbLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(smallbLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(review)
                    .addGroup(smallbLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(smallbLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(smallbLayout.createSequentialGroup()
                                .addComponent(Add, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(Edit, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(Save, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(smallbLayout.createSequentialGroup()
                                .addComponent(Delete, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(Reset, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(smallbLayout.createSequentialGroup()
                        .addGroup(smallbLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, smallbLayout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(sd))
                            .addGroup(smallbLayout.createSequentialGroup()
                                .addGroup(smallbLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(ed)
                                    .addComponent(jLabel1)
                                    .addComponent(ht)
                                    .addComponent(jLabel2))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(18, 18, 18)
                        .addGroup(smallbLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(duration)
                            .addComponent(end_date, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(start_date, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(halltype, 0, 167, Short.MAX_VALUE)
                            .addComponent(time))))
                .addGap(18, 18, 18))
        );
        smallbLayout.setVerticalGroup(
            smallbLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(smallbLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(smallbLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ht)
                    .addComponent(halltype, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(smallbLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(start_date, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sd))
                .addGap(18, 18, 18)
                .addGroup(smallbLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(end_date, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ed, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(18, 18, 18)
                .addGroup(smallbLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(time, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(18, 18, 18)
                .addGroup(smallbLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(duration, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addComponent(review, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(smallbLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Edit)
                    .addComponent(Save)
                    .addComponent(Add))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(smallbLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Delete)
                    .addComponent(Reset))
                .addContainerGap(42, Short.MAX_VALUE))
        );

        getContentPane().add(smallb, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 300, 460));

        maintenance.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        maintenance.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Hall Type", "Start Date", "End Date", "Time", "Duration", "Review"
            }
        ));
        jScrollPane1.setViewportView(maintenance);
        if (maintenance.getColumnModel().getColumnCount() > 0) {
            maintenance.getColumnModel().getColumn(0).setMinWidth(85);
            maintenance.getColumnModel().getColumn(0).setPreferredWidth(85);
            maintenance.getColumnModel().getColumn(0).setMaxWidth(85);
            maintenance.getColumnModel().getColumn(1).setMinWidth(90);
            maintenance.getColumnModel().getColumn(1).setPreferredWidth(90);
            maintenance.getColumnModel().getColumn(1).setMaxWidth(90);
            maintenance.getColumnModel().getColumn(2).setMinWidth(90);
            maintenance.getColumnModel().getColumn(2).setPreferredWidth(90);
            maintenance.getColumnModel().getColumn(2).setMaxWidth(90);
            maintenance.getColumnModel().getColumn(3).setMinWidth(90);
            maintenance.getColumnModel().getColumn(3).setPreferredWidth(90);
            maintenance.getColumnModel().getColumn(3).setMaxWidth(90);
            maintenance.getColumnModel().getColumn(4).setMinWidth(77);
            maintenance.getColumnModel().getColumn(4).setPreferredWidth(77);
            maintenance.getColumnModel().getColumn(4).setMaxWidth(77);
        }

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 60, 650, 460));

        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/oodjassignment/picture/blue.jpg"))); // NOI18N
        getContentPane().add(background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void logoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutActionPerformed
        int a = JOptionPane.showConfirmDialog(null, "Do you want to return to the Homepage?", "Select", JOptionPane.YES_NO_OPTION);
        if (a == 0) {
            setVisible(false);
            new schedulerhomepage().setVisible(true);
        }
    }//GEN-LAST:event_logoutActionPerformed

    private void AddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddActionPerformed
        if(start_date.getText().equals("")||end_date.getText().equals("")||duration.getText().equals("")||review.getText().equals("")){
            JOptionPane.showMessageDialog(this,"Please Enter All Data !");
        }else{

            DefaultTableModel model = (DefaultTableModel) maintenance.getModel();
            String[] record = {(String) halltype.getSelectedItem() , start_date.getText(), end_date.getText(), duration.getText(),review.getText()};
            model.addRow(record);
            BufferedWriter bw;
            try {
                bw = new BufferedWriter(new FileWriter("src\\\\oodjassignment\\\\database\\\\Schedule_maintenance.txt",true));
                String rec = (String) halltype.getSelectedItem() +"/"+ start_date.getText() +"/"+ end_date.getText() +"/"+ time.getText() +"/" + duration.getText() +"/"+ review.getText();
                bw.write(rec+"\n");
                bw.close();
            } catch (IOException ex){
                JOptionPane.showMessageDialog(this,"Something Wrong");
            }
        }
    }//GEN-LAST:event_AddActionPerformed

    private void EditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditActionPerformed
        DefaultTableModel model = (DefaultTableModel) maintenance.getModel();
        System.out.println("Row Selected: " +model.getValueAt(maintenance.getSelectedRow(),3));
        halltype.setSelectedItem(model.getValueAt(maintenance.getSelectedRow(), 0).toString());
        start_date.setText(model.getValueAt(maintenance.getSelectedRow(), 1).toString());
        end_date.setText(model.getValueAt(maintenance.getSelectedRow(), 2).toString());
        time.setText(model.getValueAt(maintenance.getSelectedRow(), 3).toString());
        duration.setText(model.getValueAt(maintenance.getSelectedRow(), 4).toString());
        review.setText(model.getValueAt(maintenance.getSelectedRow(), 5).toString());
        System.out.println("Row Selected: " +maintenance.getSelectedRow());
    }//GEN-LAST:event_EditActionPerformed

    private void SaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SaveActionPerformed
        DefaultTableModel model = (DefaultTableModel) maintenance.getModel();
        int tablelist = model.getRowCount();
        System.out.println("Row Selected: "+ maintenance.getSelectedRow());
        model.setValueAt((String) halltype.getSelectedItem(), maintenance.getSelectedRow(), 0);
        model.setValueAt(start_date.getText(), maintenance.getSelectedRow(), 1);
        model.setValueAt(end_date.getText(), maintenance.getSelectedRow(), 2);
        model.setValueAt(time.getText(), maintenance.getSelectedRow(), 3);
        model.setValueAt(duration.getText(), maintenance.getSelectedRow(), 4);
        model.setValueAt(review.getText(), maintenance.getSelectedRow(), 5);

        try {
            BufferedWriter bw = new BufferedWriter (new FileWriter ("src\\\\oodjassignment\\\\database\\\\Schedule_maintenance.txt"));
            for (int i=0 ; i<tablelist ; i++){
                String rec = model.getValueAt(i, 0).toString()+"/"+model.getValueAt(i, 1).toString()+"/"+model.getValueAt(i, 2).toString()+"/"+model.getValueAt(i, 3).toString()+"/"+model.getValueAt(i, 4).toString()+"/"+model.getValueAt(i, 5).toString();
                bw.write(rec+"\n");
            }
            bw.close();
        } catch (IOException ex){
            JOptionPane.showMessageDialog(this,"Something Wrong");
        }
    }//GEN-LAST:event_SaveActionPerformed

    private void DeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteActionPerformed
        DefaultTableModel model = (DefaultTableModel) maintenance.getModel();
        System.out.println("Row Selected: " + maintenance.getSelectedRow());
        model.removeRow(maintenance.getSelectedRow());
        int tablelist = model.getRowCount();
        try {
            BufferedWriter bw = new BufferedWriter (new FileWriter ("src\\\\oodjassignment\\\\database\\\\Schedule_maintenance.txt"));
            for (int i=0 ; i<tablelist ; i++){
                String rec = model.getValueAt(i, 0).toString()+"/"+model.getValueAt(i, 1).toString()+"/"+model.getValueAt(i, 2).toString()+"/"+model.getValueAt(i, 3).toString()+"/"+model.getValueAt(i, 4).toString()+"/"+model.getValueAt(i, 5).toString();
                bw.write(rec+"\n");
            }
            bw.close();
        } catch (IOException ex){
            JOptionPane.showMessageDialog(this,"Something Wrong");
        }
    }//GEN-LAST:event_DeleteActionPerformed

    private void ResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ResetActionPerformed
        setVisible(false);
        new Hall_availability_schedule().setVisible(true);
    }//GEN-LAST:event_ResetActionPerformed

    private void reviewFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_reviewFocusGained
               if(review.getText().equals("Review"))
        {
            review.setText("");
            review.setForeground(newColor(0,118,221));
        }
    }//GEN-LAST:event_reviewFocusGained

    private void reviewFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_reviewFocusLost
        if(review.getText().equals(""))
        {
            review.setText("Review");
            review.setForeground(newColor(0,118,221));

        }
    }//GEN-LAST:event_reviewFocusLost

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
            java.util.logging.Logger.getLogger(Hall_maintenance_schedule.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Hall_maintenance_schedule.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Hall_maintenance_schedule.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Hall_maintenance_schedule.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Hall_maintenance_schedule().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Add;
    private javax.swing.JButton Delete;
    private javax.swing.JButton Edit;
    private javax.swing.JButton Reset;
    private javax.swing.JButton Save;
    private javax.swing.JLabel background;
    private javax.swing.JTextField duration;
    private javax.swing.JLabel ed;
    private javax.swing.JTextField end_date;
    private javax.swing.JComboBox<String> halltype;
    private javax.swing.JLabel ht;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton logout;
    private javax.swing.JTable maintenance;
    private javax.swing.JTextField review;
    private javax.swing.JLabel sd;
    private javax.swing.JPanel smallb;
    private javax.swing.JTextField start_date;
    private javax.swing.JTextField time;
    // End of variables declaration//GEN-END:variables

    private Color newColor(int i, int i0, int i1) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
