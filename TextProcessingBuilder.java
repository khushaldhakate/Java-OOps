public class TextProcessingBuilder {
    public static void main(String[] args) {
        StringBuilder builder = new StringBuilder("Java");
        
        System.out.println("Initial Builder: " + builder);
        
        builder.append(" Programming");
        System.out.println("After Append: " + builder);
        
        builder.insert(4, " Object-Oriented");
        System.out.println("After Insert: " + builder);
        
        builder.delete(4, 21);
        System.out.println("After Delete: " + builder);
        
        builder.replace(0, 4, "Advanced");
        System.out.println("After Replace: " + builder);
        
        StringBuilder builder2 = new StringBuilder("Hello");
        System.out.println("\nInitial Builder 2: " + builder2);
        
        builder2.append(" World");
        System.out.println("After Append: " + builder2);
        
        builder2.insert(5, " Beautiful");
        System.out.println("After Insert: " + builder2);
        
        builder2.reverse();
        System.out.println("After Reverse: " + builder2);
        
        System.out.println("\nStringBuilder is faster than StringBuffer because it's not synchronized");
    }
}
