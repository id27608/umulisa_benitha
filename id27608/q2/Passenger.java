package id27608.q2;

public class Passenger extends Entity {
    private String passengerName;
    private int age;
    private String gender;
    private String contact;

    public Passenger(int id, String passengerName, int age, String gender, String contact) {
        super(id);
        if (age <= 0) {
            throw new IllegalArgumentException("Age must be greater than 0");
        }
        if (!gender.equals("M") && !gender.equals("F") && !gender.equals("Other")) {
            throw new IllegalArgumentException("Gender must be M, F, or Other");
        }
        this.passengerName = passengerName;
        this.age = age;
        this.gender = gender;
        this.contact = contact;
    }

    public String getPassengerName() {
        return passengerName;
    }

    public int getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }

    public String getContact() {
        return contact;
    }

    @Override
    public String toString() {
        return "Passenger{" + "id=" + id + ", name=" + passengerName + ", age=" + age 
               + ", gender=" + gender + ", contact=" + contact + '}';
    }
}
