import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;



// BalanceCalculator class handles the GUI and user interactions
public class BalanceCalculator extends JFrame implements ActionListener {
    // GUI components
    private JLabel lblInitialDeposit, lblAnnualInterestRate, lblNumberOfYears, lblFinalBalance;
    private JTextField txtInitialDeposit, txtAnnualInterestRate, txtNumberOfYears;
    private JButton btnCalculate;

    // Constructor to set up the GUI
    public BalanceCalculator() {
        // Set the title of the window
        setTitle("Balance Calculator");

        // Set the size of the window (width x height)
        setSize(400, 250);

        // Specify what happens when the window is closed
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Center the window on the screen
        setLocationRelativeTo(null);

        // Set layout to GridBagLayout for better control
        setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(10, 10, 10, 10); // Add padding around components

        // Initialize labels
        lblInitialDeposit = new JLabel("Initial Deposit:");
        lblAnnualInterestRate = new JLabel("Annual Interest Rate:");
        lblNumberOfYears = new JLabel("Number of Years:");
        lblFinalBalance = new JLabel("Final Balance: ");

        // Initialize text fields with preferred sizes
        txtInitialDeposit = new JTextField();
        txtInitialDeposit.setPreferredSize(new Dimension(150, 30));

        txtAnnualInterestRate = new JTextField();
        txtAnnualInterestRate.setPreferredSize(new Dimension(150, 30));

        txtNumberOfYears = new JTextField();
        txtNumberOfYears.setPreferredSize(new Dimension(150, 30));

        // Initialize button
        btnCalculate = new JButton("Calculate New Balance");
        btnCalculate.addActionListener(this); // Register the button to listen for clicks

        // Add components to the frame with GridBagLayout constraints

        // First row: Initial Deposit
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.anchor = GridBagConstraints.WEST;
        add(lblInitialDeposit, gbc);

        gbc.gridx = 1;
        gbc.gridy = 0;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        add(txtInitialDeposit, gbc);

        // Second row: Annual Interest Rate
        gbc.gridx = 0;
        gbc.gridy = 1;
        add(lblAnnualInterestRate, gbc);

        gbc.gridx = 1;
        gbc.gridy = 1;
        add(txtAnnualInterestRate, gbc);

        // Third row: Number of Years
        gbc.gridx = 0;
        gbc.gridy = 2;
        add(lblNumberOfYears, gbc);

        gbc.gridx = 1;
        gbc.gridy = 2;
        add(txtNumberOfYears, gbc);

        // Fourth row: Calculate button and Final Balance label
        gbc.gridx = 0;
        gbc.gridy = 3;
        add(btnCalculate, gbc);

        gbc.gridx = 1;
        gbc.gridy = 3;
        add(lblFinalBalance, gbc);

        // Make the window visible
        setVisible(true);
    }

    // Handle button click events
    public void actionPerformed(ActionEvent e) {
        try {
            // Get user inputs from text fields
            double initialDeposit = Double.parseDouble(txtInitialDeposit.getText());
            double annualInterestRate = Double.parseDouble(txtAnnualInterestRate.getText());
            int numberOfYears = Integer.parseInt(txtNumberOfYears.getText());

            // Validate inputs
            if (initialDeposit < 0 || annualInterestRate < 0 || numberOfYears < 0) {
                JOptionPane.showMessageDialog(this, "Please enter positive values.", "Input Error", JOptionPane.ERROR_MESSAGE);
                return;
            }

            // Create a BankAccount object with user inputs
            BankAccount account = new BankAccount(initialDeposit, annualInterestRate, numberOfYears);

            // Calculate the final balance
            double finalBalance = account.calculateFinalBalance();

            // Display the final balance, formatted to two decimal places
            lblFinalBalance.setText(String.format("Final Balance: $%.2f", finalBalance));

        } catch (NumberFormatException ex) {
            // Show error message if inputs are not valid numbers
            JOptionPane.showMessageDialog(this, "Please enter valid numeric values.", "Input Error", JOptionPane.ERROR_MESSAGE);
        }
    }








    // BankAccount class handles the calculation of the final balance
class BankAccount {
    private double initialDeposit;
    private double annualInterestRate;
    private int numberOfYears;

    // Constructor to initialize the BankAccount with user inputs
    public BankAccount(double initialDeposit, double annualInterestRate, int numberOfYears) {
        this.initialDeposit = initialDeposit;
        this.annualInterestRate = annualInterestRate;
        this.numberOfYears = numberOfYears;
    }

    // Method to calculate the final balance using compound interest
    public double calculateFinalBalance() {
        double rate = annualInterestRate / 100; // Convert percentage to decimal
        return initialDeposit * Math.pow(1 + rate, numberOfYears);
    }
}

    // Main method to run the application
    public static void main(String[] args) {
        // Use the Event Dispatch Thread to build the UI
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new BalanceCalculator(); // Create and show the GUI
            }
        });
    }
}
