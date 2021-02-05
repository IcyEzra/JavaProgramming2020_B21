package Office_Hours.Practice_10_21_2020_Scanner;

import java.util.Scanner;

public class Scanner_Practice3 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your gender");
        String gender = scan.next();
        System.out.println("Gender: " + gender);

        System.out.println("Enter your age");
        int age = scan.nextInt();
        System.out.println("Age: " + age);

        scan.nextLine();
        System.out.println("What iis your full name");
        String fullName = scan.nextLine();
        System.out.println("Full name: " + fullName);

        System.out.println("What is your zipcode");
        int zipcode = scan.nextInt();
        System.out.println("Zipcode: " + zipcode);

        scan.nextLine();
        System.out.println("Enter country name");
        String country = scan.nextLine();
        System.out.println("Country: " + country);

        System.out.println("Enter your salary");
        double salary = scan.nextDouble();
        System.out.println("Salary: " + salary);

        scan.nextLine();
        System.out.println("Enter company name");
        String company = scan.nextLine();
        System.out.println("Company name: " + company);

        //scan.nextLine();  not needed if using nextLine() right after another nextLine() since previous nextLine takes the enter

        System.out.println("Enter your address");
        String address = scan.nextLine();
        System.out.println("Address: " + address);




    }
}

/*
ask gender ( next() )
ask age ( nextInt() )
ask full name ( nextLine() )
ask zip code ( nextInt() )
ask country name ( nextLine() )
ask salary ( nextDouble() )
ask company name ( nextLine() )
ask address ( nextLine() )
 */
