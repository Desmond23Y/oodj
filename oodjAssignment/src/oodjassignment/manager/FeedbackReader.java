
package oodjassignment.manager;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FeedbackReader {
    public static String[] readFeedback(String caseID) {
        String filePath1 = "src/oodjassignment/database/feedback.txt";
        try (BufferedReader br = new BufferedReader(new FileReader(filePath1))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] data = line.split(",");
                if (data[0].equals(caseID)) {
                    return data;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
    public static String[] readcaseStaffNStatus(String caseID) {
        String filePath1 = "src/oodjassignment/database/caseStaffNStatus.txt";
        try (BufferedReader br = new BufferedReader(new FileReader(filePath1))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] data = line.split(",");
                if (data[0].equals(caseID)) {
                    return data;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
}
