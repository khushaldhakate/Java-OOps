import java.util.Scanner;

class Calculator {
    public int add(int a, int b) {
        return a + b;
    }

    public int add(int a, int b, int c) {
        return a + b + c;
    }

    public double add(double a, double b) {
        return a + b;
    }
}

public class CalculatorDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculator calculator = new Calculator();
        
        System.out.println("--- Method Overloading Calculator Demo ---");
        
        System.out.println("\n--- Two Integer Addition ---");
        System.out.print("Enter first integer: ");
        int int1 = scanner.nextInt();
        System.out.print("Enter second integer: ");
        int int2 = scanner.nextInt();
        System.out.println("Result: " + int1 + " + " + int2 + " = " + calculator.add(int1, int2));
        
        System.out.println("\n--- Three Integer Addition ---");
        System.out.print("Enter first integer: ");
        int int3 = scanner.nextInt();
        System.out.print("Enter second integer: ");
        int int4 = scanner.nextInt();
        System.out.print("Enter third integer: ");
        int int5 = scanner.nextInt();
        System.out.println("Result: " + int3 + " + " + int4 + " + " + int5 + " = " + calculator.add(int3, int4, int5));
        
        System.out.println("\n--- Double Addition ---");
        System.out.print("Enter first double: ");
        double double1 = scanner.nextDouble();
        System.out.print("Enter second double: ");
        double double2 = scanner.nextDouble();
        System.out.println("Result: " + double1 + " + " + double2 + " = " + calculator.add(double1, double2));
        
        System.out.println("\n--- Method Overloading Demonstration Complete ---");
        System.out.println("Same method name 'add()' used with different parameters:");
        System.out.println("- add(int, int)");
        System.out.println("- add(int, int, int)");
        System.out.println("- add(double, double)");
        
        scanner.close();
    }
}
