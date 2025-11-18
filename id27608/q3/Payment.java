package id27608.q3;

import java.time.LocalDate;
public class Payment extends Entity {
    private LocalDate paymentDate;
    private double paymentAmount;
    private TaxAssessment taxAssessment;

    public Payment(int id, LocalDate paymentDate, double paymentAmount, TaxAssessment taxAssessment) {
        super(id);
        if (paymentAmount <= 0) {
            throw new IllegalArgumentException("Payment amount must be greater than 0");
        }
        this.paymentDate = paymentDate;
        this.paymentAmount = paymentAmount;
        this.taxAssessment = taxAssessment;
    }

    public LocalDate getPaymentDate() {
        return paymentDate;
    }

    public double getPaymentAmount() {
        return paymentAmount;
    }

    public TaxAssessment getTaxAssessment() {
        return taxAssessment;
    }

    @Override
    public String toString() {
        return "Payment{" + "id=" + id + ", date=" + paymentDate + ", amount=" + paymentAmount + '}';
    }
}
