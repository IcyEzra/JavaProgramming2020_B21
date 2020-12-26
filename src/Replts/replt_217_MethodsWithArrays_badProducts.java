package Replts;

public class replt_217_MethodsWithArrays_badProducts {

    public static void main(String[] args) {

        int[] products = {1,1,1,0,0,0,0};

       boolean x = badP(products,3);
        System.out.println(x);

    }


    public static boolean badP(int[] products,int limit){
        boolean valid = true;

        int count = 0;
        for(int each : products){
            if(each == 0){
                count++;
            }
        }

        if(count >= limit){
            valid = false;
        }else{
            valid = true;
        }

        return valid;
    }
}
