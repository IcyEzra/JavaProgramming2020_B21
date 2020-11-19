package day09_IfStatement;

public class EligibleToVote2 {
    public static void main(String[] args) {
        // and logical operator &&
        String name = "Daniel";
        boolean isUSACitizen = true;
        int age = 38;
        boolean hasCriminalBackground = false;

        boolean isEligible = isUSACitizen == true && age >= 18 && hasCriminalBackground == false; //true since all conditions are true
                         //    true  ==  true
        System.out.println(name +" is eligible to vote: "+isEligible); // true

        System.out.println("==================================================================");
        // Or logical operator ||
        String name2 = "John";
        String c1 = "Canada";
        String c2 = "USA";
        boolean eligible = c1 == "USA" || c2 == "USA";
               //            false         true
        System.out.println(name2 + " is eligible to vote: "+eligible ); //true since one condition is true
    }
}
