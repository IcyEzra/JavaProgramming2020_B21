package day_37_CustomClass;

import java.time.LocalDate;

public class Student {
    public String name, ID;
    public LocalDate DOfB;
    public int age;
    public char gender;
    public double gpa;

    public void setInfo(String name, char gender, LocalDate DOfB, String ID, double gpa){

        this.name = name;
        this.gender = gender;
        this.DOfB = DOfB;
        age = LocalDate.now().getYear() - DOfB.getYear();
        this.ID = ID;
        this.gpa = gpa;

    }
    // alt + ins on keyboard for to string shortcut
    public String toString(){
        return "Name: "+name+", Gender: "+gender+", ID: "+ID+", D.O.B: "+DOfB+", GPA: "+gpa;
    }
/* Commented out because we will use to string
    public void getInfo() {
        System.out.println("Student name : " + name + "\nStudent ID : " + ID + "\nGPA : " + gpa + "\nAge : " + age + "\nGender : " + gender);
    }
 */
}
/*
warmup task:
1. Student:
        Attributes:
            name, age, gender, ID
        Actions:
            setInfo
            getInfo
            study
 */