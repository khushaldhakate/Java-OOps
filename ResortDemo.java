import java.util.Scanner;

class Resort {
    private int RNo;
    private String Name;
    private double Charges;
    private int Days;
    private double Total;

    public Resort() {
        RNo = 0;
        Name = "";
        Charges = 0.0;
        Days = 0;
        Total = 0.0;
    }

    public void GetInfo() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Room Number: ");
        RNo = scanner.nextInt();
        scanner.nextLine();
        
        System.out.print("Enter Customer Name: ");
        Name = scanner.nextLine();
        
        System.out.print("Enter Charges per Day: ");
        Charges = scanner.nextDouble();
        
        System.out.print("Enter Number of Days: ");
        Days = scanner.nextInt();
        
        scanner.close();
    }

    public void Compute() {
        Total = Charges * Days;
        
        if (Total > 11000) {
            Total = Total + (Total * 0.02);
        }
    }

    public void DispInfo() {
        System.out.println("\n--- Resort Booking Details ---");
        System.out.println("Room Number: " + RNo);
        System.out.println("Customer Name: " + Name);
        System.out.println("Charges per Day: Rs. " + Charges);
        System.out.println("Number of Days: " + Days);
        System.out.println("Total Amount: Rs. " + Total);
        
        if (Total > 11000) {
            System.out.println("Note: 2% extra charge applied as total exceeds Rs. 11000");
        }
    }
}

public class ResortDemo {
    public static void main(String[] args) {
        Resort resort1 = new Resort();
        Resort resort2 = new Resort();
        
        System.out.println("--- Resort Booking System ---");
        System.out.println("\nEnter details for first booking:");
        resort1.GetInfo();
        resort1.Compute();
        resort1.DispInfo();
        
        System.out.println("\nEnter details for second booking:");
        resort2.GetInfo();
        resort2.Compute();
        resort2.DispInfo();
    }
}
