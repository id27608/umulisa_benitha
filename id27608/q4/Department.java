package id27608.q4; 


public class Department extends Entity {
    private String deptName;
    private String deptCode;
    private Organization organization;

    public Department(int id, String deptName, String deptCode, Organization organization) {
        super(id);
        if (deptCode == null || deptCode.length() < 3 || !deptCode.matches("[A-Z0-9]{3,}")) {
            throw new IllegalArgumentException("Code must be at least 3 alphanumeric characters");
        }
        this.deptName = deptName;
        this.deptCode = deptCode;
        this.organization = organization;
    }

    public String getDeptName() {
        return deptName;
    }

    public String getDeptCode() {
        return deptCode;
    }

    public Organization getOrganization() {
        return organization;
    }

    @Override
    public String toString() {
        return "Department{" + "id=" + id + ", name=" + deptName + ", code=" + deptCode 
               + ", org=" + organization.getOrgName() + '}';
    }
}
