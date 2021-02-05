package day_42_Inheritance.PersonTask;

public class PersonObjects {
    public static void main(String[] args) {

        Tester tester = new Tester("Zack",25,'M',45.00,"Z123","SDET");
        tester.testApp("Facebook");
        tester.sleep();
        tester.smokeTest();

        Developer dev = new Developer("Erlich",40,'M',75.00,"X007","Front End Developer");
        dev.developing("Google");

    }
}
