class Restaurant {
    private String[] orders = new String[5];
    private int count = 0;
    private boolean available = true;

    public synchronized void placeOrder(String order) {
        while (!available || count >= orders.length) {
            try {
                System.out.println("Kitchen full. " + Thread.currentThread().getName() + " waiting...");
                wait();
            } catch (InterruptedException e) {
                System.out.println(Thread.currentThread().getName() + " interrupted while waiting");
                return;
            }
        }
        
        orders[count] = order;
        count++;
        System.out.println(Thread.currentThread().getName() + " placed order: " + order);
        available = false;
        notifyAll();
    }

    public synchronized void prepareOrder() {
        while (available || count == 0) {
            try {
                System.out.println("No orders. Chef waiting...");
                wait();
            } catch (InterruptedException e) {
                System.out.println("Chef interrupted while waiting");
                return;
            }
        }
        
        String order = orders[0];
        System.out.println("Chef preparing: " + order);
        
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            System.out.println("Chef interrupted while cooking");
        }
        
        System.out.println("Order ready: " + order);
        
        for (int i = 0; i < count - 1; i++) {
            orders[i] = orders[i + 1];
        }
        count--;
        available = true;
        notifyAll();
    }
}

class Customer extends Thread {
    private Restaurant restaurant;
    private String order;

    public Customer(Restaurant restaurant, String order, String name) {
        this.restaurant = restaurant;
        this.order = order;
        this.setName(name);
    }

    @Override
    public void run() {
        restaurant.placeOrder(order);
    }
}

class Chef extends Thread {
    private Restaurant restaurant;

    public Chef(Restaurant restaurant) {
        this.restaurant = restaurant;
        this.setName("Chef");
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            restaurant.prepareOrder();
        }
    }
}

public class Restaurant {
    public static void main(String[] args) {
        System.out.println("--- Restaurant Producer-Consumer System ---");
        
        Restaurant restaurant = new Restaurant();
        
        Chef chef = new Chef(restaurant);
        chef.start();
        
        Customer customer1 = new Customer(restaurant, "Pasta", "Customer 1");
        Customer customer2 = new Customer(restaurant, "Pizza", "Customer 2");
        Customer customer3 = new Customer(restaurant, "Salad", "Customer 3");
        Customer customer4 = new Customer(restaurant, "Soup", "Customer 4");
        Customer customer5 = new Customer(restaurant, "Burger", "Customer 5");
        
        customer1.start();
        customer2.start();
        customer3.start();
        customer4.start();
        customer5.start();
        
        try {
            chef.join();
            customer1.join();
            customer2.join();
            customer3.join();
            customer4.join();
            customer5.join();
        } catch (InterruptedException e) {
            System.out.println("Main thread interrupted: " + e.getMessage());
        }
        
        System.out.println("Restaurant service completed!");
    }
}
