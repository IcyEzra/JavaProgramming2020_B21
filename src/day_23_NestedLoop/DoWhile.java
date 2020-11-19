package day_23_NestedLoop;

public class DoWhile {
    public static void main(String[] args) {

        boolean condition = false;

        while(condition){ // think first
            System.out.println("Hello Batch 21");
        }

        System.out.println("==================================");

        do{
            System.out.println("Hello Batch 21");
        }while(condition);  // do first, think later
              //if you do !condition then it will print infinitely

    }

}

//do while loop gets executed at least once even if condition is false