package day21_WhileLoop;

public class ContinueStatement {
    public static void main(String[] args) {

        for(int i = 1; i <= 5; i++){

            if(i==3){ // checks if the value of i equals 3 and if it does it skips and moves to the next part of the loop which is 4
                continue;
            }

            System.out.println(i+" "); //1 2 4 5
        }
        System.out.println();
        System.out.println("================================================");
        // print odd numbers between 1 to 50 with continue statement
        // print even numbers between 1 to 50 with continue statement
        // print numbers between 1 to 50 that are evenly divisible by 3
        //odd numbers
        for (int i = 1; i <=50; i++){
            if(i%2==0){
                continue;
            }
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println("==================================");
        //even numbers
        for(int i = 1; i <= 50; i++){
            if(i%2!=0)
            continue;
            System.out.print(i+ " ");
        }
        System.out.println();
        System.out.println("=======================================");
        //divisible by 3
        for(int i = 1; i <=50; i++){
            if(i%3!=0){
                continue;

            }System.out.print(i + " ");

        }

    }
}
