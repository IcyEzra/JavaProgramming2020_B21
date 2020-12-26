package day_36_CustomClass;

import java.text.DecimalFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;

public class Employee {

    public String name;
    public char gender;
    public String SSN;
    public int ID;
    public String jobTitle;
    public String companyName;
    public double salary;
    public LocalDate hireDate;

    public void setInfo(String EmployeeName, char EmployeeGender, String EmpSSN, int EmpID, String EmpJobTitle, String EmpCompany, double EmpSalary, LocalDate hireDate){

        name = EmployeeName;
        gender = EmployeeGender;
        SSN = EmpSSN;
        ID = EmpID;
        jobTitle = EmpJobTitle;
        companyName = EmpCompany;
        salary = EmpSalary;
        this.hireDate = hireDate;

    }
    public void getInfo(){

        DateTimeFormatter df = DateTimeFormatter.ofPattern("MMMM-dd-yyyy");
        DecimalFormat decimal = new DecimalFormat("0.00");

        System.out.println("==========================================");
        System.out.println("Employee Name: "+name);
        System.out.println("Gender: "+gender);
        System.out.println("SSN: "+SSN);
        System.out.println("ID Number: "+ ID);
        System.out.println("Title: "+jobTitle);
        System.out.println("Company: "+companyName);
        System.out.println("Salary: $"+decimal.format(salary));
        System.out.println("Hire Date: "+hireDate.format(df));
        System.out.println("==========================================");

    }


    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", gender=" + gender +
                ", SSN='" + SSN + '\'' +
                ", ID=" + ID +
                ", jobTitle='" + jobTitle + '\'' +
                ", companyName='" + companyName + '\'' +
                ", salary=" + salary +
                ", hireDate=" + hireDate +
                '}';
    }

    public void attendMeeting(){
        System.out.println(name+" is attending the meeting");
    }

    public void working(){
        System.out.println(name+" is working");
    }

    public static void main(String[] args) {
        // Bank Of America task
        Employee emp1 = new Employee();
        emp1.setInfo("Ezra",'M',"091746915",123456,"SDET","Google",750000,LocalDate.of(2020,1,1));
        emp1.getInfo();

        Employee emp2 = new Employee();
        emp2.setInfo("Sayaka",'F',"294928731",123457,"SDET","Yahoo",50000,LocalDate.of(2020,1,1));

        Employee emp3 = new Employee();
        emp3.setInfo("Zero",'M',"72917693",123458,"SDET","Amazon",250000,LocalDate.of(2020,1,1));

        Employee emp4 = new Employee();
        emp4.setInfo("Bub",'M',"938553108",123459,"SDET","Bing",90000,LocalDate.of(2020,1,1));

        Employee emp5 = new Employee();
        emp5.setInfo("Charles",'M',"123456789",123410,"SDET","BBC",150000,LocalDate.of(2020,1,1));

        Employee[] arr = {emp1, emp2, emp3, emp4, emp5};
        ArrayList<Employee> passed = new ArrayList<>();
        for(Employee each : arr){
            if(each.salary > 100000){
                passed.add(each);
               // System.out.println(each.name); // prints out name of people who's salary is above 100k, commented out so statement below prints passed list
            }
        }
        for(Employee each : passed){
            System.out.println(each.name);
        }
    }

}
/*
Employee:
            Attributes:
                name, gender, SSN, ID, jobTitle, companyName, salary
            Actions:
                setInfo
                getInfo
                attendMeeting
                working
        BankOfAmerica
        create an arraylist of Emplooyees and store 5 employee objects
        remove all employees from the list who are making less than 100K
        NO seperate classes
 */