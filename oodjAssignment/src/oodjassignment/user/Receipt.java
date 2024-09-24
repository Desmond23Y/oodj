package oodjassignment.user;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import javax.swing.JOptionPane;

public class Receipt {
    private String hallType;
    private String hall;
    private String price;
    private LocalDateTime date;

    public Receipt(String hallType, String hall, String price) {
        this.hallType = hallType;
        this.hall = hall;
        this.price = price;
        this.date = LocalDateTime.now();
    }

    public void print() {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        String receipt = "----------- Receipt -----------\n" +
                         "Date: " + dtf.format(date) + "\n" +
                         "Hall Type: " + hallType + "\n" +
                         "Hall: " + hall + "\n" +
                         "Price: " + price + "\n" +
                         "-------------------\n" +
                         "Thank you for your payment!";
        JOptionPane.showMessageDialog(null, receipt, "Payment Receipt", JOptionPane.INFORMATION_MESSAGE);
    }
}
