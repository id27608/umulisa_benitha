package id27608.q4;

public class Supplier extends Entity {
    private String supplierName;
    private String supplierTIN;
    private String contact;

    public Supplier(int id, String supplierName, String supplierTIN, String contact) {
        super(id);
        if (supplierTIN == null || supplierTIN.length() != 9 || !supplierTIN.matches("[0-9]{9}")) {
            throw new IllegalArgumentException("TIN must be exactly 9 digits");
        }
        if (contact == null || contact.length() != 10 || !contact.matches("[0-9]{10}")) {
            throw new IllegalArgumentException("Phone must be 10 digits");
        }
        this.supplierName = supplierName;
        this.supplierTIN = supplierTIN;
        this.contact = contact;
    }

    public String getSupplierName() {
        return supplierName;
    }

    public String getSupplierTIN() {
        return supplierTIN;
    }

    public String getContact() {
        return contact;
    }

    @Override
    public String toString() {
        return "Supplier{" + "id=" + id + ", name=" + supplierName + ", tin=" + supplierTIN 
               + ", contact=" + contact + '}';
    }
}
