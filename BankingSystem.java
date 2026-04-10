class BankAccount {
    private double balance;
    private final Object lock = new Object();

    public BankAccount(double initialBalance) {
        this.balance = initialBalance;
    }

    public void deposit(double amount, String accountHolder) {
        synchronized (lock) {
            System.out.println(accountHolder + " depositing Rs. " + amount);
            double oldBalance = balance;
            balance += amount;
            System.out.println(accountHolder + " deposit successful. Old balance: Rs. " + oldBalance + ", New balance: Rs. " + balance);
        }
    }

    public void withdraw(double amount, String accountHolder) {
        synchronized (lock) {
            System.out.println(accountHolder + " attempting to withdraw Rs. " + amount);
            
            if (balance >= amount) {
                double oldBalance = balance;
                balance -= amount;
                System.out.println(accountHolder + " withdrawal successful. Old balance: Rs. " + oldBalance + ", New balance: Rs. " + balance);
            } else {
                System.out.println(accountHolder + " withdrawal failed. Insufficient funds. Available: Rs. " + balance + ", Requested: Rs. " + amount);
            }
        }
    }

    public void checkBalance(String accountHolder) {
        synchronized (lock) {
            System.out.println(accountHolder + " checking balance: Rs. " + balance);
        }
    }
}

class BankingThread extends Thread {
    private BankAccount account;
    private String accountHolder;
    private String transactionType;
    private double amount;

    public BankingThread(BankAccount account, String accountHolder, String transactionType, double amount) {
        this.account = account;
        this.accountHolder = accountHolder;
        this.transactionType = transactionType;
        this.amount = amount;
    }

    @Override
    public void run() {
        if (transactionType.equals("deposit")) {
            account.deposit(amount, accountHolder);
        } else if (transactionType.equals("withdraw")) {
            account.withdraw(amount, accountHolder);
        } else if (transactionType.equals("check")) {
            account.checkBalance(accountHolder);
        }
    }
}

public class BankingSystem {
    public static void main(String[] args) {
        System.out.println("--- Banking System with Synchronized Block ---");
        
        BankAccount jointAccount = new BankAccount(10000);
        
        BankingThread thread1 = new BankingThread(jointAccount, "John", "deposit", 5000);
        BankingThread thread2 = new BankingThread(jointAccount, "Alice", "withdraw", 3000);
        BankingThread thread3 = new BankingThread(jointAccount, "Bob", "deposit", 2000);
        BankingThread thread4 = new BankingThread(jointAccount, "Sarah", "withdraw", 8000);
        BankingThread thread5 = new BankingThread(jointAccount, "Mike", "check", 0);
        
        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();
        thread5.start();
        
        try {
            thread1.join();
            thread2.join();
            thread3.join();
            thread4.join();
            thread5.join();
        } catch (InterruptedException e) {
            System.out.println("Main thread interrupted: " + e.getMessage());
        }
        
        System.out.println("\n--- Additional Transactions ---");
        
        BankingThread thread6 = new BankingThread(jointAccount, "Emma", "deposit", 1500);
        BankingThread thread7 = new BankingThread(jointAccount, "David", "withdraw", 2000);
        
        thread6.start();
        thread7.start();
        
        try {
            thread6.join();
            thread7.join();
        } catch (InterruptedException e) {
            System.out.println("Main thread interrupted: " + e.getMessage());
        }
        
        System.out.println("All banking transactions completed!");
    }
}
