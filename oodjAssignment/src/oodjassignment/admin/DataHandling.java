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

    public boolean writeData(String[] record) {
        try (FileWriter writer = new FileWriter(filePath, true)) { // Append mode
            writer.write(String.join(",", record) + "\n");
            return true;
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }
    }

    public boolean updateData(int rowIndex, String[] newRecord) {
        List<String[]> data = readData();
        if (rowIndex >= 0 && rowIndex < data.size()) {
            data.set(rowIndex, newRecord);
            return writeData(data, false); // Overwrite the file
        }
        return false;
    }

    public boolean deleteData(int rowIndex) {
        List<String[]> data = readData();
        if (rowIndex >= 0 && rowIndex < data.size()) {
            data.remove(rowIndex);
            return writeData(data, false); // Overwrite the file
        }
        return false;
    }

    private boolean writeData(List<String[]> data, boolean append) {
        try (FileWriter writer = new FileWriter(filePath, append)) {
            for (String[] record : data) {
                writer.write(String.join(",", record) + "\n");
            }
            return true;
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }
    }
}
