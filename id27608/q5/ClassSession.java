package id27608.q5;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class ClassSession extends Entity {
    private LocalDate sessionDate;
    private String topic;
    private Course course;
    private Instructor instructor;
    private List<Student> students;

    public ClassSession(int id, LocalDate sessionDate, String topic, Course course, Instructor instructor) {
        super(id);
        if (sessionDate == null) {
            throw new IllegalArgumentException("Session date cannot be null");
        }
        this.sessionDate = sessionDate;
        this.topic = topic;
        this.course = course;
        this.instructor = instructor;
        this.students = new ArrayList<>();
    }

    public LocalDate getSessionDate() {
        return sessionDate;
    }

    public String getTopic() {
        return topic;
    }

    public Course getCourse() {
        return course;
    }

    public Instructor getInstructor() {
        return instructor;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    @Override
    public String toString() {
        return "ClassSession{" + "id=" + id + ", date=" + sessionDate + ", topic=" + topic 
               + ", course=" + course.getCourseName() + ", students=" + students.size() + '}';
    }
}
