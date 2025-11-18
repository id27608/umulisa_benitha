package id27608.q5;

import java.util.regex.Pattern;

public class Instructor extends Entity {
    private String instructorName;
    private String email;
    private String phone;
    private Department department;

    public Instructor(int id, String instructorName, String email, String phone, Department department) {
        super(id);
        if (!isValidEmail(email)) {
            throw new IllegalArgumentException("Invalid email format");
        }
        if (phone == null || phone.length() != 10 || !phone.matches("[0-9]{10}")) {
            throw new IllegalArgumentException("Phone must be 10 digits");
        }
        this.instructorName = instructorName;
        this.email = email;
        this.phone = phone;
        this.department = department;
    }

    private boolean isValidEmail(String email) {
        String emailRegex = "^[A-Za-z0-9+_.-]+@(.+)$";
        return email != null && Pattern.matches(emailRegex, email);
    }

    public String getInstructorName() {
        return instructorName;
    }

    public String getEmail() {
        return email;
    }

    public String getPhone() {
        return phone;
    }

    public Department getDepartment() {
        return department;
    }

    @Override
    public String toString() {
        return "Instructor{" + "id=" + id + ", name=" + instructorName + ", email=" + email 
               + ", phone=" + phone + '}';
    }
}
