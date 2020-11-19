package day05_Concatenation;

public class ConcatenationPractice {
    public static void main(String[] args) {

        int houseNumber = 7925;
        String streetname = "Johns Branch Dr";
        String cityname = "McLean";
        String state = "VA";
        int zipCode = 22000;

        String fullAddress = houseNumber +" " +streetname +"\n" +cityname +" " +state +", "+zipCode;
        System.out.println(fullAddress);

        System.out.println("==========================================================================");
        //2010 Toyota Camry, 55000 miles, Red, $18000

        String brand = "Toyota";
        String model = "Camry";
        int year = 2010;
        int mileage = 55000;
        double price = 18000;
        String color = "Red";

        String carInfo = year +" "+ brand +" "+ model +", " + mileage + " miles" +", "+ color+", " + "$" + price;
        System.out.println(carInfo);

        System.out.println("=============================================================================");


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

        System.out.println("Employee full name is: " + fullname);
        System.out.println("Employee Gender: "+ gender);
        System.out.println("Age: "+ age);
        System.out.println("Employee Job title: "+ JobTitle);
        System.out.println("Company Name: "+ CompanyName);
        System.out.println("Employee Salary: " + Salary);
        System.out.println("Married? - "+ isMarried);
        System.out.println("They are full time? "+ isFullTime);

        System.out.println("============================================================");
        /*variables practice - variables firtname, lastname, fullname, age, gender, phoneNumber, ssn
        output should be: full name is: YourFullName
                          age is: Yourage years old
                          gender is: your gender
                          Phone number is: YourPhoneNumber
                          SSN is: your ssn
                          please use concatenation, do not use more than 5 print statements
         */
          String fname = "Uzair";
          String lname = "Baig";
          String flname = fname + " "+ lname;
          int Age = 25;
          char gen = 'M';
          long phoneNumber = 3478276361L;
          int ssn = 123457890;

        System.out.println("Employee name is:"+" "+ flname);
        System.out.println("Age:"+Age);
        System.out.println("Gender:"+gen);
        System.out.println("Phone Number: "+phoneNumber);
        System.out.println("SSN: "+ssn);






    }




}
