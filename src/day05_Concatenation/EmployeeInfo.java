package day05_Concatenation;

public class EmployeeInfo {
    public static void main(String [] args) {

        /*
        declare the following variables:
            firstName, lastName, gender, age, companyName, jobTitle, isFullTime, isMarried, salary
    write a program that can display the full info of the employee
            ex:
                     firstName = John
                     lastName = Daniel
                     gender = M
                     age = 35
                     companyName = CapitalOne
                     jobTitle = SDET
                     isFullTime = true
                     isMarried = false
                     salary = 120000.50
     output:
                Employee' full name is: John Daniel
                John Daniel' gender is: M
                John Daniel' age is: 35 years old
                John Daniel works at: CapitalOne
                John Daniel' Job title is: SDET
                John Daniel' salary is 120000.5 $
                John Daniel is full time employee: true
                John Daniel is married: false
 */
        char gender = 'M'; //' ' for single character
        int age = 35;
        String JobTitle = "SDET";
        double Salary = 120000.5;
        String CompanyName = "Capital One";
        String firstname = "John"; //" " for text
        String lastname = "Daniel";
        String fullname = firstname +" "+ lastname;
        boolean isFullTime = true;
        boolean isMarried = false;

        System.out.print("Employee Full name is: ");
        System.out.println(fullname);

        System.out.print(fullname);
        System.out.print(" gender is: ");
        System.out.println(gender);

        System.out.print(fullname);
        System.out.print(" age is: ");
        System.out.print(age);
        System.out.println(" years old");

        System.out.print(fullname);
        System.out.print(" works at: ");
        System.out.println(CompanyName);

        System.out.print(fullname);
        System.out.print("s Job Title is: ");
        System.out.println(JobTitle);

        System.out.print(fullname);
        System.out.print( "salary is ");
        System.out.print("$ ");
        System.out.println(Salary);

        System.out.print(fullname);
        System.out.print(" is full time: ");
        System.out.println(isFullTime);

        System.out.print(fullname);
        System.out.print(" is married: ");
        System.out.print(isMarried);










    }






}
