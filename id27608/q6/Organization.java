package id27608.q6;
import java.util.regex.Pattern;

public class Organization extends Entity {
    private String orgName;
    private String orgCode;
    private String rasNumber;
    private String contactEmail;

    public Organization(int id, String orgName, String orgCode, String rasNumber, String contactEmail) {
        super(id);
        if (rasNumber == null || rasNumber.length() != 8 || !rasNumber.matches("[0-9]{8}")) {
            throw new IllegalArgumentException("RAS number must be exactly 8 digits");
        }
        if (!isValidEmail(contactEmail)) {
            throw new IllegalArgumentException("Invalid email format");
        }
        if (orgCode == null || orgCode.length() < 3 || !orgCode.matches("[A-Z]{3,}")) {
            throw new IllegalArgumentException("Organization code must be at least 3 uppercase letters");
        }
        this.orgName = orgName;
        this.orgCode = orgCode;
        this.rasNumber = rasNumber;
        this.contactEmail = contactEmail;
    }

    private boolean isValidEmail(String email) {
        String emailRegex = "^[A-Za-z0-9+_.-]+@(.+)$";
        return email != null && Pattern.matches(emailRegex, email);
    }

    public String getOrgName() {
        return orgName;
    }

    public String getOrgCode() {
        return orgCode;
    }

    public String getRasNumber() {
        return rasNumber;
    }

    public String getContactEmail() {
        return contactEmail;
    }

    @Override
    public String toString() {
        return "Organization{" + "id=" + id + ", name=" + orgName + ", code=" + orgCode 
               + ", ras=" + rasNumber + ", email=" + contactEmail + '}';
    }
}
