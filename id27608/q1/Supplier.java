package id27608.q1;

import java.util.regex.Pattern;

public class Supplier extends Entity {
    private String supplierName;
    private String supplierEmail;
    private String supplierPhone;

    public Supplier(int id, String supplierName, String supplierEmail, String supplierPhone) {
        super(id);
        if (!isValidEmail(supplierEmail)) {
            throw new IllegalArgumentException("Invalid email format");
        }
        if (supplierPhone == null || supplierPhone.length() != 10 || !supplierPhone.matches("[0-9]{10}")) {
            throw new IllegalArgumentException("Phone must be 10 digits");
        }
        this.supplierName = supplierName;
        this.supplierEmail = supplierEmail;
        this.supplierPhone = supplierPhone;
    }

    private boolean isValidEmail(String email) {
        String emailRegex = "^[A-Za-z0-9+_.-]+@(.+)$";
        return email != null && Pattern.matches(emailRegex, email);
    }

    public String getSupplierName() {
        return supplierName;
    }

    public String getSupplierEmail() {
        return supplierEmail;
    }

    public String getSupplierPhone() {
        return supplierPhone;
    }

    @Override
    public String toString() {
        return "Supplier{" + "id=" + id + ", name=" + supplierName + ", email=" + supplierEmail 
               + ", phone=" + supplierPhone + '}';
    }
}
