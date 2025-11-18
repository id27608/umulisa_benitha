package id27608.q5;

public class Student extends Entity {
    private String studentName;
    private int studentID;
    private int age;
    private Department department;

    public Student(int id, String studentName, int studentID, int age, Department department) {
        super(id);
        if (age <= 0) {
            throw new IllegalArgumentException("Age must be greater than 0");
        }
        this.studentName = studentName;
        this.studentID = studentID;
        this.age = age;
        this.department = department;
    }

    public String getStudentName() {
        return studentName;
    }

    public int getStudentID() {
        return studentID;
    }

    public int getAge() {
        return age;
    }

    public Department getDepartment() {
        return department;
    }

    @Override
    public String toString() {
        return "Student{" + "id=" + id + ", name=" + studentName + ", studentID=" + studentID 
               + ", age=" + age + ", dept=" + department.getDepartmentName() + '}';
    }
}
