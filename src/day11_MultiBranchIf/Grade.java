package day11_MultiBranchIf;


public class Grade {
    public static void main(String[] args) {
        double score = 70.5;

        String grade = "";

        if(score >= 90){//becomes false when score less than 90
            grade = "A";
        }else if(score >= 80){//becomes false when score less than 80
            grade = "B";
        }else if(score >= 70){//becomes false when score is less than 70
            grade = "C";
        }else if (score >= 60){//becomes false when score is less than 60
            grade = "D";
        }else {//becomes true once rest of conditions are false
            grade = "F";
        }
        System.out.println("The student got an: " + grade);

        System.out.println("=================================================");

        char grade2 = 'A';

        if (score >= 90){
            grade2 = 'A';
        }else if (score >= 80){
            grade2 = 'B';
        }else if (score >= 70){
            grade2 = 'C';
        }else if (score >= 60){
            grade2 = 'D';
        }else {
            grade2 = 'F';
        }
        System.out.println("Your Grade is: " + grade2);


    }


}
