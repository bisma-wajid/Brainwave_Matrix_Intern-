public class Patient {
    private String patientId;
    private String name;
    private String dateOfBirth;
    private String contactNumber;

    // Constructor
    public Patient(String patientId, String name, String dateOfBirth, String contactNumber) {
        this.patientId = patientId;
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.contactNumber = contactNumber;
    }

    // Getters and Setters
    public String getPatientId() { return patientId; }
    public void setPatientId(String patientId) { this.patientId = patientId; }
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public String getDateOfBirth() { return dateOfBirth; }
    public void setDateOfBirth(String dateOfBirth) { this.dateOfBirth = dateOfBirth; }
    public String getContactNumber() { return contactNumber; }
    public void setContactNumber(String contactNumber) { this.contactNumber = contactNumber; }

    @Override
    public String toString() {
        return "Patient ID: " + patientId + ", Name: " + name + ", DOB: " + dateOfBirth + ", Contact: " + contactNumber;
    }
}
