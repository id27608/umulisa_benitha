package id27608.q5;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;


public class AttendanceSummary extends Entity {
    private final LocalDate reportDate;
    private int totalPresent;
    private int totalAbsent;
    private final List<AttendanceRecord> records;
    private final List<ClassSession> sessions;

    public AttendanceSummary(int id, LocalDate reportDate, List<AttendanceRecord> records, List<ClassSession> sessions) {
        super(id);
        this.reportDate = reportDate;
        this.records = records != null ? records : new ArrayList<>();
        this.sessions = sessions != null ? sessions : new ArrayList<>();
        calculateSummary();
    }

    private void calculateSummary() {
        this.totalPresent = 0;
        this.totalAbsent = 0;

        for (AttendanceRecord record : records) {
            if (record.getStatus().equals("Present")) {
                this.totalPresent++;
            } else if (record.getStatus().equals("Absent")) {
                this.totalAbsent++;
            }
        }
    }

    public LocalDate getReportDate() {
        return reportDate;
    }

    public int getTotalPresent() {
        return totalPresent;
    }

    public int getTotalAbsent() {
        return totalAbsent;
    }

    public List<AttendanceRecord> getRecords() {
        return records;
    }

    public List<ClassSession> getSessions() {
        return sessions;
    }

    public void addAttendanceRecord(AttendanceRecord record) {
        records.add(record);
        calculateSummary();
    }

    public void addSession(ClassSession session) {
        sessions.add(session);
    }

    public double generateSummary() {
        return calculateAttendancePercentage();
    }

    private double calculateAttendancePercentage() {
        if (totalPresent + totalAbsent == 0) {
            return 0.0;
        }
        return (double) totalPresent / (totalPresent + totalAbsent) * 100;
    }

    public String generateAttendanceReport() {
        StringBuilder report = new StringBuilder();
        report.append("===== ATTENDANCE SUMMARY REPORT =====\n");
        report.append("Report Date: ").append(reportDate).append("\n");
        report.append("Total Sessions: ").append(sessions.size()).append("\n");
        report.append("---\n");
        report.append("Total Present: ").append(totalPresent).append("\n");
        report.append("Total Absent: ").append(totalAbsent).append("\n");
        report.append("Attendance Percentage: ").append(String.format("%.2f", calculateAttendancePercentage())).append("%\n");
        report.append("---\n");
        report.append("Attendance Details:\n");

        for (AttendanceRecord record : records) {
            report.append("  - StudentID: ").append(record.getStudentID())
                  .append(", SessionID: ").append(record.getSessionID())
                  .append(", Status: ").append(record.getStatus())
                  .append("\n");
        }

        report.append("=====================================\n");
        return report.toString();
    }

    @Override
    public String toString() {
        return "AttendanceSummary{" + "id=" + id + ", date=" + reportDate + ", present=" + totalPresent 
               + ", absent=" + totalAbsent + ", percentage=" + String.format("%.2f", calculateAttendancePercentage()) + "%}";
    }
}