package id27608.q2;

import java.time.LocalDate;

public class Ticket extends Entity {
    private String ticketNumber;
    private LocalDate issueDate;
    private Booking booking;
    private Payment payment;

    public Ticket(int id, String ticketNumber, LocalDate issueDate, Booking booking, Payment payment) {
        super(id);
        double baseFare = booking.getFlight().getFare();
        double totalAmount = calculateFare(baseFare, booking.getTravelClass());
        
        if (payment.getAmountPaid() < totalAmount) {
            throw new IllegalArgumentException("Payment amount insufficient for ticket");
        }
        
        this.ticketNumber = ticketNumber;
        this.issueDate = issueDate;
        this.booking = booking;
        this.payment = payment;
    }

    private double calculateFare(double baseFare, String travelClass) {
        double tax = baseFare * 0.10;
        double classMultiplier = travelClass.equals("Economy") ? 1.0 : 
                                 travelClass.equals("Business") ? 1.5 : 2.0;
        return (baseFare * classMultiplier) + tax;
    }

    public String getTicketNumber() {
        return ticketNumber;
    }

    public LocalDate getIssueDate() {
        return issueDate;
    }

    public Booking getBooking() {
        return booking;
    }

    public Payment getPayment() {
        return payment;
    }

    public double calculateFinalPrice() {
        double baseFare = booking.getFlight().getFare();
        return calculateFare(baseFare, booking.getTravelClass());
    }

    @Override
    public String toString() {
        return "Ticket{" + "id=" + id + ", number=" + ticketNumber + ", date=" + issueDate 
               + ", finalPrice=" + calculateFinalPrice() + '}';
    }
}