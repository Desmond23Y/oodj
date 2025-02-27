/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package oodjassignment.scheduler;

import java.awt.Color;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author Acer
 */
public class Hall_availability_schedule extends javax.swing.JFrame {

    /**
     * Creates new form Hall_availability_schedule
     */
    public Hall_availability_schedule() {
        initComponents();
        String filePath = "src\\\\oodjassignment\\\\database\\\\Schedule.txt";
        File file = new File(filePath);

        try {
            // Create a BufferedReader to read the file
            BufferedReader br = new BufferedReader(new FileReader(file));

            // Get the table model from the JTable
            DefaultTableModel model = (DefaultTableModel) Aschedule.getModel();

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

        jPanel1 = new javax.swing.JPanel();
        logout = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        Aschedule = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        Remarks = new javax.swing.JTextField();
        Date = new javax.swing.JTextField();
        Price = new javax.swing.JTextField();
        Add = new javax.swing.JButton();
        Reset = new javax.swing.JButton();
        Edit = new javax.swing.JButton();
        Save = new javax.swing.JButton();
        Delete = new javax.swing.JButton();
        halltype = new javax.swing.JComboBox<>();
        ht = new javax.swing.JLabel();
        p = new javax.swing.JLabel();
        dt = new javax.swing.JLabel();
        filter = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        t = new javax.swing.JLabel();
        time = new javax.swing.JTextField();
        st = new javax.swing.JLabel();
        status = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        duration = new javax.swing.JTextField();
        hallsno = new javax.swing.JLabel();
        hall_no = new javax.swing.JComboBox<>();
        HM = new javax.swing.JButton();
        background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1000, 800));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        logout.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        logout.setForeground(new java.awt.Color(102, 102, 102));
        logout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/oodjassignment/picture/logout.png"))); // NOI18N
        logout.setText("Back");
        logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutActionPerformed(evt);
            }
        });
        jPanel1.add(logout, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        Aschedule.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        Aschedule.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Hall Type", "Hall's No", "Price", "Date", "Time", "Duration", "Status", "Remarks"
            }
        ));
        Aschedule.setSelectionBackground(new java.awt.Color(204, 204, 204));
        jScrollPane1.setViewportView(Aschedule);
        if (Aschedule.getColumnModel().getColumnCount() > 0) {
            Aschedule.getColumnModel().getColumn(0).setMinWidth(100);
            Aschedule.getColumnModel().getColumn(0).setPreferredWidth(100);
            Aschedule.getColumnModel().getColumn(0).setMaxWidth(100);
            Aschedule.getColumnModel().getColumn(1).setMinWidth(85);
            Aschedule.getColumnModel().getColumn(1).setPreferredWidth(85);
            Aschedule.getColumnModel().getColumn(1).setMaxWidth(85);
            Aschedule.getColumnModel().getColumn(2).setMinWidth(83);
            Aschedule.getColumnModel().getColumn(2).setPreferredWidth(83);
            Aschedule.getColumnModel().getColumn(2).setMaxWidth(83);
            Aschedule.getColumnModel().getColumn(3).setMinWidth(100);
            Aschedule.getColumnModel().getColumn(3).setPreferredWidth(100);
            Aschedule.getColumnModel().getColumn(3).setMaxWidth(100);
            Aschedule.getColumnModel().getColumn(4).setMinWidth(120);
            Aschedule.getColumnModel().getColumn(4).setPreferredWidth(120);
            Aschedule.getColumnModel().getColumn(4).setMaxWidth(120);
            Aschedule.getColumnModel().getColumn(5).setMinWidth(90);
            Aschedule.getColumnModel().getColumn(5).setPreferredWidth(90);
            Aschedule.getColumnModel().getColumn(5).setMaxWidth(90);
            Aschedule.getColumnModel().getColumn(6).setMinWidth(100);
            Aschedule.getColumnModel().getColumn(6).setPreferredWidth(100);
            Aschedule.getColumnModel().getColumn(6).setMaxWidth(100);
        }

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 90, 880, 600));

        jPanel2.setBackground(new java.awt.Color(0, 137, 248));

        Remarks.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        Remarks.setForeground(new java.awt.Color(153, 153, 153));
        Remarks.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Remarks.setText("-");
        Remarks.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                RemarksFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                RemarksFocusLost(evt);
            }
        });

        Date.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N

        Price.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        Price.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PriceActionPerformed(evt);
            }
        });

        Add.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        Add.setText("Add");
        Add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddActionPerformed(evt);
            }
        });

        Reset.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        Reset.setText("Clear");
        Reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ResetActionPerformed(evt);
            }
        });

        Edit.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        Edit.setText("Edit");
        Edit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditActionPerformed(evt);
            }
        });

        Save.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        Save.setText("Update");
        Save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SaveActionPerformed(evt);
            }
        });

        Delete.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        Delete.setText("Delete");
        Delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteActionPerformed(evt);
            }
        });

        halltype.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        halltype.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Auditorium", "Banquet Hall", "Meeting Room" }));
        halltype.setMaximumSize(new java.awt.Dimension(80, 23));
        halltype.setMinimumSize(new java.awt.Dimension(80, 23));
        halltype.setPreferredSize(new java.awt.Dimension(80, 23));
        halltype.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                halltypeActionPerformed(evt);
            }
        });

        ht.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        ht.setForeground(new java.awt.Color(255, 255, 255));
        ht.setText("Hall Type :");

        p.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        p.setForeground(new java.awt.Color(255, 255, 255));
        p.setText("Price :");

        dt.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        dt.setForeground(new java.awt.Color(255, 255, 255));
        dt.setText("Date :");

        filter.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        filter.setForeground(new java.awt.Color(153, 153, 153));
        filter.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        filter.setText("Filter");
        filter.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                filterFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                filterFocusLost(evt);
            }
        });
        filter.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                filterKeyReleased(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Search :");

        t.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        t.setForeground(new java.awt.Color(255, 255, 255));
        t.setText("Time :");

        time.setFont(new java.awt.Font("Segoe UI Black", 1, 12)); // NOI18N

        st.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        st.setForeground(new java.awt.Color(255, 255, 255));
        st.setText("Status :");

        status.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        status.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Available", "Booked" }));
        status.setPreferredSize(new java.awt.Dimension(80, 23));

        jLabel2.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Duration :");

        duration.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        duration.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                durationActionPerformed(evt);
            }
        });

        hallsno.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        hallsno.setForeground(new java.awt.Color(255, 255, 255));
        hallsno.setText("Hall's No :");

        hall_no.setFont(new java.awt.Font("Segoe UI Black", 1, 12)); // NOI18N
        hall_no.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "HALL 1", "HALL 2", "HALL 3" }));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                            .addComponent(Delete, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(Reset, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addGap(21, 21, 21)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addComponent(Add, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(Edit, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(Save, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(Remarks, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGap(17, 17, 17))
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGap(20, 20, 20)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addComponent(ht)
                            .addGap(14, 14, 14)
                            .addComponent(halltype, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel2)
                                .addComponent(st))
                            .addGap(18, 18, 18)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(status, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(duration, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(hallsno)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(p)
                                    .addComponent(t)
                                    .addComponent(dt, javax.swing.GroupLayout.Alignment.LEADING)))
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addGap(12, 12, 12)
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(Date, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(time, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(Price, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(hall_no, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(filter, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ht)
                    .addComponent(halltype, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(hall_no, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(hallsno))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Price, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(p))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Date, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dt))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(time, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(t))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(duration, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(status, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(st))
                .addGap(18, 18, 18)
                .addComponent(Remarks, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Add)
                    .addComponent(Edit)
                    .addComponent(Save))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Reset)
                    .addComponent(Delete))
                .addGap(28, 28, 28)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(filter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addContainerGap())
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 280, 600));

        HM.setFont(new java.awt.Font("Segoe UI Black", 1, 12)); // NOI18N
        HM.setForeground(new java.awt.Color(102, 102, 102));
        HM.setText("Hall Maintenance");
        HM.setMaximumSize(new java.awt.Dimension(155, 39));
        HM.setMinimumSize(new java.awt.Dimension(155, 39));
        HM.setPreferredSize(new java.awt.Dimension(155, 39));
        HM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HMActionPerformed(evt);
            }
        });
        jPanel1.add(HM, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 10, 150, 40));

        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/oodjassignment/picture/blue.jpg"))); // NOI18N
        background.setText("jLabel1");
        background.setMaximumSize(new java.awt.Dimension(1200, 1000));
        background.setMinimumSize(new java.awt.Dimension(1200, 1000));
        background.setPreferredSize(new java.awt.Dimension(1200, 1000));
        jPanel1.add(background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1200, 800));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1200, 800));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void RemarksFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_RemarksFocusGained
       if(Remarks.getText().equals("-"))
        {
            Remarks.setText("");
            Remarks.setForeground(newColor(0,118,221));
        }
    }//GEN-LAST:event_RemarksFocusGained

    private void RemarksFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_RemarksFocusLost
        if(Remarks.getText().equals(""))
        {
            Remarks.setText("-");
            Remarks.setForeground(newColor(0,118,221));

        }
    }//GEN-LAST:event_RemarksFocusLost

    private void EditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditActionPerformed
        DefaultTableModel model = (DefaultTableModel) Aschedule.getModel();
        ATable t1 = new ATable();
        t1.editSchedule(model, halltype, hall_no, Price, Date, time, duration, status, Remarks, Aschedule);
    }//GEN-LAST:event_EditActionPerformed

    private void AddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddActionPerformed
        ATable t2 = new ATable();
        t2.addSchedule(Remarks, Date, Price, time, duration, halltype, hall_no, status, Aschedule);
    }//GEN-LAST:event_AddActionPerformed

    private void DeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteActionPerformed
        ATable tableHelper = new ATable();
        tableHelper.deleteSchedule(Aschedule);
    }//GEN-LAST:event_DeleteActionPerformed

    private void ResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ResetActionPerformed
        setVisible(false);
        new Hall_availability_schedule().setVisible(true);
    }//GEN-LAST:event_ResetActionPerformed

    private void SaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SaveActionPerformed
        ATable t3 = new ATable();
        t3.updateSchedule(Aschedule, halltype, hall_no, Price, Date, time, duration, status, Remarks);
    }//GEN-LAST:event_SaveActionPerformed

    private void logoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutActionPerformed
        int a = JOptionPane.showConfirmDialog(null, "Do you want to return to the Homepage?", "Select", JOptionPane.YES_NO_OPTION);
        if (a == 0) {
            setVisible(false);
            new schedulerhomepage().setVisible(true);
        }
    }//GEN-LAST:event_logoutActionPerformed

    private void filterFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_filterFocusGained
        if(filter.getText().equals("Filter"))
        {
            filter.setText("");
            filter.setForeground(newColor(0,118,221));
        }
    }//GEN-LAST:event_filterFocusGained

    private void filterFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_filterFocusLost
        if(filter.getText().equals(""))
        {
            filter.setText("Filter");
            filter.setForeground(newColor(0,118,221));

        }
    }//GEN-LAST:event_filterFocusLost

    private void filterKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_filterKeyReleased
        DefaultTableModel obj = (DefaultTableModel) Aschedule.getModel();
        TableRowSorter<DefaultTableModel> obj1=new TableRowSorter<>(obj);
        Aschedule.setRowSorter(obj1);
        obj1.setRowFilter(RowFilter.regexFilter(filter.getText()));
    }//GEN-LAST:event_filterKeyReleased

    private void halltypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_halltypeActionPerformed
        calculatePrice();
    }//GEN-LAST:event_halltypeActionPerformed

    private void PriceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PriceActionPerformed
        Price.setEditable(false);
    }//GEN-LAST:event_PriceActionPerformed

    private void durationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_durationActionPerformed
        calculatePrice();
    }//GEN-LAST:event_durationActionPerformed

    private void HMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HMActionPerformed
        setVisible(false);
        new Hall_maintenance_schedule().setVisible(true);
    }//GEN-LAST:event_HMActionPerformed

    
     private void calculatePrice() {
        String hallType = (String) halltype.getSelectedItem();
        String timeText = duration.getText().trim();
        int hours = extractHours(timeText);

        if (hours == -1) {
            Price.setText("Invalid hours");
            return;
        }

        int rate = 0;
        switch (hallType) {
            case "Auditorium":
                rate = 300;
                break;
            case "Banquet Hall":
                rate = 100;
                break;
            case "Meeting Room":
                rate = 50;
                break;
        }

        int totalPrice = rate * hours;
        Price.setText("RM " + totalPrice);
    }

    private int extractHours(String input) {
        // Use regex to find the number in the string
        Pattern pattern = Pattern.compile("(\\d+)");
        Matcher matcher = pattern.matcher(input);
        if (matcher.find()) {
            return Integer.parseInt(matcher.group(1));
        } else {
            return -1; // Return -1 if no number is found
        }
    }
    
    
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
            java.util.logging.Logger.getLogger(Hall_availability_schedule.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Hall_availability_schedule.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Hall_availability_schedule.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Hall_availability_schedule.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Hall_availability_schedule().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Add;
    private javax.swing.JTable Aschedule;
    private javax.swing.JTextField Date;
    private javax.swing.JButton Delete;
    private javax.swing.JButton Edit;
    private javax.swing.JButton HM;
    private javax.swing.JTextField Price;
    private javax.swing.JTextField Remarks;
    private javax.swing.JButton Reset;
    private javax.swing.JButton Save;
    private javax.swing.JLabel background;
    private javax.swing.JLabel dt;
    private javax.swing.JTextField duration;
    private javax.swing.JTextField filter;
    private javax.swing.JComboBox<String> hall_no;
    private javax.swing.JLabel hallsno;
    private javax.swing.JComboBox<String> halltype;
    private javax.swing.JLabel ht;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton logout;
    private javax.swing.JLabel p;
    private javax.swing.JLabel st;
    private javax.swing.JComboBox<String> status;
    private javax.swing.JLabel t;
    private javax.swing.JTextField time;
    // End of variables declaration//GEN-END:variables

    private Color newColor(int i, int i0, int i1) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
