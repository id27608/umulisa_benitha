
package id27608.q2;

import java.time.LocalDate;

public class Booking extends Entity {
    private LocalDate bookingDate;
    private String seatNumber;
    private String travelClass;
    private Passenger passenger;
    private Flight flight;

    public Booking(int id, LocalDate bookingDate, String seatNumber, String travelClass, Passenger passenger, Flight flight) {
        super(id);
        if (!travelClass.equals("Economy") && !travelClass.equals("Business") && !travelClass.equals("First")) {
            throw new IllegalArgumentException("Class must be Economy, Business, or First");
        }
        this.bookingDate = bookingDate;
        this.seatNumber = seatNumber;
        this.travelClass = travelClass;
        this.passenger = passenger;
        this.flight = flight;
    }

    public LocalDate getBookingDate() {
        return bookingDate;
    }

    public String getSeatNumber() {
        return seatNumber;
    }

    public String getTravelClass() {
        return travelClass;
    }

    public Passenger getPassenger() {
        return passenger;
    }

    public Flight getFlight() {
        return flight;
    }

    @Override
    public String toString() {
        return "Booking{" + "id=" + id + ", date=" + bookingDate + ", seat=" + seatNumber 
               + ", class=" + travelClass + ", passenger=" + passenger.getPassengerName() 
               + ", flight=" + flight.getFlightNumber() + '}';
    }
}
