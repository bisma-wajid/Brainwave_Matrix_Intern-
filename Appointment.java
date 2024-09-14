import java.util.Date;

public class Appointment {
    private String appointmentId;
    private String patientId;
    private Date appointmentDate;
    private String doctorName;

    // Constructor
    public Appointment(String appointmentId, String patientId, Date appointmentDate, String doctorName) {
        this.appointmentId = appointmentId;
        this.patientId = patientId;
        this.appointmentDate = appointmentDate;
        this.doctorName = doctorName;
    }

    // Getters and Setters
    public String getAppointmentId() { return appointmentId; }
    public void setAppointmentId(String appointmentId) { this.appointmentId = appointmentId; }
    public String getPatientId() { return patientId; }
    public void setPatientId(String patientId) { this.patientId = patientId; }
    public Date getAppointmentDate() { return appointmentDate; }
    public void setAppointmentDate(Date appointmentDate) { this.appointmentDate = appointmentDate; }
    public String getDoctorName() { return doctorName; }
    public void setDoctorName(String doctorName) { this.doctorName = doctorName; }

    @Override
    public String toString() {
        return "Appointment ID: " + appointmentId + ", Patient ID: " + patientId + ", Date: " + appointmentDate + ", Doctor: " + doctorName;
    }
}

