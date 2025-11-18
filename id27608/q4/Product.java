package id27608.q4;


public class Product extends Entity {
    private String productName;
    private double unitPrice;
    private int quantity;
    private Supplier supplier;

    public Product(int id, String productName, double unitPrice, int quantity, Supplier supplier) {
        super(id);
        if (unitPrice <= 0) {
            throw new IllegalArgumentException("Unit price must be greater than 0");
        }
        if (quantity < 0) {
            throw new IllegalArgumentException("Quantity must be greater than or equal to 0");
        }
        this.productName = productName;
        this.unitPrice = unitPrice;
        this.quantity = quantity;
        this.supplier = supplier;
    }

    public String getProductName() {
        return productName;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        if (quantity < 0) {
            throw new IllegalArgumentException("Quantity must be greater than or equal to 0");
        }
        this.quantity = quantity;
    }

    public Supplier getSupplier() {
        return supplier;
    }

    @Override
    public String toString() {
        return "Product{" + "id=" + id + ", name=" + productName + ", price=" + unitPrice 
               + ", quantity=" + quantity + ", supplier=" + supplier.getSupplierName() + '}';
    }
}
