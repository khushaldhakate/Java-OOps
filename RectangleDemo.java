import java.util.Scanner;

class Rectangle {
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double Area() {
        return length * width;
    }

    public void displayArea() {
        System.out.println("Rectangle with Length: " + length + " and Width: " + width);
        System.out.println("Area: " + Area());
    }
}

public class RectangleDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("--- Rectangle Area Calculator ---");
        
        System.out.println("\nEnter details for first rectangle:");
        System.out.print("Enter length: ");
        double length1 = scanner.nextDouble();
        System.out.print("Enter width: ");
        double width1 = scanner.nextDouble();
        
        System.out.println("\nEnter details for second rectangle:");
        System.out.print("Enter length: ");
        double length2 = scanner.nextDouble();
        System.out.print("Enter width: ");
        double width2 = scanner.nextDouble();
        
        Rectangle rect1 = new Rectangle(length1, width1);
        Rectangle rect2 = new Rectangle(length2, width2);
        
        System.out.println("\n--- Rectangle Areas ---");
        System.out.print("First Rectangle: ");
        rect1.displayArea();
        
        System.out.print("Second Rectangle: ");
        rect2.displayArea();
        
        scanner.close();
    }
}
