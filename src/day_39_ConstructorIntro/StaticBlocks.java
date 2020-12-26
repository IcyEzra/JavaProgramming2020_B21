package day_39_ConstructorIntro;

import day_36_CustomClass.Employee;

import java.time.LocalDate;

public class StaticBlocks {

    public static String company;
    public static Employee employee1;
           //     employee1.setInfo(); have to initialize in static block
    public int a;
    public static int b;
    public static boolean isEmployed;

    // static block only accepts static, purpose is to initialize static variables
    static{
        employee1 = new Employee();
        employee1.setInfo("john",'M',"12345678",1234,"SDET","Bank",100000, LocalDate.of(1994,12,13));

        // a = 100; won't initialize because a is not static
        b = 200; // b will because it is static

        company = "Capital One";
        isEmployed = true;

    }

}
