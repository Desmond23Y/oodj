
package oodjassignment.manager;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadFeedback {
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
        String filePath2 = "src/oodjassignment/database/caseStaffNStatus.txt";
        try (BufferedReader br = new BufferedReader(new FileReader(filePath2))) {
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
    
    public static String[] readResponses(String caseID) {
        String filePath3 = "src/oodjassignment/database/Responses.txt";
        try (BufferedReader br = new BufferedReader(new FileReader(filePath3))) {
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
