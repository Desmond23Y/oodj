
package oodjassignment.manager;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class WriteCase {
    private final String CaseIdfilePath = "src/oodjassignment/database/CaseId.txt";
    private final String feedbackFilePath = "src/oodjassignment/database/feedback.txt";
    private final String caseStaffNStatusFilePath = "src/oodjassignment/database/caseStaffNStatus.txt";

    public void writeCaseIds(List<String> caseIds, List<String> existingCaseIds) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(CaseIdfilePath, true))) { // Append mode
            for (String caseId : caseIds) {
                if (!existingCaseIds.contains(caseId)) {
                    bw.write(caseId);
                    bw.newLine();
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void writeUpdatedCaseNStaffStatus() {
        try (BufferedReader feedbackReader = new BufferedReader(new FileReader(feedbackFilePath));
             BufferedWriter caseStaffNStatusWriter = new BufferedWriter(new FileWriter(caseStaffNStatusFilePath, true))) {
            
            String feedbackLine;
            
            // Read feedback.txt and write to caseStaffNStatus.txt
            while ((feedbackLine = feedbackReader.readLine()) != null) {
                String[] feedbackData = feedbackLine.split(",");
                String caseId = feedbackData[0];
                
                if (!caseIdExists(caseId, caseStaffNStatusFilePath)) {
                    StringBuilder newLine = new StringBuilder(feedbackLine);
                    newLine.append(",-,-");
                    caseStaffNStatusWriter.write(newLine.toString());
                    caseStaffNStatusWriter.newLine();
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    // Method to check if a case ID exists in caseStaffNStatus.txt
    private boolean caseIdExists(String caseId, String filePath) {
        try (BufferedReader caseStaffNStatusReader = new BufferedReader(new FileReader(filePath))) {
            String caseStaffNStatusLine;
            while ((caseStaffNStatusLine = caseStaffNStatusReader.readLine()) != null) {
                String[] caseData = caseStaffNStatusLine.split(",");
                if (caseData[0].equals(caseId)) {
                    return true;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return false;
    }    
    
    
    public void updateStaff(List<String[]> fileContent){
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(caseStaffNStatusFilePath))) {
            for (String[] parts : fileContent) {
                writer.write(String.join(",", parts));
                writer.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    public void updateStatus(List<String[]> fileContent) {
    try (BufferedWriter writer = new BufferedWriter(new FileWriter("path/to/your/file.txt"))) {
        for (String[] row : fileContent) {
            writer.write(String.join(",", row));
            writer.newLine();
        }
    } catch (IOException e) {
        e.printStackTrace();
    }
}

}