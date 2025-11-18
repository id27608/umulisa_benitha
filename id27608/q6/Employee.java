
package id27608.q6;

public class Employee extends Entity {
    private int employeeID;
    private String fullName;
    private String position;
    private double baseSalary;
    private boolean rasRegistered;
    private Department department;

    public Employee(int id, int employeeID, String fullName, String position, double baseSalary, 
                   boolean rasRegistered, Department department) {
        super(id);
        if (employeeID < 1000) {
            throw new IllegalArgumentException("Employee ID must be at least 1000");
        }
        if (baseSalary <= 0) {
            throw new IllegalArgumentException("Base salary must be greater than 0");
        }
        this.employeeID = employeeID;
        this.fullName = fullName;
        this.position = position;
        this.baseSalary = baseSalary;
        this.rasRegistered = rasRegistered;
        this.department = department;
    }

    public int getEmployeeID() {
        return employeeID;
    }

    public String getFullName() {
        return fullName;
    }

    public String getPosition() {
        return position;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public boolean isRasRegistered() {
        return rasRegistered;
    }

    public Department getDepartment() {
        return department;
    }

    @Override
    public String toString() {
        return "Employee{" + "id=" + id + ", empID=" + employeeID + ", name=" + fullName 
               + ", position=" + position + ", salary=" + baseSalary + ", rasRegistered=" + rasRegistered + '}';
    }
}
