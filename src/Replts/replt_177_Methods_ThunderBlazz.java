package Replts;

import java.util.Scanner;

public class replt_177_Methods_ThunderBlazz {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        getThunderBlazz(scan.nextBoolean(),scan.nextBoolean(),scan.nextInt(), scan.nextInt(), scan.nextInt());

    }






    public static boolean getThunderBlazz(boolean available,boolean gift, int ingredient1, int ingredient2, int ingredient3){
        boolean result = false;

        if(available == true || gift == true){
            result = true;
        }else if(ingredient1 == 1 && ingredient2 == 2 && ingredient3 == 3){
            result = true;
        }else if(ingredient1 == 3 && ingredient2 == 1 && ingredient3 == 2){
            result = true;
        }else{
            result = false;
        }

        System.out.println(result);
        return result;
    }
}
