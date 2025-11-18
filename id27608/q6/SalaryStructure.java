package id27608.q6;

public class SalaryStructure extends Entity {
    private double basicSalary;
    private double transportAllowance;
    private double housingAllowance;
    private Employee employee;

    public SalaryStructure(int id, double basicSalary, double transportAllowance, 
                          double housingAllowance, Employee employee) {
        super(id);
        if (basicSalary <= 0) {
            throw new IllegalArgumentException("Basic salary must be greater than 0");
        }
        if (transportAllowance < 0 || housingAllowance < 0) {
            throw new IllegalArgumentException("Allowances must be greater than or equal to 0");
        }
        this.basicSalary = basicSalary;
        this.transportAllowance = transportAllowance;
        this.housingAllowance = housingAllowance;
        this.employee = employee;
    }

    public double getBasicSalary() {
        return basicSalary;
    }

    public double getTransportAllowance() {
        return transportAllowance;
    }

    public double getHousingAllowance() {
        return housingAllowance;
    }

    public Employee getEmployee() {
        return employee;
    }

    public double getTotalAllowances() {
        return transportAllowance + housingAllowance;
    }

    @Override
    public String toString() {
        return "SalaryStructure{" + "id=" + id + ", basic=" + basicSalary + ", transport=" + transportAllowance 
               + ", housing=" + housingAllowance + '}';
    }
}
