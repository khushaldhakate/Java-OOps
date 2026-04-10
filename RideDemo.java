abstract class Ride {
    protected double distance;
    
    public Ride(double distance) {
        this.distance = distance;
    }
    
    public abstract double calculateFare();
    
    public void displayRideInfo() {
        System.out.println("Distance: " + distance + " km");
        System.out.println("Fare: $" + calculateFare());
    }
}

class BikeRide extends Ride {
    private static final double RATE_PER_KM = 5.0;
    
    public BikeRide(double distance) {
        super(distance);
    }
    
    @Override
    public double calculateFare() {
        return distance * RATE_PER_KM;
    }
    
    @Override
    public void displayRideInfo() {
        System.out.println("=== Bike Ride ===");
        System.out.println("Rate: $" + RATE_PER_KM + " per km");
        super.displayRideInfo();
    }
}

class AutoRide extends Ride {
    private static final double RATE_PER_KM = 8.0;
    
    public AutoRide(double distance) {
        super(distance);
    }
    
    @Override
    public double calculateFare() {
        return distance * RATE_PER_KM;
    }
    
    @Override
    public void displayRideInfo() {
        System.out.println("=== Auto Ride ===");
        System.out.println("Rate: $" + RATE_PER_KM + " per km");
        super.displayRideInfo();
    }
}

class CarRide extends Ride {
    private static final double RATE_PER_KM = 12.0;
    
    public CarRide(double distance) {
        super(distance);
    }
    
    @Override
    public double calculateFare() {
        return distance * RATE_PER_KM;
    }
    
    @Override
    public void displayRideInfo() {
        System.out.println("=== Car Ride ===");
        System.out.println("Rate: $" + RATE_PER_KM + " per km");
        super.displayRideInfo();
    }
}

public class RideDemo {
    public static void main(String[] args) {
        System.out.println("=== Ride Booking Demo ===");
        
        Ride[] rides = {
            new BikeRide(10.5),
            new AutoRide(7.2),
            new CarRide(15.0),
            new BikeRide(5.0),
            new AutoRide(12.8)
        };
        
        System.out.println("\n=== All Rides Information ===");
        for (Ride ride : rides) {
            ride.displayRideInfo();
            System.out.println();
        }
        
        System.out.println("=== Runtime Polymorphism Demo ===");
        System.out.println("Calculating fares for different ride types:");
        
        for (Ride ride : rides) {
            System.out.println("Ride type: " + ride.getClass().getSimpleName());
            System.out.println("Fare: $" + ride.calculateFare());
            System.out.println();
        }
        
        System.out.println("=== Individual Ride Tests ===");
        BikeRide bike = new BikeRide(8.5);
        AutoRide auto = new AutoRide(6.3);
        CarRide car = new CarRide(20.0);
        
        bike.displayRideInfo();
        System.out.println();
        auto.displayRideInfo();
        System.out.println();
        car.displayRideInfo();
        
        System.out.println("\n=== Total Revenue Calculation ===");
        double totalRevenue = 0;
        for (Ride ride : rides) {
            totalRevenue += ride.calculateFare();
        }
        System.out.println("Total revenue from all rides: $" + totalRevenue);
    }
}
