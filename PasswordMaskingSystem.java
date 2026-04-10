public class PasswordMaskingSystem {
    public static void main(String[] args) {
        String password1 = "password123";
        System.out.println("Original Password: " + password1);
        
        String maskedPassword1 = maskPassword(password1);
        System.out.println("Masked Password: " + maskedPassword1);
        
        String password2 = "admin456";
        System.out.println("\nOriginal Password: " + password2);
        
        String maskedPassword2 = maskPassword(password2);
        System.out.println("Masked Password: " + maskedPassword2);
        
        String password3 = "user789";
        System.out.println("\nOriginal Password: " + password3);
        
        String maskedPassword3 = maskPassword(password3);
        System.out.println("Masked Password: " + maskedPassword3);
        
        String password4 = "securepass";
        System.out.println("\nOriginal Password: " + password4);
        
        String maskedPassword4 = maskPassword(password4);
        System.out.println("Masked Password: " + maskedPassword4);
        
        String password5 = "mysecret";
        System.out.println("\nOriginal Password: " + password5);
        
        String maskedPassword5 = maskPassword(password5);
        System.out.println("Masked Password: " + maskedPassword5);
    }
    
    public static String maskPassword(String password) {
        if (password.length() <= 2) {
            return password;
        }
        
        int visibleChars = 2;
        String visible = password.substring(password.length() - visibleChars);
        String masked = "*".repeat(password.length() - visibleChars);
        
        return masked + visible;
    }
}
