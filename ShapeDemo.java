import java.util.Scanner;

abstract class Shape {
    protected String name;

    public Shape(String name) {
        this.name = name;
    }

    public abstract double calculate_area();

    public void display_info() {
        System.out.println("Shape: " + name);
        System.out.println("Area: " + calculate_area());
    }
}

class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        super("Circle");
        this.radius = radius;
    }

    @Override
    public double calculate_area() {
        return Math.PI * radius * radius;
    }
}

class Rectangle extends Shape {
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        super("Rectangle");
        this.length = length;
        this.width = width;
    }

    @Override
    public double calculate_area() {
        return length * width;
    }
}

public class ShapeDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("--- Shape Area Calculator (Abstraction Demo) ---");
        
        System.out.println("\nEnter details for Circle:");
        System.out.print("Enter radius: ");
        double radius = scanner.nextDouble();
        
        System.out.println("\nEnter details for Rectangle:");
        System.out.print("Enter length: ");
        double length = scanner.nextDouble();
        System.out.print("Enter width: ");
        double width = scanner.nextDouble();
        
        Shape circle = new Circle(radius);
        Shape rectangle = new Rectangle(length, width);
        
        System.out.println("\n--- Shape Information ---");
        circle.display_info();
        System.out.println();
        rectangle.display_info();
        
        scanner.close();
    }
}
