public class DivisionCalculator {
    public static void main(String[] args) {
        System.out.println("--- Division Calculator ---");
        
        double num1 = 10;
        double den1 = 2;
        System.out.println("Division 1: " + num1 + " / " + den1);
        
        try {
            double result1 = num1 / den1;
            System.out.println("Result: " + result1);
        } catch (ArithmeticException e) {
            System.out.println("Error: Division by zero is not allowed");
        }
        
        double num2 = 15;
        double den2 = 0;
        System.out.println("\nDivision 2: " + num2 + " / " + den2);
        
        try {
            double result2 = num2 / den2;
            System.out.println("Result: " + result2);
        } catch (ArithmeticException e) {
            System.out.println("Error: Division by zero is not allowed");
        }
        
        double num3 = 20;
        double den3 = 4;
        System.out.println("\nDivision 3: " + num3 + " / " + den3);
        
        try {
            double result3 = num3 / den3;
            System.out.println("Result: " + result3);
        } catch (ArithmeticException e) {
            System.out.println("Error: Division by zero is not allowed");
        }
        
        double num4 = 8;
        double den4 = 0;
        System.out.println("\nDivision 4: " + num4 + " / " + den4);
        
        try {
            double result4 = num4 / den4;
            System.out.println("Result: " + result4);
        } catch (ArithmeticException e) {
            System.out.println("Error: Division by zero is not allowed");
        }
        
        double num5 = 25;
        double den5 = 5;
        System.out.println("\nDivision 5: " + num5 + " / " + den5);
        
        try {
            double result5 = num5 / den5;
            System.out.println("Result: " + result5);
        } catch (ArithmeticException e) {
            System.out.println("Error: Division by zero is not allowed");
        }
    }
}
