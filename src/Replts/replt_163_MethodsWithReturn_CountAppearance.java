package Replts;

public class replt_163_MethodsWithReturn_CountAppearance {




    public int  count_appearance(String[] arr,String t) {
        int count = 0;

        for(String each : arr){
            if(each.equals(t)){
                count++;
            }
        }


        return count;
    }

}
