
A **class** is like a blueprint for creating objects. It defines the structure (attributes) and behaviors (methods) of something, like a student loan. A class doesn't store any actual data; it just tells you what data and actions an object should have.


An **object** is a specific instance of a class. It holds real data and performs actions defined by the class. In this example, `loan1` and `loan2` are objects of the `StudentLoan` class, representing two different loans for two different students.









### Java Code Example:

```java
class StudentLoan {
    double loanAmount;
    double interestRate;
    int termInYears;

    public StudentLoan(double loanAmount, double interestRate, int termInYears) {
        this.loanAmount = loanAmount;
        this.interestRate = interestRate;
        this.termInYears = termInYears;
    }

    public double calculateTotalRepayment() {
        return loanAmount + (loanAmount * interestRate / 100 * termInYears);
    }

    public void displayLoanDetails() {
        System.out.println("Loan Amount: $" + loanAmount);
        System.out.println("Interest Rate: " + interestRate + "%");
        System.out.println("Term: " + termInYears + " years");
        System.out.println("Total Repayment: $" + calculateTotalRepayment());
        System.out.println();
    }
}


create a diferent file which will be your public class to test the object file. 

public class StudentLoanTester {
    public static void main(String[] args) {
        StudentLoan loan1 = new StudentLoan(10000, 5.0, 5);
        loan1.displayLoanDetails();

        StudentLoan loan2 = new StudentLoan(20000, 4.0, 10);
        loan2.displayLoanDetails();
    }
}
