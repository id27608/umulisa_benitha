package id27608.q3;

import java.time.LocalDate;



public class TaxAssessment extends Entity {
    private LocalDate assessmentDate;
    private double assessedTax;
    private LocalDate paymentDate;
    private double paymentAmount;
    private TaxDeclaration taxDeclaration;

    public TaxAssessment(int id, LocalDate assessmentDate, double assessedTax, 
                        LocalDate paymentDate, double paymentAmount, TaxDeclaration taxDeclaration) {
        super(id);
        if (assessedTax < 0) {
            throw new IllegalArgumentException("Assessed tax must be greater than or equal to 0");
        }
        this.assessmentDate = assessmentDate;
        this.assessedTax = assessedTax;
        this.paymentDate = paymentDate;
        this.paymentAmount = paymentAmount;
        this.taxDeclaration = taxDeclaration;
    }

    public LocalDate getAssessmentDate() {
        return assessmentDate;
    }

    public double getAssessedTax() {
        return assessedTax;
    }

    public LocalDate getPaymentDate() {
        return paymentDate;
    }

    public double getPaymentAmount() {
        return paymentAmount;
    }

    public TaxDeclaration getTaxDeclaration() {
        return taxDeclaration;
    }

    @Override
    public String toString() {
        return "TaxAssessment{" + "id=" + id + ", date=" + assessmentDate + ", assessedTax=" + assessedTax 
               + ", paymentDate=" + paymentDate + ", paymentAmount=" + paymentAmount + '}';
    }
}
