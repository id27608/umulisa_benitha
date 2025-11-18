
package id27608.q2;

import java.time.LocalDate;

public class Flight extends Entity {
    private String flightNumber;
    private Airport departure;
    private Airport destination;
    private LocalDate departureDate;
    private double fare;

    public Flight(int id, String flightNumber, Airport departure, Airport destination, LocalDate departureDate, double fare) {
        super(id);
        if (flightNumber == null || flightNumber.isEmpty()) {
            throw new IllegalArgumentException("Flight number cannot be empty");
        }
        if (departure == null || destination == null) {
            throw new IllegalArgumentException("Departure and destination airports cannot be null");
        }
        if (fare <= 0) {
            throw new IllegalArgumentException("Fare must be greater than 0");
        }
        if (departureDate == null) {
            throw new IllegalArgumentException("Departure date cannot be null");
        }
        
        this.flightNumber = flightNumber;
        this.departure = departure;
        this.destination = destination;
        this.departureDate = departureDate;
        this.fare = fare;
    }

    public String getFlightNumber() {
        return flightNumber;
    }

    public Airport getDeparture() {
        return departure;
    }

    public Airport getDestination() {
        return destination;
    }

    public LocalDate getDepartureDate() {
        return departureDate;
    }

    public double getFare() {
        return fare;
    }

    @Override
    public String toString() {
        return "Flight{" + "id=" + id + ", number=" + flightNumber + ", from=" + departure.getCode() 
               + ", to=" + destination.getCode() + ", date=" + departureDate + ", fare=" + fare + '}';
    }
}
