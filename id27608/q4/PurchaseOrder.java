package id27608.q4; 

import java.time.LocalDate;

public class PurchaseOrder extends Entity {
    private String poNumber;
    private LocalDate orderDate;
    private double totalAmount;
    private Product product;
    private Department department;

    public PurchaseOrder(int id, String poNumber, LocalDate orderDate, double totalAmount, 
                        Product product, Department department) {
        super(id);
        if (totalAmount <= 0) {
            throw new IllegalArgumentException("Total amount must be greater than 0");
        }
        this.poNumber = poNumber;
        this.orderDate = orderDate;
        this.totalAmount = totalAmount;
        this.product = product;
        this.department = department;
    }

    public String getPoNumber() {
        return poNumber;
    }

    public LocalDate getOrderDate() {
        return orderDate;
    }

    public double getTotalAmount() {
        return totalAmount;
    }

    public Product getProduct() {
        return product;
    }

    public Department getDepartment() {
        return department;
    }

    @Override
    public String toString() {
        return "PurchaseOrder{" + "id=" + id + ", poNumber=" + poNumber + ", date=" + orderDate 
               + ", total=" + totalAmount + ", product=" + product.getProductName() + '}';
    }
}
