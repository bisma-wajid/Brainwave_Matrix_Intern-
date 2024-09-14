import java.text.SimpleDateFormat;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        // Initialize the system components
        EHR ehr = new EHR();
        Inventory inventory = new Inventory();

        // Create some patients
        Patient patient1 = new Patient("P001", "Alice Smith", "1985-06-15", "555-1234");
        Patient patient2 = new Patient("P002", "Bob Johnson", "1978-09-23", "555-5678");

        // Print patient details
        System.out.println("Patient Details:");
        System.out.println(patient1);
        System.out.println(patient2);
        System.out.println();

        // Create and schedule appointments
        try {
            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm");
            Date appointmentDate1 = dateFormat.parse("2024-10-01 10:00");
            Date appointmentDate2 = dateFormat.parse("2024-10-01 14:00");

            Appointment appointment1 = new Appointment("A001", "P001", appointmentDate1, "Dr. Adams");
            Appointment appointment2 = new Appointment("A002", "P002", appointmentDate2, "Dr. Baker");

            // Print appointment details
            System.out.println("Appointment Details:");
            System.out.println(appointment1);
            System.out.println(appointment2);
            System.out.println();
        } catch (Exception e) {
            e.printStackTrace();
        }

        // Add and manage electronic health records (EHR)
        ehr.addRecord("P001", "Allergy to penicillin.");
        ehr.addRecord("P002", "High blood pressure.");

        System.out.println("EHR Records:");
        System.out.println("Patient P001 Record: " + ehr.getRecord("P001"));
        System.out.println("Patient P002 Record: " + ehr.getRecord("P002"));
        System.out.println();

        // Create invoices
        Invoice invoice1 = new Invoice("I001", "P001", 150.00, false);
        Invoice invoice2 = new Invoice("I002", "P002", 200.00, true);

        System.out.println("Invoice Details:");
        System.out.println(invoice1);
        System.out.println(invoice2);
        System.out.println();

        // Manage inventory
        inventory.addSupply("Bandages", 100);
        inventory.addSupply("Antibiotics", 50);
        inventory.removeSupply("Bandages", 20);

        System.out.println("Inventory Status:");
        System.out.println("Bandages stock: " + inventory.checkStock("Bandages"));
        System.out.println("Antibiotics stock: " + inventory.checkStock("Antibiotics"));
        System.out.println();

        // Create and manage staff
        Staff staff1 = new Staff("S001", "Dr. Adams", "Doctor", "555-8765");
        Staff staff2 = new Staff("S002", "Nurse Jane", "Nurse", "555-4321");

        System.out.println("Staff Details:");
        System.out.println(staff1);
        System.out.println(staff2);
    }
}
