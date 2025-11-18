package id27608.q5;



public class AttendanceRecord extends Entity {
    private int studentID;
    private int sessionID;
    private String status;

    public AttendanceRecord(int id, int studentID, int sessionID, String status) {
        super(id);
        if (!status.equals("Present") && !status.equals("Absent")) {
            throw new IllegalArgumentException("Status must be 'Present' or 'Absent'");
        }
        this.studentID = studentID;
        this.sessionID = sessionID;
        this.status = status;
    }

    public int getStudentID() {
        return studentID;
    }

    public int getSessionID() {
        return sessionID;
    }

    public String getStatus() {
        return status;
    }

    @Override
    public String toString() {
        return "AttendanceRecord{" + "id=" + id + ", studentID=" + studentID + ", sessionID=" + sessionID 
               + ", status=" + status + '}';
    }
}

// ============== CLASS 9: LEAVE REQUEST ==============

// ============== CLASS 10: ATTENDANCE SUMMARY (FINAL) ==============
