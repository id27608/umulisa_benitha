package id27608.q6;
import java.time.LocalDate;

public class Payslip extends Entity {
    private String payslipNumber;
    private LocalDate issueDate;
    private Payroll payroll;

    public Payslip(int id, String payslipNumber, LocalDate issueDate, Payroll payroll) {
        super(id);
        this.payslipNumber = payslipNumber;
        this.issueDate = issueDate;
        this.payroll = payroll;
    }

    public String getPayslipNumber() {
        return payslipNumber;
    }

    public LocalDate getIssueDate() {
        return issueDate;
    }

    public Payroll getPayroll() {
        return payroll;
    }

    public String generatePayslip() {
        return generatePayslipDetails();
    }

    private String generatePayslipDetails() {
        StringBuilder payslip = new StringBuilder();
        Employee emp = payroll.getEmployee();
        SalaryStructure structure = payroll.getSalaryStructure();
        Deduction ded = payroll.getDeduction();
        Allowance allow = payroll.getAllowance();

        payslip.append("========== PAYSLIP ==========\n");
        payslip.append("Payslip Number: ").append(payslipNumber).append("\n");
        payslip.append("Issue Date: ").append(issueDate).append("\n");
        payslip.append("---\n");
        payslip.append("Employee: ").append(emp.getFullName()).append("\n");
        payslip.append("Employee ID: ").append(emp.getEmployeeID()).append("\n");
        payslip.append("Position: ").append(emp.getPosition()).append("\n");
        payslip.append("Department: ").append(emp.getDepartment().getDeptName()).append("\n");
        payslip.append("---\n");
        payslip.append("EARNINGS:\n");
        payslip.append("  Basic Salary: ").append(String.format("%.2f", structure.getBasicSalary())).append("\n");
        payslip.append("  Transport Allowance: ").append(String.format("%.2f", structure.getTransportAllowance())).append("\n");
        payslip.append("  Housing Allowance: ").append(String.format("%.2f", structure.getHousingAllowance())).append("\n");
        payslip.append("  Overtime Pay: ").append(String.format("%.2f", allow.calculateOvertimePay())).append("\n");
        payslip.append("  Bonus: ").append(String.format("%.2f", allow.getBonus())).append("\n");
        payslip.append("  Gross Salary: ").append(String.format("%.2f", payroll.getGrossSalary())).append("\n");
        payslip.append("---\n");
        payslip.append("DEDUCTIONS:\n");
        payslip.append("  RAS Contribution: ").append(String.format("%.2f", ded.getRasContribution())).append("\n");
        payslip.append("  PAYE Tax: ").append(String.format("%.2f", ded.getPayeTax())).append("\n");
        payslip.append("  Loan Deduction: ").append(String.format("%.2f", ded.getLoanDeduction())).append("\n");
        payslip.append("  Total Deductions: ").append(String.format("%.2f", payroll.getTotalDeductions())).append("\n");
        payslip.append("---\n");
        payslip.append("NET SALARY: ").append(String.format("%.2f", payroll.getNetSalary())).append("\n");
        payslip.append("=============================\n");
        
        return payslip.toString();
    }

    @Override
    public String toString() {
        return "Payslip{" + "id=" + id + ", number=" + payslipNumber + ", date=" + issueDate 
               + ", netSalary=" + String.format("%.2f", payroll.getNetSalary()) + '}';
    }
}