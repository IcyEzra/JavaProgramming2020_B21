package day11_MultiBranchIf;

public class GradeReport {
    public static void main(String[] args) {

        int score = 90;

        if(score < 60){
            System.out.println("Failed");
        }else if(score >= 60 && score < 90){
            System.out.println("Passed");
        }else {
            System.out.println("Passed with distinction");
        }
        //another way to do this task
        String result = "";

        if(score <60){
            result = "failed";
        }else if (score >= 60 && score < 90){
            result = "passed";
        }else { // score is 90
            result = "Passed with distinction";
        }
        System.out.println(result);










    }



}
