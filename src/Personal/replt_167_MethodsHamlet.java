package Personal;
import java.util.*;
public class replt_167_MethodsHamlet {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        boolean result = hamletQuote(scan.nextBoolean(),scan.nextBoolean());
        System.out.println(result);
    }

    public static boolean hamletQuote(boolean toBe,boolean notToBe)
    {
        boolean result = true;

        if(toBe == true && notToBe == false){
            return true;
        }else if(toBe == false && notToBe == true){
            return true;
        }else if(toBe == true && notToBe == true){
            return true;
        }else{
            return false;
        }


    }
}
