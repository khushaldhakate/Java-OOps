public class UsernameValidator {
    public static void main(String[] args) {
        String username = "   JohnDoe123   ";
        
        System.out.println("Original Username: '" + username + "'");
        
        String trimmedUsername = username.trim();
        System.out.println("After Trim: '" + trimmedUsername + "'");
        
        String lowerUsername = trimmedUsername.toLowerCase();
        System.out.println("After Lowercase: '" + lowerUsername + "'");
        
        System.out.println("Cleaned Username: " + lowerUsername);
        
        String username2 = "   AliceSmith456   ";
        System.out.println("\nOriginal Username: '" + username2 + "'");
        
        String cleanedUsername2 = username2.trim().toLowerCase();
        System.out.println("Cleaned Username: " + cleanedUsername2);
        
        String username3 = "   BOBWILLIAMS789   ";
        System.out.println("\nOriginal Username: '" + username3 + "'");
        
        String cleanedUsername3 = username3.trim().toLowerCase();
        System.out.println("Cleaned Username: " + cleanedUsername3);
    }
}
