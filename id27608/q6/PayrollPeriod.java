package id27608.q6;

import java.time.LocalDate;


public class PayrollPeriod extends Entity {
    private int month;
    private int year;
    private LocalDate startDate;
    private LocalDate endDate;

    public PayrollPeriod(int id, int month, int year, LocalDate startDate, LocalDate endDate) {
        super(id);
        if (month < 1 || month > 12) {
            throw new IllegalArgumentException("Month must be between 1 and 12");
        }
        if (year < 2000) {
            throw new IllegalArgumentException("Year must be 2000 or later");
        }
        if (startDate == null || endDate == null) {
            throw new IllegalArgumentException("Start and end dates cannot be null");
        }
        this.month = month;
        this.year = year;
        this.startDate = startDate;
        this.endDate = endDate;
    }

    public int getMonth() {
        return month;
    }

    public int getYear() {
        return year;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    @Override
    public String toString() {
        return "PayrollPeriod{" + "id=" + id + ", month=" + month + ", year=" + year 
               + ", start=" + startDate + ", end=" + endDate + '}';
    }
}
