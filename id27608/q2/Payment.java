
package id27608.q2;

import java.time.LocalDate;

public class Payment extends Entity {
    private LocalDate paymentDate;
    private String paymentMethod;
    private double amountPaid;

    public Payment(int id, LocalDate paymentDate, String paymentMethod, double amountPaid) {
        super(id);
        if (amountPaid <= 0) {
            throw new IllegalArgumentException("Amount must be greater than 0");
        }
        if (paymentMethod == null || paymentMethod.isEmpty()) {
            throw new IllegalArgumentException("Payment method cannot be empty");
        }
        this.paymentDate = paymentDate;
        this.paymentMethod = paymentMethod;
        this.amountPaid = amountPaid;
    }

    public LocalDate getPaymentDate() {
        return paymentDate;
    }

    public String getPaymentMethod() {
        return paymentMethod;
    }

    public double getAmountPaid() {
        return amountPaid;
    }

    @Override
    public String toString() {
        return "Payment{" + "id=" + id + ", date=" + paymentDate + ", method=" + paymentMethod 
               + ", amount=" + amountPaid + '}';
    }
}
