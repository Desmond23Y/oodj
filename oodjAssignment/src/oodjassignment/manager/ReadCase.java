
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
    
    public List<String[]> readCaseStaffStatus() {
        List<String[]> caseStaffStatus = new ArrayList<>();
        String filePath = "src/oodjassignment/database/caseStaffNStatus.txt";
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] fields = line.split(",");
                caseStaffStatus.add(fields);
            }
        } catch (IOException e) {
            System.err.println("Error reading file: " + e.getMessage());
        }
        return caseStaffStatus;
    }
    
    public List<String> readStaffData() {
        List<String> staffList = new ArrayList<>();
        String filePath = "src/oodjassignment/database/Scheduler.txt";
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] data = line.split(",");
                String staffInfo = data[0] + " - " + data[1]; // Format: S0001 - Ooi Hong
                staffList.add(staffInfo);
            }
        } catch (IOException ex) {
            System.err.println("Error reading file: " + ex.getMessage());
        }
        return staffList;
    }

    public String getCustomerId() { return customerId; }
    public String getHallTypeValue() { return hallTypeValue; }
    public String getHallNoValue() { return hallNoValue; }
    public String getDateValue() { return dateValue; }
    public String getFeedbackText() { return feedbackText; }
    public ReadCase(String caseId) { this.caseId = caseId; }
}