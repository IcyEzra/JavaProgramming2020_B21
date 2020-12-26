package day_39_ConstructorIntro;
import day_36_CustomClass.Employee;

import java.time.LocalDate;

public class HumanResource {

    public static Employee employee1, employee2, employee3, employee4, employee5;

    static{
        employee1 = new Employee();
        employee2 = new Employee();
        employee3 = new Employee();
        employee4 = new Employee();
        employee5 = new Employee();

        employee1.setInfo("John",'M',"12345678",007,"SDET","Bank of America",100000, LocalDate.of(2018,5,20));
        employee2.setInfo("John2",'M',"12345678",007,"SDET","Bank of America",100000, LocalDate.of(2018,5,20));
        employee3.setInfo("John3",'M',"12345678",007,"SDET","Bank of America",100000, LocalDate.of(2018,5,20));
        employee4.setInfo("John4",'M',"12345678",007,"SDET","Bank of America",100000, LocalDate.of(2018,5,20));
        employee5.setInfo("John5",'M',"12345678",007,"SDET","Bank of America",100000, LocalDate.of(2018,5,20));

    }

}
