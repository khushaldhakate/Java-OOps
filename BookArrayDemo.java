class Book {
    private String title;
    private String author;
    private double price;

    public Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public void displayDetails() {
        System.out.println("Title: " + title + ", Author: " + author + ", Price: Rs. " + price);
    }

    public String getTitle() {
        return title;
    }

    public double getPrice() {
        return price;
    }
}

public class BookArrayDemo {
    public static void main(String[] args) {
        System.out.println("--- Book Array Demonstration ---");
        
        Book[] books = new Book[5];
        
        books[0] = new Book("Java Programming", "John Doe", 450.50);
        books[1] = new Book("Data Structures", "Jane Smith", 380.75);
        books[2] = new Book("Web Development", "Mike Johnson", 420.00);
        books[3] = new Book("Database Systems", "Sarah Wilson", 390.25);
        books[4] = new Book("Software Engineering", "David Brown", 475.80);
        
        System.out.println("\n--- All Book Details ---");
        for (int i = 0; i < books.length; i++) {
            System.out.print("Book " + (i + 1) + ": ");
            books[i].displayDetails();
        }
        
        System.out.println("\n--- Book Summary ---");
        double totalPrice = 0;
        for (Book book : books) {
            totalPrice += book.getPrice();
        }
        
        System.out.println("Total Books: " + books.length);
        System.out.println("Total Price: Rs. " + totalPrice);
        System.out.println("Average Price: Rs. " + (totalPrice / books.length));
        
        System.out.println("\n--- Expensive Books (Price > 400) ---");
        for (Book book : books) {
            if (book.getPrice() > 400) {
                book.displayDetails();
            }
        }
    }
}
