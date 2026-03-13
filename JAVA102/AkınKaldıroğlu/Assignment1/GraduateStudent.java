package Assignment1;

import java.sql.SQLOutput;
import java.util.Date;

public class GraduateStudent extends Student {

    String advisor;
    String thesis;

    public GraduateStudent(int no, String name, int year, Date dob, String major, String advisor, String thesis) {
        super(no, name, year, dob, major);
        this.advisor = advisor;
        this.thesis = thesis;
    }

    @Override
    public void study() {
        System.out.println("Graduate Student "+ name + " is studying.");
    }

    @Override
    public void register() {
        System.out.println("Graduate Student "+ name + " registered to the system.");
    }

    public void writeThesis() {
        System.out.println("Writing thesis: " + thesis);
    }

    public void meetWithAdvisor() {
        System.out.println("Meeting with advisor: " + advisor);
    }

}
