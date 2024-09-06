

public class studentloanTester {
    public static void main(String[] args) {
        // Object creation: first loan for a student
        StudentLoan loan1 = new StudentLoan(30000, 5.0, 10);
        loan1.displayLoanDetails();

        // Object creation: second loan for another student with different details
        StudentLoan loan2 = new StudentLoan(50000, 4.5, 15);
        loan2.displayLoanDetails();
    }
}