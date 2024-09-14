public class Invoice {
    private String invoiceId;
    private String patientId;
    private double amount;
    private boolean paid;

    // Constructor
    public Invoice(String invoiceId, String patientId, double amount, boolean paid) {
        this.invoiceId = invoiceId;
        this.patientId = patientId;
        this.amount = amount;
        this.paid = paid;
    }

    // Getters and Setters
    public String getInvoiceId() { return invoiceId; }
    public void setInvoiceId(String invoiceId) { this.invoiceId = invoiceId; }
    public String getPatientId() { return patientId; }
    public void setPatientId(String patientId) { this.patientId = patientId; }
    public double getAmount() { return amount; }
    public void setAmount(double amount) { this.amount = amount; }
    public boolean isPaid() { return paid; }
    public void setPaid(boolean paid) { this.paid = paid; }

    @Override
    public String toString() {
        return "Invoice ID: " + invoiceId + ", Patient ID: " + patientId + ", Amount: " + amount + ", Paid: " + paid;
    }
}
