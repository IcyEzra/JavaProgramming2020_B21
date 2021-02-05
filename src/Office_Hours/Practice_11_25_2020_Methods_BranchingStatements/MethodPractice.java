package Office_Hours.Practice_11_25_2020_Methods_BranchingStatements;

public class MethodPractice {

    public static void main(String[] args) {

        divisibleBy3Between1To100();
        System.out.println("Hello");
        divisibleBy3Between1To100();
        System.out.println("How are you");

        divisibleBy3Between1To100(50,50); // will be skipped
        System.out.println("Test");

        grade(-50); //Prints invalid score then continues compiling
        grade(90);

        eligibleToVote(17,false);
        eligibleToVote(25,true);

    }


    // create a method that will print all numbers divisible by 3 from 1 to 100
    public static void divisibleBy3Between1To100(){

        for(int i = 1; i <= 100; i++){
            if(i%3!=0){ // if the number is not divisible by 3
                continue; // then skip (skips the current iterations (only in loop))
            }
            System.out.print(i+" ");
        }
        System.out.println(); // print statement needed for appending new line
    }

    public static void divisibleBy3Between1To100(int start, int end){
        if(end <= start){
            System.out.println("Invalid Numbers");
            return; // if condition is met, rest of the code below will not be executed, exits method
            // System.exit(0) different from return, code continues to run if return is used. whereas System.exit terminates entire code (code will run up until it reaches System.exit)
            // return block used instead of else block, either can be used, return is preferred tho
        }

        for(int i = 1; i <= 100; i++){
            if(i%3!=0){ // if the number is not divisible by 3
                continue; // then skip
            }
            System.out.print(i+" ");
        }
        System.out.println(); // print statement needed for appending new line
    }

    /*
    Student grade task
    A: Excellent
    B: Great
    C: Good
    D: Passed
    F: Failed
     */
    public static void grade(int score){

        if(score < 0 || score > 100){
            System.out.println("Invalid Score");
            return; // EXITS the CURRENT method
        }

        char grade = (score >= 90) ? 'A' : (score >= 80) ? 'B' : (score >= 70) ? 'C' : (score >= 60) ? 'D' : 'F';

        // break statement not necessary but if left out, next case will be run after the previous one
        switch(grade){
            case 'A':
                System.out.println("Excellent");
                break;
            case 'B':
                System.out.println("Great");
                break;
            case 'C':
                System.out.println("Good");
                break;
            case 'D':
                System.out.println("Passed");
                break;
            default:
                System.out.println("Failed");
                break;
        }
    }

    public static void eligibleToVote(int age, boolean isUSCitizen){

        if(age < 18){ // if age is not qualified
            System.out.println("Must be at least 18 years old");
            return; //exits the current method
        }

        if(isUSCitizen == false){ // if the person is not a US citizen
            System.out.println("You must be a US citizen to vote");
            return; // exits the current method
        }

        System.out.println("You are eligible to vote"); // prints if parameters passes

    }


}
