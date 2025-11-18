package id27608.q3;

public class TaxCategory extends Entity {
    private String categoryName;
    private double rate;
    private String code;

    public TaxCategory(int id, String categoryName, double rate, String code) {
        super(id);
        if (rate <= 0) {
            throw new IllegalArgumentException("Rate must be greater than 0");
        }
        if (code == null || code.length() != 3 || !code.matches("[A-Z]{3}")) {
            throw new IllegalArgumentException("Code must be exactly 3 uppercase letters");
        }
        this.categoryName = categoryName;
        this.rate = rate;
        this.code = code;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public double getRate() {
        return rate;
    }

    public String getCode() {
        return code;
    }

    @Override
    public String toString() {
        return "TaxCategory{" + "id=" + id + ", name=" + categoryName + ", rate=" + rate 
               + ", code=" + code + '}';
    }
}
