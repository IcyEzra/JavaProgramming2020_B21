package Replts.UAGStudent_Class;

public class main {

    public static void main(String[] args) {

        UAGStudent s = new UAGStudent("Uzair",12);
        UAGStudent x = new UAGStudent("Bill",12);
        UAGStudent y = new UAGStudent("Frank",12);

        String one = s.studentID;
        String two = x.studentID;
        String three = y.studentID;
        System.out.println("one = " + one);
        System.out.println("two = " + two);
        System.out.println("three = " + three);
    }

}
