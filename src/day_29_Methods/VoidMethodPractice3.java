package day_29_Methods;

public class VoidMethodPractice3 {

    public static void main(String[] args) {

        eligibleToVote("Canada",45,true);

        eligibleToVote("Pakistan",69,true);

        eligibleToVote("usa",25, true);

    }

    public static void eligibleToVote(String citizenship, int age, boolean isAlive) {
        if (citizenship.equalsIgnoreCase("USA")) {

            if(isAlive){
                if(age >= 18){
                    System.out.println("You are eligible to vote");
                }else{
                    System.err.println("You must be 18 or older to vote");
                }
            }else{
                System.err.println("You must come back to life in order to vote");
            }


        }else{
            System.err.println("You must be a citizen of the USA");
        }


    }
}