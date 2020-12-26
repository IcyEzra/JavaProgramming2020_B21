package Replts;


import java.util.Scanner;

public class replt_176_Methods_SimpleRoomBooking {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        // simpleRoomBook(scan.nextBoolean(), scan.nextInt(), scan.nextInt(),scan.nextInt());
        simpleRoomBook(true,5,2,2018);
    }


    public static boolean simpleRoomBook(boolean isAvailable,int month, int day, int year)
    {

        boolean result = false;

        if(isAvailable == true && year == 2018){

            if(month == 7 && day <= 8){
                result = false;
            }else{
                result = true;
            }


        }else{
            result = false;
        }

        System.out.println(result);
        return result;
    }
}
