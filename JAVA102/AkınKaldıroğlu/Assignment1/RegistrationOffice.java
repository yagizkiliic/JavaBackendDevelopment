package Assignment1;

import java.util.Date;
import java.util.Random;

public class RegistrationOffice {

    public RegistrationOffice() {
    }

    public Student getAStudent() {
        Random random = new Random();
        int select = random.nextInt(5);
        Date dummyDate = new Date();
        return switch (select) {
            case 0 -> new GraduateStudent(101, "Alice", 2024, dummyDate, "CS", "Dr. Brown", "AI Research");
            case 1 -> new UndergraduateStudent(102, "Bob", 2025, dummyDate, "EE", "Math");
            case 2 -> new VocationalStudent(103, "Charlie", 2026, dummyDate, "Design");
            case 3 -> new MasterStudent(104, "Diana", 2023, dummyDate, "Data Science", "Dr. Smith", "Big Data");
            case 4 -> new PhdStudent(105, "Eve", 2022, dummyDate, "Cybersecurity", "Dr. Taylor", "Encryption", true);
            default -> new Student(100, "Unknown", 2026, dummyDate, "General");
        };
    }

    public void registerStudent(Student student) {
        if (student != null) {
            System.out.println("Processing registration for: " + student.name);
            student.register();
        } else {
            System.out.println("No student found to register.");
        }
    }

}
