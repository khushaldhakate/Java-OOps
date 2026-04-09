public class EmailChecker {
    public static void main(String[] args) {
        String email1 = "john.doe@gmail.com";
        System.out.println("Email: " + email1);
        
        if (email1.contains("@gmail.com")) {
            System.out.println("Valid Gmail Address");
        } else {
            System.out.println("Invalid Email");
        }
        
        String email2 = "alice@yahoo.com";
        System.out.println("\nEmail: " + email2);
        
        if (email2.contains("@gmail.com")) {
            System.out.println("Valid Gmail Address");
        } else {
            System.out.println("Invalid Email");
        }
        
        String email3 = "bob.smith@gmail.com";
        System.out.println("\nEmail: " + email3);
        
        if (email3.contains("@gmail.com")) {
            System.out.println("Valid Gmail Address");
        } else {
            System.out.println("Invalid Email");
        }
        
        String email4 = "maria@hotmail.com";
        System.out.println("\nEmail: " + email4);
        
        if (email4.contains("@gmail.com")) {
            System.out.println("Valid Gmail Address");
        } else {
            System.out.println("Invalid Email");
        }
        
        String email5 = "david@gmail.com";
        System.out.println("\nEmail: " + email5);
        
        if (email5.contains("@gmail.com")) {
            System.out.println("Valid Gmail Address");
        } else {
            System.out.println("Invalid Email");
        }
    }
}
