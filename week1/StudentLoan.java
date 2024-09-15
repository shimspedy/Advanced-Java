package week1;

/**
 * This class shows a student lloan amount, interest rate, and term.
 *  I was going for [Public class StudentLoan ] but i run into errors 
 *  but the code works 
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
     * 
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
