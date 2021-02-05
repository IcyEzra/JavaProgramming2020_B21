package day_45_Exceptions;

public class ExceptionsHandling {

    public static void main(String[] args) {

        // StringIndexOutOfBound
        // using Try Catch block to handle unchecked exception
        /*
        Syntax for try and catch

            try{
               Code/Statement
            }catch (ExceptionType e(exceptions variable){ must contain correct exception
              handling statements
              ex) print statement stating exception
             }
             Try block will attempt to fix exception, if it can't, catch block handles it
         */

        String str = "Cybertek";

        try {
            System.out.println(str.substring(200, 300)); // StringIndexOutOfBoundsException
        }catch (StringIndexOutOfBoundsException e){
            System.out.println(e.getMessage()); // prints message for why its out of bound
          //  e.printStackTrace(); // includes more detailed reason for exception
        }

        // Thread.sleep, checked exception, easier to handle than unchecked
        try {
            Thread.sleep(5000);
            System.out.println("Try Block"); // try block is executed because it can handle the exception
        }catch(InterruptedException e){
            System.out.println("Catch Block");
        }

        // so lets say you don't know the type of exception that occurs (unchecked)
        // usually with a checked exception, you can tell right away what is the problem
        // but with unchecked, you don't (unless you run the code and let the compiler tell you)
        // but there is a way around this
        // use the parent class for exceptions (RuntimeException) to cover all exceptions
        // divide by 0 example

        try{
            System.out.println( 10 / 0 );
        }catch(RuntimeException e){ // if you don't know the exception then use RuntimeException, actual exception was ArithmeticException
            System.out.println("Unchecked exception has occurred "+e.getMessage());
            e.printStackTrace();
        }


        System.out.println("Test Completed");

    }

}
