package id27608.q1;

import java.util.ArrayList;
import java.util.List;

public class Inventory extends Entity {
    private int totalItems;
    private double stockValue;
    private final List<StockItem> stockItems;

    public Inventory(int id, List<StockItem> stockItems) {
        super(id);
        this.stockItems = stockItems != null ? stockItems : new ArrayList<>();
        calculateTotals();
    }

    private void calculateTotals() {
        this.totalItems = 0;
        this.stockValue = 0.0;

        for (StockItem item : stockItems) {
            this.totalItems += item.getQuantityAvailable();
            this.stockValue += (item.getQuantityAvailable() * item.getProduct().getUnitPrice());
        }

        if (this.totalItems < 0 || this.stockValue < 0) {
            throw new IllegalArgumentException("Total items and stock value must be greater than or equal to 0");
        }
    }

    public int getTotalItems() {
        return totalItems;
    }

    public double getStockValue() {
        return stockValue;
    }

    public List<StockItem> getStockItems() {
        return stockItems;
    }

    public void addStockItem(StockItem item) {
        stockItems.add(item);
        calculateTotals();
    }

    public void updateInventory() {
        calculateTotals();
    }

    @Override
    public String toString() {
        return "Inventory{" + "id=" + id + ", totalItems=" + totalItems + ", stockValue=" + stockValue + '}';
    }
}
