package day_45_Exceptions;

public class ExceptionsIntro {

    public static void main(String[] args) {

        int[] array = {1,2,3,4,5};

        // System.out.println(array[100]); // ArrayIndexOutOfBoundsException, unexpected event or unchecked ==> run time, compiler says its okay initially but when it runs, and exception comes up

        // Thread.sleep(2000); // unwanted event or checked exception ==> compile time, compiler immediately complains meaning code will not run off the bat

        // System.out.println( 10 / 0 ); // ArithmeticException because you can't divide by 0 unchecked exception because compiler does not complain

        // Exceptions: unexpected or unwanted events, unchecked or checked exception
            // unchecked exceptions (Unexpected): occurs during runtime ie array[100] example
                // RunTimeException class is the parent of all unchecked exception
                // all run time exceptions are unchecked exceptions
            // checked exceptions (Unwanted): occurs during compile time ie Thread.sleep example
                // all exceptions that are not run time are checked exceptions


    }

}
