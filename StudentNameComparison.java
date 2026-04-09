public class StudentNameComparison {
    public static void main(String[] args) {
        String name1 = "John Smith";
        String name2 = "John Smith";
        
        System.out.println("Comparing: '" + name1 + "' and '" + name2 + "'");
        
        if (name1.equals(name2)) {
            System.out.println("Names are equal (case-sensitive)");
        } else {
            System.out.println("Names are not equal (case-sensitive)");
        }
        
        if (name1.equalsIgnoreCase(name2)) {
            System.out.println("Names are equal (case-insensitive)");
        } else {
            System.out.println("Names are not equal (case-insensitive)");
        }
        
        String name3 = "Alice Johnson";
        String name4 = "alice johnson";
        
        System.out.println("\nComparing: '" + name3 + "' and '" + name4 + "'");
        
        if (name3.equals(name4)) {
            System.out.println("Names are equal (case-sensitive)");
        } else {
            System.out.println("Names are not equal (case-sensitive)");
        }
        
        if (name3.equalsIgnoreCase(name4)) {
            System.out.println("Names are equal (case-insensitive)");
        } else {
            System.out.println("Names are not equal (case-insensitive)");
        }
        
        String name5 = "Bob Williams";
        String name6 = "Bob williams";
        
        System.out.println("\nComparing: '" + name5 + "' and '" + name6 + "'");
        
        if (name5.equals(name6)) {
            System.out.println("Names are equal (case-sensitive)");
        } else {
            System.out.println("Names are not equal (case-sensitive)");
        }
        
        if (name5.equalsIgnoreCase(name6)) {
            System.out.println("Names are equal (case-insensitive)");
        } else {
            System.out.println("Names are not equal (case-insensitive)");
        }
    }
}
