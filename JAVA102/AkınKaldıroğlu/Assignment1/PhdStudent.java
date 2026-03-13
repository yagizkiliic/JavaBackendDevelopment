package Assignment1;

import java.util.Date;

public class PhdStudent extends GraduateStudent{

    boolean qualifyingExamTaken;

    public PhdStudent(int no, String name, int year, Date dob, String major, String advisor, String thesis, boolean qualifyingExamTaken) {
        super(no, name, year, dob, major, advisor, thesis);
        this.qualifyingExamTaken = qualifyingExamTaken;
    }

    @Override
    public void study() {
        System.out.println("Phd Student "+ name + " is studying.");
    }

    @Override
    public void register() {
        System.out.println("Phd Student "+ name + " registered to the system.");
    }

    @Override
    public void writeThesis() {
        System.out.println("Phd Student "+ name + " is writing "+thesis);
    }

    @Override
    public void meetWithAdvisor() {
        System.out.println("Phd Student "+ name + "'s advisor is "+advisor);
    }

    public void writePaper() {
        if (qualifyingExamTaken) {
            System.out.println("Writing an academic paper for a journal.");
        } else {
            System.out.println("Cannot write a paper yet, qualifying exam not taken.");
        }
    }
}
