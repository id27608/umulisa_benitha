package id27608.q1;


public class Product extends Entity {
    private String productName;
    private double unitPrice;
    private int stockLimit;
    private Category category;
    private Supplier supplier;

    public Product(int id, String productName, double unitPrice, int stockLimit, Category category, Supplier supplier) {
        super(id);
        if (unitPrice <= 0) {
            throw new IllegalArgumentException("Unit price must be greater than 0");
        }
        if (stockLimit < 0) {
            throw new IllegalArgumentException("Stock limit must be greater than or equal to 0");
        }
        this.productName = productName;
        this.unitPrice = unitPrice;
        this.stockLimit = stockLimit;
        this.category = category;
        this.supplier = supplier;
    }

    public String getProductName() {
        return productName;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public int getStockLimit() {
        return stockLimit;
    }

    public Category getCategory() {
        return category;
    }

    public Supplier getSupplier() {
        return supplier;
    }

    @Override
    public String toString() {
        return "Product{" + "id=" + id + ", name=" + productName + ", price=" + unitPrice 
               + ", limit=" + stockLimit + ", category=" + category.getCategoryName() + '}';
    }
}
