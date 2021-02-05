package day_42_Inheritance.PersonTask;

import com.sun.xml.internal.bind.v2.model.core.ID;

public class Employee extends Person{

    public double hourlyRate;
    public String ID, jobTitle;

    public void setInfo(String name, int age, char gen,double hourlyRate,String ID, String jobTitle){
        setInfo(name,age,gender);
        this.hourlyRate = hourlyRate;
        this.jobTitle = jobTitle;
        this.ID = ID;

    }

    @Override
    public String toString() {
        return "Employee{" +
                ", name= '" + name + '\'' +
                ", age= " + age +
                ", jobTitle= '" + jobTitle + '\'' +
                "hourlyRate= $" + hourlyRate +
                ", ID= '" + ID + '\'' +
                ", gender= " + gender +
                '}';

    }

    public static String publicVariable = "Public Variable";
    protected static String protectedVariable = "Protected Variable";
    static String defaultVariable = "Default Variable";

    public double calcSalary(){
        return hourlyRate * 40 * 52;
    }
}
