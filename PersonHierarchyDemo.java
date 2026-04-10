class Person {
    protected String name;
    protected int age;
    
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    
    public void role() {
        System.out.println(name + " is a person in society");
    }
    
    public void displayBasicInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

class Employee extends Person {
    protected String employeeId;
    protected String department;
    
    public Employee(String name, int age, String employeeId, String department) {
        super(name, age);
        this.employeeId = employeeId;
        this.department = department;
    }
    
    @Override
    public void role() {
        System.out.println(name + " is an employee working in " + department);
    }
    
    public void displayEmployeeInfo() {
        displayBasicInfo();
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Department: " + department);
    }
}

class Manager extends Employee {
    private String team;
    private int teamSize;
    
    public Manager(String name, int age, String employeeId, String department, String team, int teamSize) {
        super(name, age, employeeId, department);
        this.team = team;
        this.teamSize = teamSize;
    }
    
    @Override
    public void role() {
        System.out.println(name + " is a manager leading the " + team + " team");
    }
    
    public void displayManagerInfo() {
        displayEmployeeInfo();
        System.out.println("Team: " + team);
        System.out.println("Team Size: " + teamSize);
    }
    
    public void conductMeeting() {
        System.out.println(name + " is conducting a team meeting for " + teamSize + " members");
    }
}

public class PersonHierarchyDemo {
    public static void main(String[] args) {
        System.out.println("=== Person Hierarchy Demo ===");
        
        Person person = new Person("John Doe", 30);
        Employee employee = new Employee("Jane Smith", 28, "EMP001", "IT");
        Manager manager = new Manager("Mike Johnson", 35, "MGR001", "Software", "Development", 8);
        
        System.out.println("\n=== Basic Information ===");
        person.displayBasicInfo();
        System.out.println();
        employee.displayEmployeeInfo();
        System.out.println();
        manager.displayManagerInfo();
        
        System.out.println("\n=== Role Demonstration (Runtime Polymorphism) ===");
        Person[] people = {person, employee, manager};
        
        for (Person p : people) {
            p.role();
        }
        
        System.out.println("\n=== Multilevel Inheritance Features ===");
        manager.conductMeeting();
        
        System.out.println("\n=== Additional Test Cases ===");
        Employee devEmployee = new Employee("Alice Brown", 26, "DEV002", "Development");
        Manager projectManager = new Manager("Carol White", 40, "PM001", "Projects", "Innovation", 12);
        
        devEmployee.role();
        projectManager.role();
        projectManager.conductMeeting();
    }
}
