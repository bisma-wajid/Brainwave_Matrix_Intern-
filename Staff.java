public class Staff{
    private String staffId;
    private String name;
    private String role;
    private String contactNumber;

    // Constructor
    public Staff(String staffId, String name, String role, String contactNumber) {
        this.staffId = staffId;
        this.name = name;
        this.role = role;
        this.contactNumber = contactNumber;
    }

    // Getters and Setters
    public String getStaffId() { return staffId; }
    public void setStaffId(String staffId) { this.staffId = staffId; }
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public String getRole() { return role; }
    public void setRole(String role) { this.role = role; }
    public String getContactNumber() { return contactNumber; }
    public void setContactNumber(String contactNumber) { this.contactNumber = contactNumber; }

    @Override
    public String toString() {
        return "Staff ID: " + staffId + ", Name: " + name + ", Role: " + role + ", Contact: " + contactNumber;
    }
}
