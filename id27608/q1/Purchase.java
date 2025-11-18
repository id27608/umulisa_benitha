package id27608.q1;

import java.time.LocalDate;

public class Purchase extends Entity {
    private LocalDate purchaseDate;
    private int purchasedQuantity;
    private String supplierName;
    private Product product;

    public Purchase(int id, LocalDate purchaseDate, int purchasedQuantity, String supplierName, Product product) {
        super(id);
        if (purchasedQuantity <= 0) {
            throw new IllegalArgumentException("Purchased quantity must be greater than 0");
        }
        if (purchaseDate == null) {
            throw new IllegalArgumentException("Purchase date cannot be null");
        }
        this.purchaseDate = purchaseDate;
        this.purchasedQuantity = purchasedQuantity;
        this.supplierName = supplierName;
        this.product = product;
    }

    public LocalDate getPurchaseDate() {
        return purchaseDate;
    }

    public int getPurchasedQuantity() {
        return purchasedQuantity;
    }

    public String getSupplierName() {
        return supplierName;
    }

    public Product getProduct() {
        return product;
    }

    @Override
    public String toString() {
        return "Purchase{" + "id=" + id + ", date=" + purchaseDate + ", quantity=" + purchasedQuantity 
               + ", supplier=" + supplierName + ", product=" + product.getProductName() + '}';
    }
}
