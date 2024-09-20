
package oodjassignment.manager;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

public class FilterDate {
    private LocalDate startDate;
    private LocalDate endDate;

    // Constructor
    public FilterDate(String startDate, String endDate) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d MMM yyyy");
        try {
            this.startDate = LocalDate.parse(startDate, formatter);
            this.endDate = LocalDate.parse(endDate, formatter);
        } catch (DateTimeParseException e) {
            e.printStackTrace();
        }
    }

    // Method to validate date range
    public boolean isValidDateRange() {
        return startDate != null && endDate != null && !startDate.isAfter(endDate);
    }

    // Additional methods for date filtering
}