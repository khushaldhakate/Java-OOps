import java.util.StringTokenizer;

public class WordCounter {
    public static void main(String[] args) {
        String sentence1 = "Java is a powerful programming language";
        System.out.println("Sentence: " + sentence1);
        
        StringTokenizer tokenizer1 = new StringTokenizer(sentence1);
        int wordCount1 = tokenizer1.countTokens();
        System.out.println("Total Words: " + wordCount1);
        
        String sentence2 = "The quick brown fox jumps over the lazy dog";
        System.out.println("\nSentence: " + sentence2);
        
        StringTokenizer tokenizer2 = new StringTokenizer(sentence2);
        int wordCount2 = tokenizer2.countTokens();
        System.out.println("Total Words: " + wordCount2);
        
        String sentence3 = "Hello world this is a test sentence";
        System.out.println("\nSentence: " + sentence3);
        
        StringTokenizer tokenizer3 = new StringTokenizer(sentence3);
        int wordCount3 = tokenizer3.countTokens();
        System.out.println("Total Words: " + wordCount3);
        
        String sentence4 = "Programming in Java is fun and educational";
        System.out.println("\nSentence: " + sentence4);
        
        StringTokenizer tokenizer4 = new StringTokenizer(sentence4);
        int wordCount4 = tokenizer4.countTokens();
        System.out.println("Total Words: " + wordCount4);
        
        String sentence5 = "Today we are learning string manipulation";
        System.out.println("\nSentence: " + sentence5);
        
        StringTokenizer tokenizer5 = new StringTokenizer(sentence5);
        int wordCount5 = tokenizer5.countTokens();
        System.out.println("Total Words: " + wordCount5);
        
        System.out.println("\n--- Word Count Summary ---");
        System.out.println("Sentence 1: " + wordCount1 + " words");
        System.out.println("Sentence 2: " + wordCount2 + " words");
        System.out.println("Sentence 3: " + wordCount3 + " words");
        System.out.println("Sentence 4: " + wordCount4 + " words");
        System.out.println("Sentence 5: " + wordCount5 + " words");
        
        int totalWords = wordCount1 + wordCount2 + wordCount3 + wordCount4 + wordCount5;
        System.out.println("Total Words Across All Sentences: " + totalWords);
    }
}
