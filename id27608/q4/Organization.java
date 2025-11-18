package id27608.q4;
import java.util.regex.Pattern;


public class Organization extends Entity {
    private String orgName;
    private String address;
    private String contactEmail;

    public Organization(int id, String orgName, String address, String contactEmail) {
        super(id);
        if (!isValidEmail(contactEmail)) {
            throw new IllegalArgumentException("Invalid email format");
        }
        this.orgName = orgName;
        this.address = address;
        this.contactEmail = contactEmail;
    }

    private boolean isValidEmail(String email) {
        String emailRegex = "^[A-Za-z0-9+_.-]+@(.+)$";
        return email != null && Pattern.matches(emailRegex, email);
    }

    public String getOrgName() {
        return orgName;
    }

    public String getAddress() {
        return address;
    }

    public String getContactEmail() {
        return contactEmail;
    }

    @Override
    public String toString() {
        return "Organization{" + "id=" + id + ", name=" + orgName + ", address=" + address 
               + ", email=" + contactEmail + '}';
    }
}
