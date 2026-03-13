package Assignment1;

public class Test {
    public static void main(String[] args) {
        RegistrationOffice office = new RegistrationOffice();

        Student randomStudent = office.getAStudent();

        office.registerStudent(randomStudent);

        if (randomStudent instanceof PhdStudent phd) {
            phd.writePaper();
        }
    }
}
