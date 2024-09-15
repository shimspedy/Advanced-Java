package week1;

public class Instructor extends Person {
    double salary;

    // this will be the Constructor for Instructor's information
    public Instructor(String name, int yearOfBirth, double salary) {
        super(name, yearOfBirth);
        this.salary = salary;
    }

    // toString method for Instructor to return the salary amount
    public String toString() {
        return super.toString() + ", Salary: $" + salary;
    }
}
