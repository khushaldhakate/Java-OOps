class Employee {
    private String name;
    private double salary;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public void displayDetails() {
        System.out.println("Employee Name: " + this.name);
        System.out.println("Employee Salary: Rs. " + this.salary);
    }

    public Employee setSalary(double salary) {
        this.salary = salary;
        return this;
    }

    public Employee setName(String name) {
        this.name = name;
        return this;
    }

    public void printEmployeeInfo() {
        System.out.println("Current Employee - Name: " + name + ", Salary: Rs. " + salary);
    }
}

public class ThisKeywordDemo {
    public static void main(String[] args) {
        System.out.println("--- This Keyword Demonstration ---");
        
        Employee emp1 = new Employee("Robert Johnson", 55000.00);
        Employee emp2 = new Employee("Maria Garcia", 62000.00);
        Employee emp3 = new Employee("James Wilson", 48000.00);
        
        System.out.println("\n--- Initial Employee Details ---");
        emp1.displayDetails();
        emp2.displayDetails();
        emp3.displayDetails();
        
        System.out.println("\n--- Using This Keyword for Method Chaining ---");
        emp1.setSalary(58000.00).setName("Robert Johnson Jr.");
        emp2.setSalary(65000.00).setName("Maria Garcia Lopez");
        emp3.setSalary(52000.00).setName("James Wilson Jr.");
        
        System.out.println("\n--- Updated Employee Details ---");
        emp1.printEmployeeInfo();
        emp2.printEmployeeInfo();
        emp3.printEmployeeInfo();
        
        System.out.println("\n--- Passing This Reference ---");
        displayEmployee(emp1);
        displayEmployee(emp2);
        displayEmployee(emp3);
    }
    
    public static void displayEmployee(Employee emp) {
        System.out.println("Displaying Employee: " + emp);
        emp.printEmployeeInfo();
    }
}
