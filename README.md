### Classes
the class provides a blueprint of how objects will be created. It is essentially an important category in object-oriented programming. A class describes the data that objects will possess, along with the actions, better known as methods, which the objects can perform.

### Objects
Every Java program is composed of objects. Various objects interact with each other by each object being an instance of a class. A class defines a set of objects that all exhibit the same behavior. A class defines one scope of methods that may be used on its objects. This set of methods is commonly known as the public interface to the class. An object will have its private data; that is not accessible to the rest of the objects directly. Provision of a public interface while hiding the implementation details is called encapsulation.

### Differences between a class and object

A class is a blueprint, while an object is an instance of that class.
A class defines the structure and behavior, but an object stores the actual data and can perform the behavior.




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
}```