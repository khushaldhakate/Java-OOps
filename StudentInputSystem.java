import java.util.InputMismatchException;

public class StudentInputSystem {
    public static void main(String[] args) {
        System.out.println("--- Student Input System ---");
        
        String studentName1 = "John Smith";
        int studentAge1 = 20;
        int studentMarks1 = 85;
        
        try {
            System.out.println("\nProcessing Student 1:");
            processStudent(studentName1, studentAge1, studentMarks1);
        } catch (InputMismatchException e) {
            System.out.println("Input Mismatch Error: " + e.getMessage());
        } catch (ArithmeticException e) {
            System.out.println("Arithmetic Error: " + e.getMessage());
        }
        
        String studentName2 = "Alice Johnson";
        int studentAge2 = 21;
        int studentMarks2 = 0;
        
        try {
            System.out.println("\nProcessing Student 2:");
            processStudent(studentName2, studentAge2, studentMarks2);
        } catch (InputMismatchException e) {
            System.out.println("Input Mismatch Error: " + e.getMessage());
        } catch (ArithmeticException e) {
            System.out.println("Arithmetic Error: " + e.getMessage());
        }
        
        String studentName3 = "Bob Williams";
        int studentAge3 = 19;
        int studentMarks3 = 92;
        
        try {
            System.out.println("\nProcessing Student 3:");
            processStudent(studentName3, studentAge3, studentMarks3);
        } catch (InputMismatchException e) {
            System.out.println("Input Mismatch Error: " + e.getMessage());
        } catch (ArithmeticException e) {
            System.out.println("Arithmetic Error: " + e.getMessage());
        }
    }
    
    public static void processStudent(String name, int age, int marks) throws InputMismatchException, ArithmeticException {
        if (age < 0) {
            throw new InputMismatchException("Age cannot be negative");
        }
        
        if (marks < 0) {
            throw new ArithmeticException("Marks cannot be negative");
        }
        
        if (marks == 0) {
            throw new ArithmeticException("Division by zero in percentage calculation");
        }
        
        double percentage = (marks / 100.0) * 100;
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Marks: " + marks);
        System.out.println("Percentage: " + percentage + "%");
    }
}
