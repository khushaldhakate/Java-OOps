import java.io.FileNotFoundException;

public class FileProcessingSystem {
    public static void main(String[] args) {
        System.out.println("--- File Processing System ---");
        
        String[] fileNames = {"document.txt", "data.csv", "report.pdf", "image.jpg", "video.mp4"};
        
        for (String fileName : fileNames) {
            processFile(fileName);
        }
    }
    
    public static void processFile(String fileName) {
        System.out.println("\nProcessing file: " + fileName);
        
        try {
            System.out.println("Attempting to read file: " + fileName);
            
            if (fileName.endsWith(".txt")) {
                System.out.println("Text file detected. Processing content...");
                System.out.println("File content loaded successfully.");
            } else if (fileName.endsWith(".csv")) {
                System.out.println("CSV file detected. Parsing data...");
                System.out.println("Data parsed successfully.");
            } else if (fileName.endsWith(".pdf")) {
                System.out.println("PDF file detected. Extracting text...");
                System.out.println("Text extracted successfully.");
            } else if (fileName.endsWith(".jpg")) {
                System.out.println("Image file detected. Processing pixels...");
                System.out.println("Image processed successfully.");
            } else if (fileName.endsWith(".mp4")) {
                System.out.println("Video file detected. Decoding frames...");
                System.out.println("Video decoded successfully.");
            }
            
            if (fileName.equals("data.csv")) {
                throw new FileNotFoundException("File not found: " + fileName);
            }
            
            System.out.println("File processing completed: " + fileName);
            
        } catch (FileNotFoundException e) {
            System.out.println("Error: " + e.getMessage());
            System.out.println("File not available for processing.");
        } catch (Exception e) {
            System.out.println("Unexpected error: " + e.getMessage());
        } finally {
            System.out.println("Cleanup completed for: " + fileName);
            System.out.println("Resources released successfully.");
        }
    }
}
