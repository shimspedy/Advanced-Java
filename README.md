### Classes
the class provides a blueprint of how objects will be created. It is essentially an important category in object-oriented programming. A class describes the data that objects will possess, along with the actions, better known as methods, which the objects can perform.

### Objects
Every Java program is composed of objects. Various objects interact with each other by each object being an instance of a class. A class defines a set of objects that all exhibit the same behavior. A class defines one scope of methods that may be used on its objects. This set of methods is commonly known as the public interface to the class. An object will have its private data; that is not accessible to the rest of the objects directly. Provision of a public interface while hiding the implementation details is called encapsulation.

### Differences between a class and object

A class is a blueprint, while an object is an instance of that class.
A class defines the structure and behavior, but an object stores the actual data and can perform the behavior.




### Java Code Example:

In this example we agoin to calculate a student Loan monthly payments base on their details.

```java

/**
 * This class shows a student lloan amount, interest rate, and term.
 */
class StudentLoan {
    private double loanAmount;
    private double interestRate;
    private int termInYears;

    /**
     * Constructs a student loan with the specified loan amount, interest rate, and term.
     * 
     * @param loanAmount the total amount of the loan
     * @param interestRate the annual interest rate as a percentage
     * @param termInYears the term of the loan in years
     */

    public  StudentLoan(double loanAmount, double interestRate, int termInYears) {
        this.loanAmount = loanAmount;
        this.interestRate = interestRate;
        this.termInYears = termInYears;
    }

    /**
     * Calculates the monthly payment for this loan.
     * 
     * @return the monthly payment amount
     */
    public double calculateMonthlyPayment() {
        double monthlyInterestRate = interestRate / 12 / 100;
        int termInMonths = termInYears * 12;
        return (loanAmount * monthlyInterestRate) / (1 - Math.pow(1 + monthlyInterestRate, - termInMonths));
    }

    /**
     * Displays the details of the loan, including the loan amount, interest rate, term, 
     * and the calculated monthly payment.
     */
    public void displayLoanDetails() {
        System.out.println("Loan Amount: $" + loanAmount);
        System.out.println("Interest Rate: " + interestRate + "%");
        System.out.println("Term: " + termInYears + " years");
        System.out.println("Monthly Payment: $" + calculateMonthlyPayment());
        System.out.println(); // Blank line for readability
    }
}
```


create a diferent file which will be your public class to test the object file. in this tester file we can enter as many student loan details  as we want to calculate their monthly payment

```java
public class StudentLoanTester {
    public static void main(String[] args) {
        StudentLoan loan1 = new StudentLoan(10000, 5.0, 5);
        loan1.displayLoanDetails();

        StudentLoan loan2 = new StudentLoan(20000, 4.0, 10);
        loan2.displayLoanDetails();
    }
}```