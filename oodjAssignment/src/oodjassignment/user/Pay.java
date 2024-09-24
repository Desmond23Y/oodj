package oodjassignment.user;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JTextField;

// The Pay class implements Updatable and extends Transaction
public class Pay extends Transaction implements Updatable {
    private Receipt receipt;  // Aggregation - Pay can manage a receipt

    public void setReceipt(Receipt receipt) {
        this.receipt = receipt;
    }

    public static void autofillUserData(JTextField id, JTextField type, JTextField hall, JTextField price, JTextField cfPrice) {
        List<String> fileContent = new ArrayList<>();
        Pay transaction = new Pay();
        transaction.readFile("src/oodjassignment/database/Pending.txt", fileContent);

        if (!fileContent.isEmpty()) {
            String[] userData = fileContent.get(0).split("/");
            if (userData.length == 10) {
                id.setText(userData[1]);
                type.setText(userData[2]);
                hall.setText(userData[3]);
                price.setText(userData[4]);
                cfPrice.setText(userData[4]);
            }
        }
    }

    @Override
    public void updateBookingAndSchedule(JTextField type, JTextField hall) {
        String[] filePaths = {
            "src/oodjassignment/database/Booking.txt",
            "src/oodjassignment/database/Schedule.txt",
        };

        for (String filePath : filePaths) {
            List<String> fileContent = new ArrayList<>();
            readFile(filePath, fileContent);

            for (int i = 0; i < fileContent.size(); i++) {
                String line = fileContent.get(i);
                String[] parts = line.split("/");

                if (filePath.contains("Booking.txt") && parts.length == 10) {
                    if (parts[2].equals(type.getText()) && parts[3].equals(hall.getText()) && parts[8].equals("Pending")) {
                        parts[8] = "Booked";
                        fileContent.set(i, String.join("/", parts));
                        break;
                    }
                } else if (filePath.contains("Schedule.txt") && parts.length == 8) {
                    if (parts[0].equals(type.getText()) && parts[1].equals(hall.getText()) && parts[6].equals("Pending")) {
                        parts[6] = "Booked";
                        fileContent.set(i, String.join("/", parts));
                        break;
                    }
                }
            }
            writeFile(filePath, fileContent);
        }
    }

    @Override
    public void updatePendingFile(JTextField type, JTextField hall) {
        String pendingFilePath = "src/oodjassignment/database/Pending.txt";
        List<String> pendingContent = new ArrayList<>();
        readFile(pendingFilePath, pendingContent);

        for (int i = 0; i < pendingContent.size(); i++) {
            String line = pendingContent.get(i);
            String[] parts = line.split("/");
            if (parts[2].equals(type.getText()) && parts[3].equals(hall.getText())) {
                pendingContent.remove(i);
                break;
            }
        }

        writeFile(pendingFilePath, pendingContent);
    }

    public void generateReceipt(String hallType, String hall, String price) {
        this.receipt = new Receipt(hallType, hall, price);
        this.receipt.print();
    }
}
