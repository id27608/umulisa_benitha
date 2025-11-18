package id27608.q2;

public class CabinCrew extends Entity {
    private String crewName;
    private String role;
    private String shift;

    public CabinCrew(int id, String crewName, String role, String shift) {
        super(id);
        if (role == null || role.isEmpty()) {
            throw new IllegalArgumentException("Role cannot be empty");
        }
        if (!shift.equals("Day") && !shift.equals("Night")) {
            throw new IllegalArgumentException("Shift must be 'Day' or 'Night'");
        }
        this.crewName = crewName;
        this.role = role;
        this.shift = shift;
    }

    public String getCrewName() {
        return crewName;
    }

    public String getRole() {
        return role;
    }

    public String getShift() {
        return shift;
    }

    @Override
    public String toString() {
        return "CabinCrew{" + "id=" + id + ", name=" + crewName + ", role=" + role + ", shift=" + shift + '}';
    }
}
