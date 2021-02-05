package day_42_Inheritance.PersonTask;

public class Tester extends Employee{

    public Tester(String name, int age, char gen,double hourlyRate,String ID, String jobTitle){
        setInfo(name, age, gen, hourlyRate, ID, jobTitle);
    }

    public void testApp(String app){
        System.out.println(name+" is currently testing "+app);
    }

    public void smokeTest(){
        System.out.println(name+" is currently performing a smoke test");
    }

}
