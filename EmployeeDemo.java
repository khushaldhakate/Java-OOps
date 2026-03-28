import java.util.Scanner;

class Employee {
    private int empno;
    private String ename;
    private double basic;
    private double hra;
    private double da;
    private double netpay;

    public Employee() {
        empno = 0;
        ename = "";
        basic = 0.0;
        hra = 0.0;
        da = 0.0;
        netpay = 0.0;
    }

    public void havedata() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Employee Number: ");
        empno = scanner.nextInt();
        scanner.nextLine();
        
        System.out.print("Enter Employee Name: ");
        ename = scanner.nextLine();
        
        System.out.print("Enter Basic Salary: ");
        basic = scanner.nextDouble();
        
        scanner.close();
    }

    public void Calculate() {
        hra = basic * 0.10;
        da = basic * 0.05;
        netpay = basic + hra + da;
    }

    public void dispdata() {
        System.out.println("\n--- Employee Details ---");
        System.out.println("Employee Number: " + empno);
        System.out.println("Employee Name: " + ename);
        System.out.println("Basic Salary: Rs. " + basic);
        System.out.println("HRA (10%): Rs. " + hra);
        System.out.println("DA (5%): Rs. " + da);
        System.out.println("Net Pay: Rs. " + netpay);
    }
}

public class EmployeeDemo {
    public static void main(String[] args) {
        Employee emp1 = new Employee();
        Employee emp2 = new Employee();
        
        System.out.println("--- Employee Salary Calculation System ---");
        System.out.println("\nEnter details for first employee:");
        emp1.havedata();
        emp1.Calculate();
        emp1.dispdata();
        
        System.out.println("\nEnter details for second employee:");
        emp2.havedata();
        emp2.Calculate();
        emp2.dispdata();
    }
}
