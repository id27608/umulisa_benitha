package id27608.q2;

public class Pilot extends Entity {
    private String pilotName;
    private String licenseNumber;
    private int yearsExperience;

    public Pilot(int id, String pilotName, String licenseNumber, int yearsExperience) {
        super(id);
        if (licenseNumber == null || licenseNumber.isEmpty()) {
            throw new IllegalArgumentException("License number cannot be empty");
        }
        if (yearsExperience < 2) {
            throw new IllegalArgumentException("Years of experience must be at least 2");
        }
        this.pilotName = pilotName;
        this.licenseNumber = licenseNumber;
        this.yearsExperience = yearsExperience;
    }

    public String getPilotName() {
        return pilotName;
    }

    public String getLicenseNumber() {
        return licenseNumber;
    }

    public int getYearsExperience() {
        return yearsExperience;
    }

    @Override
    public String toString() {
        return "Pilot{" + "id=" + id + ", name=" + pilotName + ", license=" + licenseNumber 
               + ", experience=" + yearsExperience + " years}";
    }
}
