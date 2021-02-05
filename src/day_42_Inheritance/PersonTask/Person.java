package day_42_Inheritance.PersonTask;

public class Person {

    public String name;
    public int age;
    public char gender;

    public void setInfo(String name, int age, char gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public void sleep(){
        System.out.println(name+" is sleeping");
    }

    public void eat(){
        System.out.println(name+" is eating");
    }

    public void work(){
        System.out.println(name+" is working");
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                '}';
    }
}
/*
    Person
        name, age, gender
        setInfo(), eat(), sleep()
    Employee
        name, age, gender, hourlyRate, jobTitle, ID
        setInfo, eat(), sleep(), work()
    Tester
        name, age, gender, hourlyRate, jobTitle, ID
        Constructor
        setInfo, eat(), sleep(), work(), testing()
    Developer
        name, age, gender, hourlyRate, jobTitle, ID
        Constructor
        setInfo, eat(), sleep(), work(), code()
 */