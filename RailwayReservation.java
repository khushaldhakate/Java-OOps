class RailwayTicket {
    private int availableTickets = 5;
    private final Object lock = new Object();

    public void bookTicket(String passengerName) {
        synchronized (lock) {
            if (availableTickets > 0) {
                System.out.println(passengerName + " is booking a ticket...");
                
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    System.out.println("Booking interrupted for " + passengerName);
                }
                
                availableTickets--;
                System.out.println(passengerName + " successfully booked a ticket.");
                System.out.println("Available tickets: " + availableTickets);
            } else {
                System.out.println(passengerName + " could not book ticket. No tickets available.");
            }
        }
    }
}

class Passenger extends Thread {
    private RailwayTicket railwayTicket;
    private String passengerName;

    public Passenger(RailwayTicket railwayTicket, String passengerName) {
        this.railwayTicket = railwayTicket;
        this.passengerName = passengerName;
    }

    @Override
    public void run() {
        railwayTicket.bookTicket(passengerName);
    }
}

public class RailwayReservation {
    public static void main(String[] args) {
        System.out.println("--- Railway Reservation System ---");
        
        RailwayTicket railwayTicket = new RailwayTicket();
        
        Passenger passenger1 = new Passenger(railwayTicket, "John");
        Passenger passenger2 = new Passenger(railwayTicket, "Alice");
        Passenger passenger3 = new Passenger(railwayTicket, "Bob");
        Passenger passenger4 = new Passenger(railwayTicket, "Sarah");
        Passenger passenger5 = new Passenger(railwayTicket, "Mike");
        Passenger passenger6 = new Passenger(railwayTicket, "Emma");
        Passenger passenger7 = new Passenger(railwayTicket, "David");
        
        passenger1.start();
        passenger2.start();
        passenger3.start();
        passenger4.start();
        passenger5.start();
        passenger6.start();
        passenger7.start();
        
        try {
            passenger1.join();
            passenger2.join();
            passenger3.join();
            passenger4.join();
            passenger5.join();
            passenger6.join();
            passenger7.join();
        } catch (InterruptedException e) {
            System.out.println("Main thread interrupted: " + e.getMessage());
        }
        
        System.out.println("All booking attempts completed!");
    }
}
