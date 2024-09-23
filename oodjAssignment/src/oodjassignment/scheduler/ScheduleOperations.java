/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oodjassignment.scheduler;

import javax.swing.JComboBox;
import javax.swing.JTable;
import javax.swing.JTextField;

/**
 *
 * @author Acer
 */
public interface ScheduleOperations {
    void addSchedule(JTextField Remarks, JTextField Date, JTextField Price, JTextField time, JTextField duration, JComboBox<String> halltype, JComboBox<String> hall_no, JComboBox<String> status, JTable Aschedule);
    void updateSchedule(JTable Aschedule, JComboBox<String> halltype, JComboBox<String> hall_no, JTextField Price, JTextField Date, JTextField time, JTextField duration, JComboBox<String> status, JTextField Remarks);
    void deleteSchedule(JTable Aschedule);
}
