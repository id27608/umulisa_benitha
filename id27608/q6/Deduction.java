package id27608.q6;

public class Deduction extends Entity {
    private double rasContribution;
    private double payeTax;
    private double loanDeduction;
    private Employee employee;

    public Deduction(int id, double rasContribution, double payeTax, double loanDeduction, Employee employee) {
        super(id);
        if (rasContribution < 0 || payeTax < 0 || loanDeduction < 0) {
            throw new IllegalArgumentException("Deductions must be greater than or equal to 0");
        }
        if (rasContribution != 0 && rasContribution != (employee.getBaseSalary() * 0.05)) {
            throw new IllegalArgumentException("RAS contribution must be 5% of base salary");
        }
        this.rasContribution = rasContribution;
        this.payeTax = payeTax;
        this.loanDeduction = loanDeduction;
        this.employee = employee;
    }

    public double getRasContribution() {
        return rasContribution;
    }

    public double getPayeTax() {
        return payeTax;
    }

    public double getLoanDeduction() {
        return loanDeduction;
    }

    public Employee getEmployee() {
        return employee;
    }

    public double getTotalDeductions() {
        return rasContribution + payeTax + loanDeduction;
    }

    @Override
    public String toString() {
        return "Deduction{" + "id=" + id + ", ras=" + rasContribution + ", paye=" + payeTax 
               + ", loan=" + loanDeduction + '}';
    }
}
