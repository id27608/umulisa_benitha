package id27608.q4;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;


public class ProcurementReport extends Entity {
    private final LocalDate reportDate;
    private final String summary;
    private final List<Invoice> invoices;

    public ProcurementReport(int id, LocalDate reportDate, String summary, List<Invoice> invoices) {
        super(id);
        this.reportDate = reportDate;
        this.summary = summary;
        this.invoices = invoices != null ? invoices : new ArrayList<>();
    }

    public LocalDate getReportDate() {
        return reportDate;
    }

    public String getSummary() {
        return summary;
    }

    public List<Invoice> getInvoices() {
        return invoices;
    }

    public void addInvoice(Invoice invoice) {
        invoices.add(invoice);
    }

    public double calculateTotal() {
        return calculateTotalAmount();
    }

    private double calculateTotalAmount() {
        double total = 0.0;
        for (Invoice invoice : invoices) {
            total += invoice.getInvoiceAmount();
        }
        return total;
    }

    public String generateReport() {
        StringBuilder report = new StringBuilder();
        report.append("===== PROCUREMENT REPORT =====\n");
        report.append("Report Date: ").append(reportDate).append("\n");
        report.append("Summary: ").append(summary).append("\n");
        report.append("---\n");
        report.append("Total Invoice Amount: ").append(calculateTotalAmount()).append("\n");
        report.append("Total Invoices: ").append(invoices.size()).append("\n");
        report.append("---\n");
        report.append("Invoice Details:\n");

        for (Invoice invoice : invoices) {
            report.append("  - Invoice No: ").append(invoice.getInvoiceNo())
                  .append(", Amount: ").append(invoice.getInvoiceAmount())
                  .append("\n");
        }

        report.append("===============================\n");
        return report.toString();
    }

    @Override
    public String toString() {
        return "ProcurementReport{" + "id=" + id + ", date=" + reportDate + ", totalAmount=" + calculateTotalAmount() 
               + ", invoiceCount=" + invoices.size() + '}';
    }
}