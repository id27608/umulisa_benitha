package id27608.q4;

import java.time.LocalDate;


public class Delivery extends Entity {
    private LocalDate deliveryDate;
    private int deliveredBy;
    private PurchaseOrder purchaseOrder;

    public Delivery(int id, LocalDate deliveryDate, int deliveredBy, PurchaseOrder purchaseOrder) {
        super(id);
        if (deliveryDate == null) {
            throw new IllegalArgumentException("Delivery date cannot be null");
        }
        this.deliveryDate = deliveryDate;
        this.deliveredBy = deliveredBy;
        this.purchaseOrder = purchaseOrder;
    }

    public LocalDate getDeliveryDate() {
        return deliveryDate;
    }

    public int getDeliveredBy() {
        return deliveredBy;
    }

    public PurchaseOrder getPurchaseOrder() {
        return purchaseOrder;
    }

    @Override
    public String toString() {
        return "Delivery{" + "id=" + id + ", date=" + deliveryDate + ", deliveredBy=" + deliveredBy 
               + ", poNumber=" + purchaseOrder.getPoNumber() + '}';
    }
}


