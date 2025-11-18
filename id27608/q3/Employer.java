package id27608.q3;

public class Employer extends Entity {
    private String employerName;
    private String employerTIN;
    private String contact;

    public Employer(int id, String employerName, String employerTIN, String contact) {
        super(id);
        if (employerTIN == null || employerTIN.length() != 10 || !employerTIN.matches("[0-9]{10}")) {
            throw new IllegalArgumentException("Valid TIN must be 10 digits");
        }
        if (contact == null || contact.length() != 10 || !contact.matches("[0-9]{10}")) {
            throw new IllegalArgumentException("Phone must be 10 digits");
        }
        this.employerName = employerName;
        this.employerTIN = employerTIN;
        this.contact = contact;
    }

    public String getEmployerName() {
        return employerName;
    }

    public String getEmployerTIN() {
        return employerTIN;
    }

    public String getContact() {
        return contact;
    }

    @Override
    public String toString() {
        return "Employer{" + "id=" + id + ", name=" + employerName + ", tin=" + employerTIN 
               + ", contact=" + contact + '}';
    }
}
