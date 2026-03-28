import java.util.Scanner;

class CARRENTAL {
    private String carType;
    private int rent;

    public CARRENTAL() {
        this.carType = "";
        this.rent = 0;
    }

    public void GetCar() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Available Car Types:");
        System.out.println("1. Small Car");
        System.out.println("2. Van");
        System.out.println("3. SUV");
        System.out.print("Enter your choice (1-3): ");
        
        int choice = scanner.nextInt();
        scanner.nextLine();
        
        switch (choice) {
            case 1:
                carType = "Small Car";
                rent = 1000;
                break;
            case 2:
                carType = "Van";
                rent = 800;
                break;
            case 3:
                carType = "SUV";
                rent = 2500;
                break;
            default:
                System.out.println("Invalid choice! Setting to Small Car by default.");
                carType = "Small Car";
                rent = 1000;
        }
    }

    public int GetRent() {
        return rent;
    }

    public void ShowCar() {
        System.out.println("Car Type: " + carType);
        System.out.println("Rent: Rs. " + rent + " per day");
    }
}

public class CarRentalDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("--- Car Rental System ---");
        
        CARRENTAL rental1 = new CARRENTAL();
        System.out.println("\nFirst Rental:");
        rental1.GetCar();
        rental1.ShowCar();
        
        CARRENTAL rental2 = new CARRENTAL();
        System.out.println("\nSecond Rental:");
        rental2.GetCar();
        rental2.ShowCar();
        
        System.out.println("\n--- Rental Summary ---");
        System.out.println("First rental rent: Rs. " + rental1.GetRent());
        System.out.println("Second rental rent: Rs. " + rental2.GetRent());
        
        scanner.close();
    }
}
