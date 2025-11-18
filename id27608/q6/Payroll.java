package id27608.q6;


public class Payroll extends Entity {
    private double grossSalary;
    private double totalDeductions;
    private double netSalary;
    private final Employee employee;
    private final PayrollPeriod payrollPeriod;
    private final SalaryStructure salaryStructure;
    private final Deduction deduction;
    private final Allowance allowance;

    public Payroll(int id, Employee employee, PayrollPeriod payrollPeriod, SalaryStructure salaryStructure,
                   Deduction deduction, Allowance allowance) {
        super(id);
        this.employee = employee;
        this.payrollPeriod = payrollPeriod;
        this.salaryStructure = salaryStructure;
        this.deduction = deduction;
        this.allowance = allowance;
        calculatePayroll();
    }

    private void calculatePayroll() {
        this.grossSalary = salaryStructure.getBasicSalary() + salaryStructure.getTotalAllowances() 
                          + allowance.getTotalAllowance();
        this.totalDeductions = deduction.getTotalDeductions();
        this.netSalary = this.grossSalary - this.totalDeductions;
    }

    public double getGrossSalary() {
        return grossSalary;
    }

    public double getTotalDeductions() {
        return totalDeductions;
    }

    public double getNetSalary() {
        return netSalary;
    }

    public Employee getEmployee() {
        return employee;
    }

    public PayrollPeriod getPayrollPeriod() {
        return payrollPeriod;
    }

    public SalaryStructure getSalaryStructure() {
        return salaryStructure;
    }

    public Deduction getDeduction() {
        return deduction;
    }

    public Allowance getAllowance() {
        return allowance;
    }

    @Override
    public String toString() {
        return "Payroll{" + "id=" + id + ", employee=" + employee.getFullName() + ", gross=" + grossSalary 
               + ", deductions=" + totalDeductions + ", net=" + netSalary + '}';
    }
}
