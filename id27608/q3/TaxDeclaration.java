package id27608.q3;

public class TaxDeclaration extends Entity {
    private int declarationMonth;
    private double totalIncome;
    private Employee employee;
    private TaxCategory taxCategory;

    public TaxDeclaration(int id, int declarationMonth, double totalIncome, Employee employee, TaxCategory taxCategory) {
        super(id);
        if (totalIncome < 0) {
            throw new IllegalArgumentException("Income must be greater than or equal to 0");
        }
        this.declarationMonth = declarationMonth;
        this.totalIncome = totalIncome;
        this.employee = employee;
        this.taxCategory = taxCategory;
    }

    public int getDeclarationMonth() {
        return declarationMonth;
    }

    public double getTotalIncome() {
        return totalIncome;
    }

    public Employee getEmployee() {
        return employee;
    }

    public TaxCategory getTaxCategory() {
        return taxCategory;
    }

    @Override
    public String toString() {
        return "TaxDeclaration{" + "id=" + id + ", month=" + declarationMonth + ", income=" + totalIncome 
               + ", employee=" + employee.getEmployeeName() + ", category=" + taxCategory.getCategoryName() + '}';
    }
}
