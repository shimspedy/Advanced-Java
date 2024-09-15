package week1;
// Student.java

public class Student extends Person {
    String major;

    // Constructor for Student
    public Student(String name, int yearOfBirth, String major) {
        super(name, yearOfBirth);
        this.major = major;
    }

    // toString method for Student
    public String toString() {
        return super.toString() + ", Major: " + major;
    }
}