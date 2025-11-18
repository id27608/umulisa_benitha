
package id27608.q5;

public class Institution extends Entity {
    private String institutionName;
    private String code;
    private String address;

    public Institution(int id, String institutionName, String code, String address) {
        super(id);
        if (code == null || code.length() != 3 || !code.matches("[A-Z]{3}")) {
            throw new IllegalArgumentException("Code must be exactly 3 uppercase letters");
        }
        this.institutionName = institutionName;
        this.code = code;
        this.address = address;
    }

    public String getInstitutionName() {
        return institutionName;
    }

    public String getCode() {
        return code;
    }

    public String getAddress() {
        return address;
    }

    @Override
    public String toString() {
        return "Institution{" + "id=" + id + ", name=" + institutionName + ", code=" + code 
               + ", address=" + address + '}';
    }
}
