package id27608.q1;

import java.time.LocalDate;

public class Sale extends Entity {
    private LocalDate saleDate;
    private int soldQuantity;
    private String customerName;
    private Product product;

    public Sale(int id, LocalDate saleDate, int soldQuantity, String customerName, Product product) {
        super(id);
        if (soldQuantity <= 0) {
            throw new IllegalArgumentException("Sold quantity must be greater than 0");
        }
        if (saleDate == null) {
            throw new IllegalArgumentException("Sale date cannot be null");
        }
        this.saleDate = saleDate;
        this.soldQuantity = soldQuantity;
        this.customerName = customerName;
        this.product = product;
    }

    public LocalDate getSaleDate() {
        return saleDate;
    }

    public int getSoldQuantity() {
        return soldQuantity;
    }

    public String getCustomerName() {
        return customerName;
    }

    public Product getProduct() {
        return product;
    }

    @Override
    public String toString() {
        return "Sale{" + "id=" + id + ", date=" + saleDate + ", quantity=" + soldQuantity 
               + ", customer=" + customerName + ", product=" + product.getProductName() + '}';
    }
}
