package day16_Scanner2;

import java.util.*;

public class EmployeeInfo {
    public static void main(String[] args) {
        /*
Ask the user to enter their first name. Then ask the user to enter their last name.
Then ask the user if they are currently employed.
If the user is employed, also ask them what their salary is.
Print all the information at the end:
”Full name is:” full name
“Employed:” status
“Salary:” salary
 */
        /*
        This was my attempt at this task and it wasn't entirely correct. Correct code on bottom
        Scanner input = new Scanner(System.in);

        System.out.println("Enter full name");
        String fullName = input.nextLine();
        System.out.println("Full name: " + fullName);


        System.out.println("Are you employed?");
        String employment = input.next();
        System.out.println("Employed?: " + employment);

        System.out.println("Enter your salary");
        int salary = input.nextInt();
        System.out.println("Salary is: " + salary);

      // print all in one line or use multiple print statement for readability
      // System.out.println("Name: " + fullName + " " + "Employed?: " + employment + " " + "Salary: " + salary);
          System.out.println("Name: " + fullName);
          System.out.println("Employed?: " + employment);
          System.out.println("Salary: " + salary);
          multiple print done for readability
            */
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your first name");
        String firstName = input.next();

        System.out.println("Enter your last name");
        String lastName = input.next();

        System.out.println("Are you employed? true or false");
        boolean isEmployed = input.nextBoolean();

        double salary = 0;
        if (isEmployed){
            System.out.println("What is your salary");
            salary = input.nextDouble();
        }

        input.close();

        System.out.println("Full name: " + firstName + lastName);
        System.out.println("Employed: " + isEmployed);
        System.out.println("Salary: " + salary);

    }
}
