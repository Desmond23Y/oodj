
package oodjassignment.manager;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ReadCase {
    private String customerId;
    private String hallTypeValue;
    private String hallNoValue;
    private String dateValue;
    private String feedbackText;
    
    private String caseId;
    private String Response;

    public boolean loadCaseData() {
        String filePath = "src/oodjassignment/database/feedback.txt";
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] fields = line.split(",");
                if (fields[0].equals(caseId)) {
                    this.customerId = fields[1];
                    this.hallTypeValue = fields[2];
                    this.hallNoValue = fields[3];
                    this.dateValue = fields[4];
                    this.feedbackText = fields[5];
                    return true;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return false;
    }

    public List<String> readCaseIds() {
        List<String> caseIds = new ArrayList<>();
        String filePath = "src/oodjassignment/database/feedback.txt";
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] fields = line.split(",");
                caseIds.add(fields[0]); // Assuming CaseId is the first field
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return caseIds;
    }

    public List<String> readExistingCaseIds() {
        List<String> existingCaseIds = new ArrayList<>();
        String filePath = "src/oodjassignment/database/CaseId.txt";
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = br.readLine()) != null) {
                existingCaseIds.add(line.trim());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return existingCaseIds;
    }

    public String getCustomerId() { return customerId; }
    public String getHallTypeValue() { return hallTypeValue; }
    public String getHallNoValue() { return hallNoValue; }
    public String getDateValue() { return dateValue; }
    public String getFeedbackText() { return feedbackText; }
    public String getCaseId() { return caseId; }
    public String getResponse() { return Response; }
    public ReadCase(String caseId) { this.caseId = caseId; }
}