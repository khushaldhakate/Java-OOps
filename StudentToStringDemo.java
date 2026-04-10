class Student {
    private int id;
    private String name;

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student[ID=" + id + ", Name=" + name + "]";
    }
}

public class StudentToStringDemo {
    public static void main(String[] args) {
        Student student1 = new Student(101, "John Smith");
        Student student2 = new Student(102, "Alice Johnson");
        Student student3 = new Student(103, "Bob Williams");
        
        System.out.println("Student 1: " + student1);
        System.out.println("Student 2: " + student2);
        System.out.println("Student 3: " + student3);
        
        System.out.println("\n--- Student Details ---");
        System.out.println("First Student: " + student1.toString());
        System.out.println("Second Student: " + student2.toString());
        System.out.println("Third Student: " + student3.toString());
        
        Student[] students = {student1, student2, student3};
        System.out.println("\n--- All Students ---");
        for (Student student : students) {
            System.out.println(student);
        }
    }
}
