package id27608.q3;

public class TaxRecord extends Entity {
    private final String receiptNo;
    private final double totalTax;
    private final Payment payment;
    private final TaxAssessment taxAssessment;

    public TaxRecord(int id, String receiptNo, Payment payment, TaxAssessment taxAssessment) {
        super(id);
        this.receiptNo = receiptNo;
        this.payment = payment;
        this.taxAssessment = taxAssessment;
        this.totalTax = computeTax(taxAssessment); // compute tax
    }

    public static double computeTax(TaxAssessment assessment) {
        TaxDeclaration declaration = assessment.getTaxDeclaration();
        TaxCategory category = declaration.getTaxCategory();

        double rate = category.getRate();
        double taxableAmount = declaration.getTotalIncome();
        double computedTax = taxableAmount * rate; // base calculation

        return computedTax;
    }

    public String getReceiptNo() {
        return receiptNo;
    }

    public double getTotalTax() {
        return totalTax;
    }

    public Payment getPayment() {
        return payment;
    }

    public TaxAssessment getTaxAssessment() {
        return taxAssessment;
    }

    public double getFinalTaxAmount() {
        return totalTax;
    }

    @Override
    public String toString() {
        return "TaxRecord{" + "id=" + id + ", receipt=" + receiptNo + ", totalTax=" + totalTax 
               + ", paymentAmount=" + payment.getPaymentAmount() + '}';
    }
}