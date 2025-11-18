package id27608.q2;

import java.util.regex.Pattern;
// ============== CLASS 3: AIRLINE ==============
public class Airline extends Entity {
    private String airlineName;
    private String airlineCode;
    private String contactEmail;

    public Airline(int id, String airlineName, String airlineCode, String contactEmail) {
        super(id);
        if (airlineCode == null || airlineCode.length() != 2 || !airlineCode.matches("[A-Z]{2}")) {
            throw new IllegalArgumentException("Airline code must be exactly 2 uppercase letters");
        }
        if (!isValidEmail(contactEmail)) {
            throw new IllegalArgumentException("Invalid email format");
        }
        this.airlineName = airlineName;
        this.airlineCode = airlineCode;
        this.contactEmail = contactEmail;
    }

    private boolean isValidEmail(String email) {
        String emailRegex = "^[A-Za-z0-9+_.-]+@(.+)$";
        return email != null && Pattern.matches(emailRegex, email);
    }

    public String getAirlineName() {
        return airlineName;
    }

    public String getAirlineCode() {
        return airlineCode;
    }

    public String getContactEmail() {
        return contactEmail;
    }

    @Override
    public String toString() {
        return "Airline{" + "id=" + id + ", name=" + airlineName + ", code=" + airlineCode + ", email=" + contactEmail + '}';
    }
}
