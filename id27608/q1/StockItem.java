package id27608.q1;

public class StockItem extends Entity {
    private int quantityAvailable;
    private int reorderLevel;
    private Product product;
    private Warehouse warehouse;

    public StockItem(int id, int quantityAvailable, int reorderLevel, Product product, Warehouse warehouse) {
        super(id);
        if (quantityAvailable < 0) {
            throw new IllegalArgumentException("Quantity available must be greater than or equal to 0");
        }
        if (reorderLevel < 0) {
            throw new IllegalArgumentException("Reorder level must be greater than or equal to 0");
        }
        this.quantityAvailable = quantityAvailable;
        this.reorderLevel = reorderLevel;
        this.product = product;
        this.warehouse = warehouse;
    }

    public int getQuantityAvailable() {
        return quantityAvailable;
    }

    public void setQuantityAvailable(int quantityAvailable) {
        if (quantityAvailable < 0) {
            throw new IllegalArgumentException("Quantity available must be greater than or equal to 0");
        }
        this.quantityAvailable = quantityAvailable;
    }

    public int getReorderLevel() {
        return reorderLevel;
    }

    public Product getProduct() {
        return product;
    }

    public Warehouse getWarehouse() {
        return warehouse;
    }

    @Override
    public String toString() {
        return "StockItem{" + "id=" + id + ", quantity=" + quantityAvailable + ", reorder=" + reorderLevel 
               + ", product=" + product.getProductName() + ", warehouse=" + warehouse.getWarehouseName() + '}';
    }
}
