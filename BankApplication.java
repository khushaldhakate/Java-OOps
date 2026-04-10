class BankingException extends Exception {
    public BankingException(String message) {
        super(message);
    }
}

public class BankApplication {
    private double balance;

    public BankApplication(double initialBalance) {
        this.balance = initialBalance;
    }

    public void deposit(double amount) throws BankingException {
        if (amount <= 0) {
            throw new BankingException("Deposit amount must be positive");
        }
        balance += amount;
        System.out.println("Deposit successful: Rs. " + amount);
        System.out.println("New balance: Rs. " + balance);
    }

    public void withdraw(double amount) throws BankingException {
        if (amount <= 0) {
            throw new BankingException("Withdrawal amount must be positive");
        }
        if (amount > balance) {
            throw new BankingException("Insufficient funds. Available: Rs. " + balance + ", Requested: Rs. " + amount);
        }
        balance -= amount;
        System.out.println("Withdrawal successful: Rs. " + amount);
        System.out.println("New balance: Rs. " + balance);
    }

    public void checkBalance() {
        System.out.println("Current balance: Rs. " + balance);
    }

    public static void main(String[] args) {
        BankApplication bank = new BankApplication(10000);
        
        System.out.println("--- Bank Application ---");
        bank.checkBalance();
        
        try {
            System.out.println("\nDepositing Rs. 5000...");
            bank.deposit(5000);
        } catch (BankingException e) {
            System.out.println("Error: " + e.getMessage());
        }
        
        try {
            System.out.println("\nWithdrawing Rs. 3000...");
            bank.withdraw(3000);
        } catch (BankingException e) {
            System.out.println("Error: " + e.getMessage());
        }
        
        try {
            System.out.println("\nDepositing Rs. -1000...");
            bank.deposit(-1000);
        } catch (BankingException e) {
            System.out.println("Error: " + e.getMessage());
        }
        
        try {
            System.out.println("\nWithdrawing Rs. 20000...");
            bank.withdraw(20000);
        } catch (BankingException e) {
            System.out.println("Error: " + e.getMessage());
        }
        
        bank.checkBalance();
    }
}
