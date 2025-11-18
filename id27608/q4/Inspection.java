package id27608.q4;


public class Inspection extends Entity {
    private String inspectorName;
    private String status;
    private Delivery delivery;

    public Inspection(int id, String inspectorName, String status, Delivery delivery) {
        super(id);
        if (!status.equals("Passed") && !status.equals("Failed")) {
            throw new IllegalArgumentException("Status must be 'Passed' or 'Failed'");
        }
        this.inspectorName = inspectorName;
        this.status = status;
        this.delivery = delivery;
    }

    public String getInspectorName() {
        return inspectorName;
    }

    public String getStatus() {
        return status;
    }

    public Delivery getDelivery() {
        return delivery;
    }

    @Override
    public String toString() {
        return "Inspection{" + "id=" + id + ", inspector=" + inspectorName + ", status=" + status 
               + ", poNumber=" + delivery.getPurchaseOrder().getPoNumber() + '}';
    }
}

