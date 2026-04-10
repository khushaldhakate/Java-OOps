class InsufficientBalanceException extends Exception {
    public InsufficientBalanceException(String message) {
        super(message);
    }
}

public class ATMWithdrawal {
    private double balance;

    public ATMWithdrawal(double balance) {
        this.balance = balance;
    }

    public void withdraw(double amount) throws InsufficientBalanceException {
        if (amount > balance) {
            throw new InsufficientBalanceException("Insufficient balance! Available: Rs. " + balance + ", Requested: Rs. " + amount);
        }
        balance -= amount;
        System.out.println("Withdrawal successful! Amount: Rs. " + amount);
        System.out.println("Remaining balance: Rs. " + balance);
    }

    public void checkBalance() {
        System.out.println("Current balance: Rs. " + balance);
    }

    public static void main(String[] args) {
        ATMWithdrawal atm = new ATMWithdrawal(5000);
        
        System.out.println("--- ATM Withdrawal System ---");
        atm.checkBalance();
        
        System.out.println("\nAttempting to withdraw Rs. 2000...");
        try {
            atm.withdraw(2000);
        } catch (InsufficientBalanceException e) {
            System.out.println("Error: " + e.getMessage());
        }
        
        System.out.println("\nAttempting to withdraw Rs. 4000...");
        try {
            atm.withdraw(4000);
        } catch (InsufficientBalanceException e) {
            System.out.println("Error: " + e.getMessage());
        }
        
        atm.checkBalance();
        
        System.out.println("\nAttempting to withdraw Rs. 1000...");
        try {
            atm.withdraw(1000);
        } catch (InsufficientBalanceException e) {
            System.out.println("Error: " + e.getMessage());
        }
        
        atm.checkBalance();
    }
}
