package id27608.q5;
import java.time.LocalDate;

public class LeaveRequest extends Entity {
    private LocalDate requestDate;
    private String reason;
    private boolean approved;
    private Student student;

    public LeaveRequest(int id, LocalDate requestDate, String reason, boolean approved, Student student) {
        super(id);
        if (reason == null || reason.isEmpty()) {
            throw new IllegalArgumentException("Reason cannot be empty");
        }
        this.requestDate = requestDate;
        this.reason = reason;
        this.approved = approved;
        this.student = student;
    }

    public LocalDate getRequestDate() {
        return requestDate;
    }

    public String getReason() {
        return reason;
    }

    public boolean isApproved() {
        return approved;
    }

    public void setApproved(boolean approved) {
        this.approved = approved;
    }

    public Student getStudent() {
        return student;
    }

    @Override
    public String toString() {
        return "LeaveRequest{" + "id=" + id + ", date=" + requestDate + ", reason=" + reason 
               + ", approved=" + approved + ", student=" + student.getStudentName() + '}';
    }
}
