package Replts;

public class replt_Assessment1_AppearsTwice {

    public static boolean appearsTwice(String target, String sentence) {
        //write your codes here:
        boolean valid = false;

        int count = 0;
        String[] split = sentence.split(" ");
        for(String each : split){
            if(each.equals(target)){
                count++;
            }
            if(count == 2){
                valid = true;
            }else{
                valid = false;
            }
        }

        return valid;

    }
}
