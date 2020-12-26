package Replts;

public class replt_200_MethodsWithString_findErrorString {

    public static boolean isError(String line)
    {
        boolean valid = false;

        if(line.startsWith("error")){
            valid = true;
        }else{
            valid = false;
        }

        return valid;
    }
}
