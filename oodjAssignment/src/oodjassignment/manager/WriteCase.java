
package oodjassignment.manager;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class WriteCase {
    private String filePath = "src/oodjassignment/database/CaseId.txt";

    public void writeCaseIds(List<String> caseIds, List<String> existingCaseIds) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(filePath, true))) { // Append mode
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
}
