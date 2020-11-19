package day11_MultiBranchIf;

public class LargestClass {
    public static void main(String[] args) {

        int n1 = 100;
        int n2 = 300;
        int n3 = 400;
        boolean n1IsMax = n1 > n2 && n1 > n3;
        boolean n2IsMax = n2 > n1 && n2 > n3;
        boolean n3IsMax = n3 > n1 && n3 > n2;

        if(n1IsMax){
            System.out.println("first number is the maximum number: "+n1);
        }else if(n2IsMax){
            System.out.println("second number is the maximum number: "+n2);
        }else if(n3IsMax){
            System.out.println("third is the maximum number: "+n3);
        }







    }





}

