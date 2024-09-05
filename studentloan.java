// Class definition for Student Loan
class StudentLoan {
    // Attributes of the Student Loan
    double loanAmount;
    double interestRate;
    int termInYears;

    // Constructor to initialize the loan details
    public StudentLoan(double loanAmount, double interestRate, int termInYears) {
        this.loanAmount = loanAmount;
        this.interestRate = interestRate;
        this.termInYears = termInYears;
    }

    // Method to calculate monthly payment based on loan details
    public double calculateMonthlyPayment() {
        double monthlyInterestRate = interestRate / 12 / 100;
        int termInMonths = termInYears * 12;
        // Formula to calculate the monthly payment
        return (loanAmount * monthlyInterestRate) / (1 - Math.pow(1 + monthlyInterestRate, -termInMonths));
    }

    // Method to display the loan details
    public void displayLoanDetails() {
        System.out.println("Loan Amount: $" + loanAmount);
        System.out.println("Interest Rate: " + interestRate + "%");
        System.out.println("Term: " + termInYears + " years");
        System.out.println("Monthly Payment: $" + calculateMonthlyPayment());
    }
}


