package week1;
// Person.java
public class Person {
    String name;
    int yearOfBirth;

    // Constructor for Person
    public Person(String name, int yearOfBirth) {
        this.name = name;
        this.yearOfBirth = yearOfBirth;
    }

    // toString method for Person
    public String toString() {
        return "Name: " + name + ", Year of Birth: " + yearOfBirth;
    }
}

