package day_29_Methods;

public class MethodsWithParameters {
    public static void main(String[] args) {

        int age = 35;

        eligibleToBuyAlcohol(age);

        eligibleToBuyAlcohol(38);

        calculateAge(1980, 2020);

        calculateAge(1994,2020);

    }

    public static void eligibleToBuyAlcohol(int age) {
        if (age >= 21) {
            System.out.println("Eligible");
        } else {
            System.out.println("Not Eligible");
        }
    }


    public static void calculateAge(int birthYear, int currentYear) {
      if(birthYear < currentYear) {
          System.out.println("Your Age is: " + (currentYear - birthYear));
        }else{
          System.out.println("Invalid Entry");
      }
    }
}
