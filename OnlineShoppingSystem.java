class PaymentProcessor extends Thread {
    private String orderId;
    private double amount;

    public PaymentProcessor(String orderId, double amount) {
        this.orderId = orderId;
        this.amount = amount;
    }

    @Override
    public void run() {
        System.out.println("Processing payment for Order: " + orderId);
        System.out.println("Amount: Rs. " + amount);
        
        try {
            Thread.sleep(2000);
            System.out.println("Payment verification for Order " + orderId + "...");
            Thread.sleep(1000);
            System.out.println("Payment completed for Order " + orderId);
        } catch (InterruptedException e) {
            System.out.println("Payment processing interrupted for Order " + orderId);
        }
    }
}

class OrderProcessor extends Thread {
    private String orderId;
    private String productName;

    public OrderProcessor(String orderId, String productName) {
        this.orderId = orderId;
        this.productName = productName;
    }

    @Override
    public void run() {
        System.out.println("Processing Order: " + orderId);
        System.out.println("Product: " + productName);
        
        try {
            Thread.sleep(1500);
            System.out.println("Packaging " + productName + " for Order " + orderId + "...");
            Thread.sleep(1000);
            System.out.println("Order " + orderId + " ready for shipping");
        } catch (InterruptedException e) {
            System.out.println("Order processing interrupted for Order " + orderId);
        }
    }
}

public class OnlineShoppingSystem {
    public static void main(String[] args) {
        System.out.println("--- Online Shopping System ---");
        
        PaymentProcessor payment1 = new PaymentProcessor("ORD001", 2500.00);
        OrderProcessor order1 = new OrderProcessor("ORD001", "Laptop");
        
        PaymentProcessor payment2 = new PaymentProcessor("ORD002", 1500.00);
        OrderProcessor order2 = new OrderProcessor("ORD002", "Smartphone");
        
        PaymentProcessor payment3 = new PaymentProcessor("ORD003", 800.00);
        OrderProcessor order3 = new OrderProcessor("ORD003", "Headphones");
        
        payment1.start();
        order1.start();
        
        payment2.start();
        order2.start();
        
        payment3.start();
        order3.start();
        
        try {
            payment1.join();
            order1.join();
            payment2.join();
            order2.join();
            payment3.join();
            order3.join();
        } catch (InterruptedException e) {
            System.out.println("Main thread interrupted: " + e.getMessage());
        }
        
        System.out.println("All orders processed successfully!");
        
        PaymentProcessor payment4 = new PaymentProcessor("ORD004", 3200.00);
        OrderProcessor order4 = new OrderProcessor("ORD004", "Tablet");
        
        payment4.start();
        order4.start();
        
        try {
            payment4.join();
            order4.join();
        } catch (InterruptedException e) {
            System.out.println("Main thread interrupted: " + e.getMessage());
        }
        
        System.out.println("Online shopping system completed all operations!");
    }
}
