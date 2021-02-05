package day_45_Exceptions;

import java.util.NoSuchElementException;

public class MultiCatchBlock {

    public static void main(String[] args) {

        try {
            System.out.println(25 / 0); // Arithmetic Exception
        }catch (NoSuchElementException e){
            System.out.println("No Such Element Exception");
        }catch (ClassCastException e){
            System.out.println("Class Cast Exception");
        }catch (ArithmeticException e){
            System.out.println("Arithmetic Exception");
        }catch (NullPointerException e){
            System.out.println("Null Pointer Exception");
        }catch (RuntimeException e){ // parent exception, should always be declared last, should be only used for unchecked exception
            System.out.println("Runtime Exception");
        }

        System.out.println("=============================================================");

        String[] names = {"Walid","Agalar","Ezra"};
        try {
            names[10] = "Muhtar"; // ArrayIndexOutOfBound
        }catch (IllegalArgumentException e){
            System.out.println("Illegal Argument exception");
        }catch (NoSuchElementException e){
            System.out.println("No Such Element exception");
        }catch (StringIndexOutOfBoundsException e){
            System.out.println("String index out of bound exception");
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println("ArrayIndex out of Bound");
        }catch (IndexOutOfBoundsException e){ // This class can handle it because it is the parent class of ArraysOutOfBoundException
            System.out.println("Index Out of bound Exception");
        } catch (RuntimeException e){
            System.out.println("Runtime Exception");
        }

        // multi catch block: parent exception type CAN NOT be placed before child exception type (refer to Exception Hierarchy photo on canvas)
            // for unchecked exceptions (can be used for checked exceptions too tho)
            // You will mostly use one catch block in selenium, most if not all exceptions in selenium are unchecked

    }

}
