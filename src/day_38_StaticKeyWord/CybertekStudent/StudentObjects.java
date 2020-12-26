package day_38_StaticKeyWord.CybertekStudent;

public class StudentObjects {

    public static void main(String[] args) {

        CybertekStudent student1 = new CybertekStudent();
        student1.setInfo("Uzair",25,32,'M');

        CybertekStudent student2 = new CybertekStudent();
        student2.setInfo("Ezra",25,32,'M');
      //  System.out.println( student1.schoolName );
      //  System.out.println( student2.schoolName );

        System.out.println( CybertekStudent.schoolName ); // preferred way to call static method
        CybertekStudent student3 = new CybertekStudent();
        student3.setInfo("Zero",25,0,'M');

        System.out.println(student1);
        System.out.println(student2); // prior to setting info to student2, when printed to console, all attributes will be null except for isOnline and schoolName because they are static
        System.out.println(student3); // all of the student info is set, but schoolName and isOnline is the same

        /*student1.getSchoolInfo();
          student2.getSchoolInfo();  these are not the preferred way to call the static method
          student3.getSchoolInfo();
        */

        CybertekStudent.getSchoolInfo(); // this is the preferred way



    }
}
