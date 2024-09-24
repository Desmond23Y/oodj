
package oodjassignment.manager;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;
import java.util.ArrayList;
import java.io.*;
import javax.swing.table.DefaultTableModel;
import java.util.Arrays;
import javax.swing.JComboBox;
import java.util.Calendar;

public class GenerateCBX {

    public void populateComboBox(JComboBox<String> comboBox, String state) {
        List<String> items = generateCBXArray(state);
        comboBox.removeAllItems(); // Clear existing items
        for (String item : items) {
            comboBox.addItem(item);
        }
    }

    private List<String> generateCBXArray(String state) {
        List<String> days = Arrays.asList(generateDays());
        List<String> weeks = Arrays.asList(generateWeeks());
        List<String> months = Arrays.asList(generateMonths());
        List<String> years = Arrays.asList(generateYears());
        List<String> hallNumbers = Arrays.asList(generateHallNumber());
        if (state.equals("day")) {
            return days;
        } else if (state.equals("week")) {
            return weeks;
        } else if (state.equals("month")) {
            return months;
        } else if (state.equals("year")) {
            return years;
        } else if (state.equals("hallNumber")) {
            return hallNumbers;
        }else {
            return new ArrayList<>(); 
        }
    }
    
    private String[] generateDays() {
        String[] days = new String[32];
        days[0] = "Day"; 
        for (int i = 1; i <= 31; i++) {
            days[i] = String.valueOf(i);
        }
        return days;
    }
    
    private String[] generateWeeks() {
        String[] weeks = new String[54];
        weeks[0] = "Week"; 
        for (int i = 1; i <= 53; i++) {
            weeks[i] = String.valueOf(i);
        }
        return weeks;
    }
    
    private String[] generateMonths() {
        return new String[]{"Month", "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
    }

    private String[] generateYears() {
        return new String[]{"Year", "2024", "2025", "2026", "2027", "2028"};
    }
    
    private String[] generateHallNumber() {
        return new String[]{"Hall Numbers", "Hall 1", "Hall 2", "Hall 3"};
    }
}
