package id27608.q1;

import java.time.LocalDate;

public class StockReport extends Entity {
    private final LocalDate reportDate;
    private final String remarks;
    private final Inventory inventory;

    public StockReport(int id, LocalDate reportDate, String remarks, Inventory inventory) {
        super(id);
        this.reportDate = reportDate;
        this.remarks = remarks;
        this.inventory = inventory;
    }

    public LocalDate getReportDate() {
        return reportDate;
    }

    public String getRemarks() {
        return remarks;
    }

    public Inventory getInventory() {
        return inventory;
    }

    public String generateReport() {
        return generateStockReport();
    }

    private String generateStockReport() {
        StringBuilder report = new StringBuilder();
        report.append("===== STOCK REPORT =====\n");
        report.append("Report Date: ").append(reportDate).append("\n");
        report.append("Remarks: ").append(remarks).append("\n");
        report.append("---\n");
        report.append("Total Items: ").append(inventory.getTotalItems()).append("\n");
        report.append("Total Stock Value: ").append(inventory.getStockValue()).append("\n");
        report.append("---\n");
        report.append("Stock Items Summary:\n");

        for (StockItem item : inventory.getStockItems()) {
            report.append("  - Product: ").append(item.getProduct().getProductName())
                  .append(", Quantity: ").append(item.getQuantityAvailable())
                  .append(", Warehouse: ").append(item.getWarehouse().getWarehouseName())
                  .append("\n");
        }

        report.append("=======================\n");
        return report.toString();
    }

    @Override
    public String toString() {
        return "StockReport{" + "id=" + id + ", date=" + reportDate + ", totalItems=" + inventory.getTotalItems() 
               + ", stockValue=" + inventory.getStockValue() + '}';
    }
}