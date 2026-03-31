class Bank {
    private final double interestRate = 8.5;

    public double calculateInterest(double amount) {
        return amount * interestRate / 100;
    }

    public void displayInterestRate() {
        System.out.println("Bank Interest Rate: " + interestRate + "%");
    }
}

public class BankInterestDemo {
    public static void main(String[] args) {
        System.out.println("--- Bank Interest Calculation ---");
        
        Bank bank = new Bank();
        bank.displayInterestRate();
        
        System.out.println("\n--- Interest Calculations for Customers ---");
        
        double[] principalAmounts = {10000, 25000, 50000, 75000, 100000};
        String[] customerNames = {"Alice", "Bob", "Charlie", "Diana", "Edward"};
        
        for (int i = 0; i < principalAmounts.length; i++) {
            double interest = bank.calculateInterest(principalAmounts[i]);
            System.out.println(customerNames[i] + " - Principal: Rs. " + principalAmounts[i] + 
                             ", Interest: Rs. " + interest);
        }
        
        System.out.println("\n--- Total Interest Summary ---");
        double totalInterest = 0;
        for (double amount : principalAmounts) {
            totalInterest += bank.calculateInterest(amount);
        }
        System.out.println("Total Interest for all customers: Rs. " + totalInterest);
    }
}
