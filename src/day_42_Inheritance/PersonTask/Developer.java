package day_42_Inheritance.PersonTask;

public class Developer extends Employee{

    public Developer(String name, int age, char gen,double hourlyRate,String ID, String jobTitle){
        setInfo(name, age, gen, hourlyRate, ID, jobTitle);
    }

    public void developing(String app){
        System.out.println(name+" is currently developing "+app);
    }

}
