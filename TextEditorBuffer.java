public class TextEditorBuffer {
    public static void main(String[] args) {
        StringBuffer buffer = new StringBuffer("Hello");
        
        System.out.println("Initial Buffer: " + buffer);
        
        buffer.append(" World");
        System.out.println("After Append: " + buffer);
        
        buffer.insert(5, " Beautiful");
        System.out.println("After Insert at position 5: " + buffer);
        
        buffer.reverse();
        System.out.println("After Reverse: " + buffer);
        
        StringBuffer buffer2 = new StringBuffer("Java Programming");
        System.out.println("\nInitial Buffer 2: " + buffer2);
        
        buffer2.append(" is Fun");
        System.out.println("After Append: " + buffer2);
        
        buffer2.insert(4, " Object-Oriented");
        System.out.println("After Insert at position 4: " + buffer2);
        
        buffer2.reverse();
        System.out.println("After Reverse: " + buffer2);
        
        StringBuffer buffer3 = new StringBuffer("Text Editor");
        System.out.println("\nInitial Buffer 3: " + buffer3);
        
        buffer3.append(" Demo");
        System.out.println("After Append: " + buffer3);
        
        buffer3.insert(9, " Advanced");
        System.out.println("After Insert at position 9: " + buffer3);
        
        buffer3.reverse();
        System.out.println("After Reverse: " + buffer3);
    }
}
