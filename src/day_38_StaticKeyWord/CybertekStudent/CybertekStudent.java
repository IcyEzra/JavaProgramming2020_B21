package day_38_StaticKeyWord.CybertekStudent;

public class CybertekStudent {

    public String name;
    public int age, groupNumber;
    public char gender;

    public static String schoolName = "Cybertek School";
    public static boolean isOnlineStudent = true;

    public void setInfo(String name, int age, int groupNumber, char gender) {
        this.name = name;
        this.age = age;
        this.groupNumber = groupNumber;
        this.gender = gender;
    }

    // instance method
    public void study(){
        System.out.println(name + " is studying Java");
    }

    // static method
    public static void getSchoolInfo(){
        System.out.println("School is: "+schoolName);
    }

    @Override
    public String toString() {
        return "CybertekStudent{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", groupNumber=" + groupNumber +
                ", gender=" + gender +
                ", isOnline: " + isOnlineStudent +
                ", School Name: "+schoolName+
                '}';
    }
}
