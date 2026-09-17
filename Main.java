import edu.ccrm.domain.Course;
import edu.ccrm.domain.Student;

public class Main {
    public static void main(String[] args) {
        System.out.println("--- CCRM MVP Demonstration ---");

        // 1. Create a new Student object
        Student student1 = new Student("Alex Ray", "alex.r@example.com", "S001");

        // 2. Create a new Course object
        Course course1 = new Course("CS101", "Introduction to Java", 3);

        // 3. Print the details using the toString() methods
        System.out.println("\nCreated Student:");
        System.out.println(student1);

        System.out.println("\nCreated Course:");
        System.out.println(course1);
        
        System.out.println("\n--- End of Demonstration ---");
    }
}