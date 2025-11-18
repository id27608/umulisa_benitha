package id27608.q1;

public class Warehouse extends Entity {
    private String warehouseName;
    private String location;
    private String contactNumber;

    public Warehouse(int id, String warehouseName, String location, String contactNumber) {
        super(id);
        if (contactNumber == null || contactNumber.length() != 10 || !contactNumber.matches("[0-9]{10}")) {
            throw new IllegalArgumentException("Contact number must be 10 digits");
        }
        this.warehouseName = warehouseName;
        this.location = location;
        this.contactNumber = contactNumber;
    }

    public String getWarehouseName() {
        return warehouseName;
    }

    public String getLocation() {
        return location;
    }

    public String getContactNumber() {
        return contactNumber;
    }

    @Override
    public String toString() {
        return "Warehouse{" + "id=" + id + ", name=" + warehouseName + ", location=" + location 
               + ", contact=" + contactNumber + '}';
    }
}
