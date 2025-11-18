package id27608.q2;

public class Airport extends Entity {
    private String airportName;
    private String code;
    private String location;

    public Airport(int id, String airportName, String code, String location) {
        super(id);
        if (code == null || code.length() != 3 || !code.matches("[A-Z]{3}")) {
            throw new IllegalArgumentException("Code must be exactly 3 uppercase letters");
        }
        this.airportName = airportName;
        this.code = code;
        this.location = location;
    }

    public String getAirportName() {
        return airportName;
    }

    public String getCode() {
        return code;
    }

    public String getLocation() {
        return location;
    }

    @Override
    public String toString() {
        return "Airport{" + "id=" + id + ", name=" + airportName + ", code=" + code + ", location=" + location + '}';
    }
}
