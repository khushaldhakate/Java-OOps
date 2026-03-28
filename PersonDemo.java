import java.util.Scanner;

public class PersonDemo {
    private String name;
    private int age;

    public PersonDemo(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter details for first person:");
        System.out.print("Name: ");
        String name1 = scanner.nextLine();
        System.out.print("Age: ");
        int age1 = scanner.nextInt();
        
        scanner.nextLine();
        
        System.out.println("Enter details for second person:");
        System.out.print("Name: ");
        String name2 = scanner.nextLine();
        System.out.print("Age: ");
        int age2 = scanner.nextInt();
        
        PersonDemo person1 = new PersonDemo(name1, age1);
        PersonDemo person2 = new PersonDemo(name2, age2);
        
        System.out.println("\n--- Person Details ---");
        System.out.println("First Person:");
        person1.displayDetails();
        
        System.out.println("\nSecond Person:");
        person2.displayDetails();
        
        scanner.close();
    }
}
