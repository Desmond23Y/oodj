package oodjassignment.admin;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class DataHandling {

    private String filePath;

    public DataHandling(String filePath) {
        this.filePath = filePath;
    }

    public List<String[]> readData() {
        List<String[]> data = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = br.readLine()) != null) {
                data.add(line.split(","));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return data;
    }

    public void writeData(List<String[]> data, boolean append) {
        try (FileWriter writer = new FileWriter(filePath, append)) {
            for (String[] record : data) {
                writer.write(String.join(",", record) + "\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void updateData(int rowIndex, String[] newRecord) {
        List<String[]> data = readData();
        if (rowIndex >= 0 && rowIndex < data.size()) {
            data.set(rowIndex, newRecord);
            writeData(data, false); // Overwrite the file
        }
    }

    public void deleteData(int rowIndex) {
        List<String[]> data = readData();
        if (rowIndex >= 0 && rowIndex < data.size()) {
            data.remove(rowIndex);
            writeData(data, false); // Overwrite the file
        }
    }

    public void appendData(String newRecord) throws IOException {
        try (FileWriter writer = new FileWriter(filePath, true)) {
            writer.write(newRecord);
        }
    }
}
