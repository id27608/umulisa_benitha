package id27608.q3;

public class Employee extends Entity {
    private String employeeName;
    private double salary;
    private String employeeTIN;

    public Employee(int id, String employeeName, double salary, String employeeTIN) {
        super(id);
        if (salary <= 0) {
            throw new IllegalArgumentException("Salary must be greater than 0");
        }
        if (employeeTIN == null || employeeTIN.length() != 10 || !employeeTIN.matches("[0-9]{10}")) {
            throw new IllegalArgumentException("Valid TIN must be 10 digits");
        }
        this.employeeName = employeeName;
        this.salary = salary;
        this.employeeTIN = employeeTIN;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public double getSalary() {
        return salary;
    }

    public String getEmployeeTIN() {
        return employeeTIN;
    }

    @Override
    public String toString() {
        return "Employee{" + "id=" + id + ", name=" + employeeName + ", salary=" + salary 
               + ", tin=" + employeeTIN + '}';
    }
}
