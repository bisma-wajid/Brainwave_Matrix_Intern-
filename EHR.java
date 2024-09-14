import java.util.HashMap;
import java.util.Map;

public class EHR {
    private Map<String, String> records; // Map patient ID to medical record

    public EHR() {
        this.records = new HashMap<>();
    }

    public void addRecord(String patientId, String record) {
        records.put(patientId, record);
    }

    public String getRecord(String patientId) {
        return records.get(patientId);
    }

    public void updateRecord(String patientId, String record) {
        records.put(patientId, record);
    }
}

