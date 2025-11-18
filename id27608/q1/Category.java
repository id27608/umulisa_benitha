package id27608.q1;

public class Category extends Entity {
    private String categoryName;
    private String categoryCode;

    public Category(int id, String categoryName, String categoryCode) {
        super(id);
        if (categoryCode == null || categoryCode.length() != 3 || !categoryCode.matches("[A-Z]{3}")) {
            throw new IllegalArgumentException("Category code must be exactly 3 uppercase letters");
        }
        this.categoryName = categoryName;
        this.categoryCode = categoryCode;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public String getCategoryCode() {
        return categoryCode;
    }

    @Override
    public String toString() {
        return "Category{" + "id=" + id + ", name=" + categoryName + ", code=" + categoryCode + '}';
    }
}
