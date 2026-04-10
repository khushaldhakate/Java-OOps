abstract class Employee {
    protected String name;
    protected int id;
    protected double salary;
    
    public Employee(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }
    
    public abstract double calculateBonus();
    
    public void displayEmployeeInfo() {
        System.out.println("Employee ID: " + id);
        System.out.println("Employee Name: " + name);
        System.out.println("Base Salary: $" + salary);
    }
}

class Manager extends Employee {
    private String department;
    
    public Manager(String name, int id, double salary, String department) {
        super(name, id, salary);
        this.department = department;
    }
    
    @Override
    public double calculateBonus() {
        return salary * 0.20;
    }
    
    @Override
    public void displayEmployeeInfo() {
        super.displayEmployeeInfo();
        System.out.println("Position: Manager");
        System.out.println("Department: " + department);
        System.out.println("Bonus (20%): $" + calculateBonus());
        System.out.println("Total Compensation: $" + (salary + calculateBonus()));
    }
}

class Developer extends Employee {
    private String programmingLanguage;
    private double projectIncentive;
    
    public Developer(String name, int id, double salary, String programmingLanguage, double projectIncentive) {
        super(name, id, salary);
        this.programmingLanguage = programmingLanguage;
        this.projectIncentive = projectIncentive;
    }
    
    @Override
    public double calculateBonus() {
        return (salary * 0.10) + projectIncentive;
    }
    
    @Override
    public void displayEmployeeInfo() {
        super.displayEmployeeInfo();
        System.out.println("Position: Developer");
        System.out.println("Programming Language: " + programmingLanguage);
        System.out.println("Project Incentive: $" + projectIncentive);
        System.out.println("Bonus (10% + Incentive): $" + calculateBonus());
        System.out.println("Total Compensation: $" + (salary + calculateBonus()));
    }
}

public class EmployeeBonusDemo {
    public static void main(String[] args) {
        System.out.println("=== Employee Bonus Calculation Demo ===");
        
        Employee[] employees = {
            new Manager("Alice Johnson", 101, 80000.00, "IT"),
            new Developer("Bob Smith", 201, 65000.00, "Java", 5000.00),
            new Manager("Carol Williams", 102, 95000.00, "Finance"),
            new Developer("David Brown", 202, 70000.00, "Python", 3000.00)
        };
        
        System.out.println("\n=== Runtime Polymorphism Demo ===");
        for (Employee emp : employees) {
            emp.displayEmployeeInfo();
            System.out.println("------------------------");
        }
        
        System.out.println("\n=== Individual Bonus Calculations ===");
        Manager manager = new Manager("Eve Davis", 103, 85000.00, "HR");
        Developer developer = new Developer("Frank Miller", 203, 60000.00, "JavaScript", 4000.00);
        
        manager.displayEmployeeInfo();
        System.out.println();
        developer.displayEmployeeInfo();
    }
}
