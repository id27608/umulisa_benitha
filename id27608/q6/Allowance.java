package id27608.q6;

public class Allowance extends Entity {
    private double overtimeHours;
    private double overtimeRate;
    private double bonus;
    private Employee employee;

    public Allowance(int id, double overtimeHours, double overtimeRate, double bonus, Employee employee) {
        super(id);
        if (overtimeHours < 0 || overtimeRate < 0 || bonus < 0) {
            throw new IllegalArgumentException("Hours, rate, and bonus must be greater than or equal to 0");
        }
        this.overtimeHours = overtimeHours;
        this.overtimeRate = overtimeRate;
        this.bonus = bonus;
        this.employee = employee;
    }

    public double getOvertimeHours() {
        return overtimeHours;
    }

    public double getOvertimeRate() {
        return overtimeRate;
    }

    public double getBonus() {
        return bonus;
    }

    public Employee getEmployee() {
        return employee;
    }

    public double calculateOvertimePay() {
        return overtimeHours * overtimeRate;
    }

    public double getTotalAllowance() {
        return calculateOvertimePay() + bonus;
    }

    @Override
    public String toString() {
        return "Allowance{" + "id=" + id + ", overtimeHours=" + overtimeHours + ", rate=" + overtimeRate 
               + ", bonus=" + bonus + ", totalOT=" + calculateOvertimePay() + '}';
    }
}
