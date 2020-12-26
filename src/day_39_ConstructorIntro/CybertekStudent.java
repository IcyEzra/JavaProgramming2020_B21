package day_39_ConstructorIntro;

public class CybertekStudent {

    public String name, gender;
    public int age;

    public static String schoolName, dreamJob;
    public static boolean hasReplIt, hasFlipGrid;

    // static block used to initialize static variables
    static{
        schoolName = "Cybertek School";
        dreamJob = "SDET";
        hasReplIt = true;
        hasFlipGrid = true;
    }

    // sett info used for non static variables
    public void setInfo(String name, String gender, int age){
        this.name = name;
        this.gender = gender;
        this.age = age;
    }

    // toString made so it can print variables
    public String toString() {
        return "CybertekStudent{" +
                "name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", age=" + age +
                ", School Name=" + schoolName +
                '}';
    }
}
