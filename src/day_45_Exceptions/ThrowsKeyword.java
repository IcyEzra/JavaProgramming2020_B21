package day_45_Exceptions;

public class ThrowsKeyword {

    public static void main(String[] args) throws Exception{

        // throws only for checked exceptions ONLY, goes above in method signature, can contain more than one exception
        // or just put Exception to cover ALL exceptions since Exceptions is parent to all exceptions

        /* One way of handling exception
        try{
            Thread.sleep(3000);
        }catch(RuntimeException e){

        }
         */

        Thread.sleep(3000);

        System.out.println("Step 2");

    }

}
