package day_45_Exceptions;

public class FinallyBlock {

    public static void main(String[] args) {

        // Finally block: regardless of outcome or exception, finally block will always be executed, optional
            // even if try or catch block is executed, finally block is still executed
            // only time finally block is not executed, is when system is terminated before finally block
            // nothing can come after finally block

        try{
            System.out.println("Hello World");
        }catch(RuntimeException e){
            System.out.println("Catch Block");
            // System.exit(0); exits system at this line, meaning finally block will not be executed
        }finally{
            System.out.println("Closed");
        }

        System.out.println("Test completed");
    }

}
