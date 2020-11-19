package day09_IfStatement;

public class IfStatementPractice {
    public static void main(String[] args) {
        //is David eligible to vote
        String name = "David";
        int age = 20;
        boolean isUSCitizen = false;

        boolean eligible = isUSCitizen && age >= 18;
        //                   false && true = false

        if(eligible){
            System.out.println(name + " is eligible to vote");
        }
        if(!eligible){
            System.out.println(name + " is not eligible to vote");
        }


    }

}
