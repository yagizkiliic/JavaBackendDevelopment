package Assignment1;

import java.util.Date;

public class Student {

    int no;
     String name;
     int year;
     Date dob;
     String major;

    public Student(int no, String name, int year, Date dob, String major) {
        this.no = no;
        this.name = name;
        this.year = year;
        this.dob = dob;
        this.major = major;
    }

    public void study() {
        System.out.println("Student " + name + " is studying.");
    }

    public void register() {
        System.out.println("Student " + name + " has registered.");
    }

    @Override
    public String toString() {
        return "Student{" +
                "no=" + no +
                ", name='" + name + '\'' +
                ", year=" + year +
                ", dob=" + dob +
                ", major='" + major + '\'' +
                '}';
    }
}
