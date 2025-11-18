package id27608.q5;


public class Course extends Entity {
    private String courseName;
    private String courseCode;
    private int credits;
    private Department department;

    public Course(int id, String courseName, String courseCode, int credits, Department department) {
        super(id);
        if (credits <= 0) {
            throw new IllegalArgumentException("Credits must be greater than 0");
        }
        this.courseName = courseName;
        this.courseCode = courseCode;
        this.credits = credits;
        this.department = department;
    }

    public String getCourseName() {
        return courseName;
    }

    public String getCourseCode() {
        return courseCode;
    }

    public int getCredits() {
        return credits;
    }

    public Department getDepartment() {
        return department;
    }

    @Override
    public String toString() {
        return "Course{" + "id=" + id + ", name=" + courseName + ", code=" + courseCode 
               + ", credits=" + credits + ", dept=" + department.getDepartmentName() + '}';
    }
}
