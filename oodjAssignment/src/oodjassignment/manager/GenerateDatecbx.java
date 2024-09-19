
package oodjassignment.manager;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import javax.swing.JComboBox;

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
        } else {
            return new ArrayList<>(); // Return an empty list if state is invalid
        }
    }

    private String[] generateDays() {
        String[] days = new String[31];
        for (int i = 1; i <= 31; i++) {
            days[i - 1] = String.valueOf(i);
        }
        return days;
    }

    private String[] generateMonths() {
        return new String[]{"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
    }

    private String[] generateYears() {
        return new String[]{"2024", "2025", "2026", "2027", "2028"};
    }
}
