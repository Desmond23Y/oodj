
package oodjassignment.manager;

import java.io.*;
import java.util.*;

public class WriteResponses {
    private String filePath;

    public WriteResponses(String filePath) {
        this.filePath = filePath;
    }

    public boolean updateResponse(String caseId, String newMessage) {
        File file = new File(filePath);
        List<String> lines = new ArrayList<>();
        boolean found = false;

        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(",");
                if (parts[0].equals(caseId)) {
                    parts[1] = newMessage;
                    found = true;
                }
                lines.add(String.join(",", parts));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        if (found) {
            try (BufferedWriter writer = new BufferedWriter(new FileWriter(file))) {
                for (String line : lines) {
                    writer.write(line);
                    writer.newLine();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        return found;
    }
}
