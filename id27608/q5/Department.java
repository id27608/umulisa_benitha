package id27608.q5;

public class Department extends Entity {
    private String departmentName;
    private String departmentHead;
    private Institution institution;

    public Department(int id, String departmentName, String departmentHead, Institution institution) {
        super(id);
        if (departmentName == null || departmentName.isEmpty()) {
            throw new IllegalArgumentException("Department name cannot be empty");
        }
        if (departmentHead == null || departmentHead.isEmpty()) {
            throw new IllegalArgumentException("Department head cannot be empty");
        }
        this.departmentName = departmentName;
        this.departmentHead = departmentHead;
        this.institution = institution;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public String getDepartmentHead() {
        return departmentHead;
    }

    public Institution getInstitution() {
        return institution;
    }

    @Override
    public String toString() {
        return "Department{" + "id=" + id + ", name=" + departmentName + ", head=" + departmentHead 
               + ", institution=" + institution.getInstitutionName() + '}';
    }
}
