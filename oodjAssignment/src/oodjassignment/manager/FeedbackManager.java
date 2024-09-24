
package oodjassignment.manager;

import java.io.*;
import java.util.*;

public class FeedbackManager {
    private static final String FILE_PATH = "src/oodjassignment/database/feedback.txt";

    public static Feedback findFeedbackByCaseId(String caseId) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(FILE_PATH));
        String line;
        while ((line = reader.readLine()) != null) {
            String[] parts = line.split(",");
            if (parts[0].equals(caseId)) {
                reader.close();
                return new Feedback(parts[0], parts[1], parts[2], parts[3], parts[4], parts[5], parts[6], parts[7]);
            }
        }
        reader.close();
        return null;
    }

    public static void writeFeedbackToFile(Feedback feedback) throws IOException {
        BufferedWriter writer = new BufferedWriter(new FileWriter("caseStaffNStatus.txt"));
        writer.write("Case ID: " + feedback.getCaseId() + "\n");
        writer.write("Customer ID: " + feedback.getCustomerId() + "\n");
        writer.write("Hall Type: " + feedback.getHallType() + "\n");
        writer.write("Hall Number: " + feedback.getHallNumber() + "\n");
        writer.write("Date: " + feedback.getDate() + "\n");
        writer.write("Feedback: " + feedback.getFeedback() + "\n");
        writer.write("Assigned Staff: " + feedback.getAssignedStaff() + "\n");
        writer.write("Status: " + feedback.getStatus() + "\n");
        writer.close();
    }
}
