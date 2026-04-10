class Shape {
    public void display() {
        System.out.println("This is a shape");
    }
}

class Circle extends Shape {
    private double radius;
    
    public Circle(double radius) {
        this.radius = radius;
    }
    
    public double calculateArea() {
        return Math.PI * radius * radius;
    }
    
    @Override
    public void display() {
        System.out.println("Circle with radius " + radius);
        System.out.println("Area: " + calculateArea());
    }
}

class Rectangle extends Shape {
    private double length;
    private double width;
    
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }
    
    public double calculateArea() {
        return length * width;
    }
    
    @Override
    public void display() {
        System.out.println("Rectangle with length " + length + " and width " + width);
        System.out.println("Area: " + calculateArea());
    }
}

public class ShapeHierarchyDemo {
    public static void main(String[] args) {
        Shape shape = new Shape();
        Circle circle = new Circle(5.0);
        Rectangle rectangle = new Rectangle(4.0, 6.0);
        
        System.out.println("=== Shape Hierarchy Demo ===");
        shape.display();
        System.out.println();
        circle.display();
        System.out.println();
        rectangle.display();
        
        Shape[] shapes = {circle, rectangle};
        System.out.println("\n=== Polymorphic Display ===");
        for (Shape s : shapes) {
            s.display();
            System.out.println();
        }
    }
}
