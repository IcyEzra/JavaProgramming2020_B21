package day12_NestedIf;

public class EligibleToVote {
    public static void main(String[] args) {
        String citizen = "USA";
        int age = 29;

        if(citizen == "USA"){

            if (age >=18){
                System.out.println("You are eligible to vote");
            }else {
                System.out.println("You must be 18 years old to vote");
            }

        }else {
            System.out.println("You Must be US Citizen to vote");
        }




    }
}
//be careful of curly braces, results should be within body of pre-condition