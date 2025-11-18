package id27608.q3;

import java.util.regex.Pattern;


// ============== CLASS 2: TAX AUTHORITY ==============
public class TaxAuthority extends Entity {
    private String authorityName;
    private String region;
    private String email;

    public TaxAuthority(int id, String authorityName, String region, String email) {
        super(id);
        if (!isValidEmail(email)) {
            throw new IllegalArgumentException("Invalid email format");
        }
        this.authorityName = authorityName;
        this.region = region;
        this.email = email;
    }

    private boolean isValidEmail(String email) {
        String emailRegex = "^[A-Za-z0-9+_.-]+@(.+)$";
        return email != null && Pattern.matches(emailRegex, email);
    }

    public String getAuthorityName() {
        return authorityName;
    }

    public String getRegion() {
        return region;
    }

    public String getEmail() {
        return email;
    }

    @Override
    public String toString() {
        return "TaxAuthority{" + "id=" + id + ", name=" + authorityName + ", region=" + region 
               + ", email=" + email + '}';
    }
}
