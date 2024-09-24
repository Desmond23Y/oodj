package oodjassignment.user;

import java.io.*;
import java.util.List;
import javax.swing.JOptionPane;

public class Transaction {

    protected void readFile(String filePath, List<String> fileContent) {
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                fileContent.add(line);
            }
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Error reading the file: " + filePath);
        }
    }

    protected void writeFile(String filePath, List<String> fileContent) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))) {
            for (String updatedLine : fileContent) {
                writer.write(updatedLine);
                writer.newLine();
            }
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Error writing to the file: " + filePath);
        }
    }
}
