/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oodjassignment.scheduler;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Acer
 */
public class ReadData {

    // Function to read the login ID from the cookie file
    public String readLoginID() {
        String loginID = "";
        try {
            BufferedReader reader = new BufferedReader(new FileReader("src\\\\oodjassignment\\\\database\\\\cookie.txt"));
            String line = reader.readLine(); // Read the first line of the file
            if (line != null) {
                // Split by comma, format: ID,Name,Phone,Email,Password,Role
                String[] cookieData = line.split(",");
                loginID = cookieData[0];  // Extract the first part as the login ID (e.g., "M0002")
            }
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return loginID;
    }
    
    // Function to load tasks for the logged-in user into the JTable
    public void loadTasksForUser(JTable Task) {
        String loginID = readLoginID(); // Get the login ID from the cookie
        DefaultTableModel model = (DefaultTableModel) Task.getModel(); // Assuming you have a table model
        model.setRowCount(0); // Clear the table before loading tasks

        try {
            BufferedReader reader = new BufferedReader(new FileReader("src\\\\oodjassignment\\\\database\\\\caseStaffNStatus.txt"));
            String line;
            while ((line = reader.readLine()) != null) {
                // Assuming tasks are stored as: C0001,U0003,Banquet Hall,HALL 1,2024-09-19,Dirty floor,S0001,In Progress
                String[] taskData = line.split(","); 
                if (taskData.length >= 9 && taskData[6].equals(loginID)) { 
                // 如果taskData数组有足够的长度并且第7项与登录ID匹配，则添加到表格
                model.addRow(new Object[]{
                    taskData[0], taskData[1], taskData[2], taskData[3], taskData[4], taskData[5], taskData[6], taskData[7], taskData[8]
                });
            }
        }
        reader.close();
    } catch (IOException e) {
        e.printStackTrace();
    }
    }
}
