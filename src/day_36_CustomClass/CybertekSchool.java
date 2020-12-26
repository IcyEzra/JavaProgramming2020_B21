package day_36_CustomClass;

import java.time.LocalDate;
import java.util.ArrayList;

public class CybertekSchool {

    public String name, batch;
    public LocalDate DOfB;
    public double gpa;
    public char gender;
    public int age;

    public void setInfo(String name, int age, char gender,String batch,double gpa,LocalDate DOfB){
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.batch = batch;
        this.gpa = gpa;
        this.DOfB = DOfB;
    }


    public String toString() {
        return "CybertekSchool{" +
                "name='" + name + '\'' +
                ", batch='" + batch + '\'' +
                ", DOfB=" + DOfB +
                ", gpa=" + gpa +
                ", gender=" + gender +
                ", age=" + age +
                '}';
    }

    public void ThreeOrHigher(){

        if(gpa >= 3){
            System.out.println(name);
        }

    }

    public  void between2And3(){}

    public static void main(String[] args) {
        CybertekSchool student1 = new CybertekSchool();
        student1.setInfo("Ezra",25,'M',"B21",3.5,LocalDate.of(1994,12,13));
        student1.ThreeOrHigher();
    }

}
