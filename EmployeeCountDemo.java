class Employee {
    private String name;
    private int id;
    private static int employeeCount = 0;

    public Employee(String name, int id) {
        this.name = name;
        this.id = id;
        employeeCount++;
    }

    public void displayEmployee() {
        System.out.println("Employee ID: " + id + ", Name: " + name);
    }

    public static void displayTotalEmployees() {
        System.out.println("Total Employees: " + employeeCount);
    }
}

public class EmployeeCountDemo {
    public static void main(String[] args) {
        System.out.println("--- Employee Count Demonstration ---");
        
        Employee emp1 = new Employee("John Smith", 101);
        Employee emp2 = new Employee("Sarah Johnson", 102);
        Employee emp3 = new Employee("Mike Wilson", 103);
        Employee emp4 = new Employee("Emily Brown", 104);
        Employee emp5 = new Employee("David Davis", 105);
        
        System.out.println("\n--- Employee Details ---");
        emp1.displayEmployee();
        emp2.displayEmployee();
        emp3.displayEmployee();
        emp4.displayEmployee();
        emp5.displayEmployee();
        
        System.out.println("\n--- Total Employee Count ---");
        Employee.displayTotalEmployees();
    }
}
