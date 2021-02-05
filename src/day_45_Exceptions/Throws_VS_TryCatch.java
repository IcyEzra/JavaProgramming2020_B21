package day_45_Exceptions;

public class Throws_VS_TryCatch {

    public static void main(String[] args) {

        method1(); // works thanks to try catch blocks
        System.out.println("Try and Catch");

        // method2(); compiler complains at this line because a try catch block is needed
        // throws keyword is a temporary solution, try catch is a permanent solution

        sleep(5);

        System.out.println("Test Completed");
    }


    public static void method1(){

        try{
            Thread.sleep(3000);
        }catch(InterruptedException e){

        }

    }

    public static void method2()throws InterruptedException{

        Thread.sleep(3000);

    }

    public static void sleep(long seconds){
        try {
            Thread.sleep(seconds * 1000);
        }catch(InterruptedException e){
            e.printStackTrace();
        }
        }



}



