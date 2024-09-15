package week1;

public class codeDemo {
    public static void main(String[] args) {
        // for a Student object
        Student student = new Student("John", 1998, "Doctor");
        // for an Instructor object
        Instructor instructor = new Instructor("Hashim", 1980, 86000.0);

        // now to Test the toString methods we print them in the console
        System.out.println(student.toString());
        System.out.println(instructor.toString());
    }
}
