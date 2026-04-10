abstract class Payment {
    public abstract void pay(double amount);
}

class CreditCardPayment extends Payment {
    private String cardNumber;
    
    public CreditCardPayment(String cardNumber) {
        this.cardNumber = cardNumber;
    }
    
    @Override
    public void pay(double amount) {
        System.out.println("Paying $" + amount + " using Credit Card");
        System.out.println("Card ending with: ****" + cardNumber.substring(cardNumber.length() - 4));
        System.out.println("Transaction successful!");
    }
}

class UPIPayment extends Payment {
    private String upiId;
    
    public UPIPayment(String upiId) {
        this.upiId = upiId;
    }
    
    @Override
    public void pay(double amount) {
        System.out.println("Paying $" + amount + " using UPI");
        System.out.println("UPI ID: " + upiId);
        System.out.println("Payment completed via UPI!");
    }
}

class NetBankingPayment extends Payment {
    private String bankName;
    
    public NetBankingPayment(String bankName) {
        this.bankName = bankName;
    }
    
    @Override
    public void pay(double amount) {
        System.out.println("Paying $" + amount + " using Net Banking");
        System.out.println("Bank: " + bankName);
        System.out.println("Online banking transfer successful!");
    }
}

public class PaymentDemo {
    public static void main(String[] args) {
        Payment[] payments = {
            new CreditCardPayment("1234567890123456"),
            new UPIPayment("user@paytm"),
            new NetBankingPayment("State Bank of India")
        };
        
        System.out.println("=== Payment Methods Demo ===");
        for (Payment payment : payments) {
            payment.pay(2500.00);
            System.out.println();
        }
        
        System.out.println("=== Individual Payment Tests ===");
        Payment creditCard = new CreditCardPayment("9876543210987654");
        Payment upi = new UPIPayment("john@phonepe");
        Payment netBanking = new NetBankingPayment("ICICI Bank");
        
        creditCard.pay(1500.75);
        System.out.println();
        upi.pay(999.99);
        System.out.println();
        netBanking.pay(5000.00);
    }
}
