
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

public class GenerateDatecbx {

    public void populateComboBox(JComboBox<String> comboBox, String state) {
        List<String> items = generateDateArray(state);
        comboBox.removeAllItems(); // Clear existing items
        for (String item : items) {
            comboBox.addItem(item);
        }
    }

    private List<String> generateDateArray(String state) {
        List<String> days = Arrays.asList(generateDays());
        List<String> months = Arrays.asList(generateMonths());
        List<String> years = Arrays.asList(generateYears());
        if (state.equals("day")) {
            return days;
        } else if (state.equals("month")) {
            return months;
        } else if (state.equals("year")) {
            return years;
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


    private String[] generateMonths() {
        return new String[]{"Month", "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
    }

    private String[] generateYears() {
        return new String[]{"Year", "2024", "2025", "2026", "2027", "2028"};
    }
    
    public String[] generateMondays(int year) {
    List<String> mondaysList = new ArrayList<>();
    Calendar calendar = Calendar.getInstance();
    calendar.set(Calendar.YEAR, year);
    calendar.set(Calendar.DAY_OF_WEEK, Calendar.MONDAY);
    calendar.set(Calendar.DAY_OF_WEEK_IN_MONTH, 1);

    while (calendar.get(Calendar.YEAR) == year) {
        mondaysList.add(String.format("%1$td %1$tb %1$tY", calendar));
        calendar.add(Calendar.WEEK_OF_YEAR, 1);
    }

    // Convert the list to an array
    String[] mondays = new String[mondaysList.size()];
    mondaysList.toArray(mondays);

    return mondays;
}

}
