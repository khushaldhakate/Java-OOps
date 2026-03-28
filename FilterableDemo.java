import java.util.Scanner;

interface Filterable {
    void apply_filter();
    void reset_filter();
}

class ImageProcessor implements Filterable {
    private String imageName;
    private boolean isFiltered;

    public ImageProcessor(String imageName) {
        this.imageName = imageName;
        this.isFiltered = false;
    }

    @Override
    public void apply_filter() {
        isFiltered = true;
        System.out.println("Filter applied to image: " + imageName);
        System.out.println("Filter type: Brightness enhancement, Contrast adjustment");
    }

    @Override
    public void reset_filter() {
        isFiltered = false;
        System.out.println("Filter reset for image: " + imageName);
        System.out.println("Image restored to original state");
    }

    public void displayStatus() {
        System.out.println("Image: " + imageName);
        System.out.println("Filter Status: " + (isFiltered ? "Applied" : "Not Applied"));
    }
}

class DataAnalyzer implements Filterable {
    private String dataSet;
    private boolean isFiltered;

    public DataAnalyzer(String dataSet) {
        this.dataSet = dataSet;
        this.isFiltered = false;
    }

    @Override
    public void apply_filter() {
        isFiltered = true;
        System.out.println("Filter applied to dataset: " + dataSet);
        System.out.println("Filter type: Noise removal, Outlier detection");
    }

    @Override
    public void reset_filter() {
        isFiltered = false;
        System.out.println("Filter reset for dataset: " + dataSet);
        System.out.println("Dataset restored to original state");
    }

    public void displayStatus() {
        System.out.println("Dataset: " + dataSet);
        System.out.println("Filter Status: " + (isFiltered ? "Applied" : "Not Applied"));
    }
}

public class FilterableDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("--- Filterable Interface Demo ---");
        
        ImageProcessor imageProcessor = new ImageProcessor("vacation_photo.jpg");
        DataAnalyzer dataAnalyzer = new DataAnalyzer("sales_data_2024.csv");
        
        System.out.println("\n--- Initial Status ---");
        imageProcessor.displayStatus();
        dataAnalyzer.displayStatus();
        
        System.out.println("\n--- Applying Filters ---");
        imageProcessor.apply_filter();
        dataAnalyzer.apply_filter();
        
        System.out.println("\n--- After Filter Application ---");
        imageProcessor.displayStatus();
        dataAnalyzer.displayStatus();
        
        System.out.println("\n--- Resetting Filters ---");
        imageProcessor.reset_filter();
        dataAnalyzer.reset_filter();
        
        System.out.println("\n--- After Filter Reset ---");
        imageProcessor.displayStatus();
        dataAnalyzer.displayStatus();
        
        scanner.close();
    }
}
