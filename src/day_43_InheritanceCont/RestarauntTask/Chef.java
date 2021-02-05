package day_43_InheritanceCont.RestarauntTask;

import day_42_Inheritance.PersonTask.Employee;

public class Chef extends Employee { // Chef IS an Employee, Chef IS a Person

    /*
    Inherited:
        variables: name, age, gender, hourlyRate, jobTitle, ID
        methods: work, setInfo, toString, eat, sleep
     */
    public Chef(String name, int age, char gender, double hourlyRate, String jobTitle, String ID){
        setInfo( name, age, gender, hourlyRate, jobTitle, ID );
    }

    public void makeOrder(){
        System.out.println(jobTitle+" "+name+" is making order");
    }

    public void cooking(){
        System.out.println(jobTitle+" "+name+" is cooking a dish");
    }

}
