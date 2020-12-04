package Personal;

import java.util.Arrays;

public class replt_129_CopyCertainValues {public static void main(String[] args) {
    System.out.println("-----EXAMPLE RUN ---------");
    String[] numbers = {"zero", "one", "two","three","four"};
    System.out.println(Arrays.toString(getWithE(numbers)));

}



    public static String[] getWithE(String[] arr) {

        //TODO : YOUR CODE GOES HERE ----------------------
        int eCount = 0;

        for(String each : arr){
            if(each.contains("e")){
                eCount++;

                }
            }
        String[] fewValues = new String[eCount];
        int index = 0;
            for(int i = 0; i < arr.length; i++){
                if(arr[i].contains("e")){
                    fewValues[index] = arr[i];
                    index++;
                }
            }





        //YOUR CODE ENDS HERE -----------------------

        return fewValues;
    }

}
