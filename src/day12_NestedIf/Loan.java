package day12_NestedIf;

public class Loan {
    public static void main(String[] args) {
        double minimumSalary = 50000;
        int jobHistory = 8;
        int creditScore = 750;

        if (minimumSalary >= 30000){

            if (jobHistory >= 2){

                if (creditScore >= 680){
                System.out.println("You are qualified for a loan");
            }else {
                    System.out.println("Your credit score must be higher");}
            }
                else {
                System.out.println("You must be on the job for at least 2 years");
            }
        }else{
            System.out.println("You must have minimum salary of 30k first");
        }




    }
}
