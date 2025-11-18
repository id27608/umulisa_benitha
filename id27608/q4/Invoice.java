package id27608.q4;

    
public class Invoice extends Entity {
    private String invoiceNo;
    private double invoiceAmount;
    private Inspection inspection;

    public Invoice(int id, String invoiceNo, double invoiceAmount, Inspection inspection) {
        super(id);
        if (invoiceAmount <= 0) {
            throw new IllegalArgumentException("Invoice amount must be greater than 0");
        }
        this.invoiceNo = invoiceNo;
        this.invoiceAmount = invoiceAmount;
        this.inspection = inspection;
    }

    public String getInvoiceNo() {
        return invoiceNo;
    }

    public double getInvoiceAmount() {
        return invoiceAmount;
    }

    public Inspection getInspection() {
        return inspection;
    }

    @Override
    public String toString() {
        return "Invoice{" + "id=" + id + ", number=" + invoiceNo + ", amount=" + invoiceAmount + '}';
    }
}