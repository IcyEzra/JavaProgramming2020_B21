package day08_ShortHand_Relational;

public class RelationalOperators {
    public static void main(String[] args) {

        int num1 = 10;
        int num2 = 20;
        boolean r1 = num1 > num2; //num1 is greater than num2 = false
        boolean r2 = num2 > num1; //num2 is greater than num1 = true

        boolean r3 = num1 < num2; //num1 is less than num2
        System.out.println(num1 + " is greater than " + num2 +" : " + r1);
        System.out.println(num2 + " is greater than " + num1 +" : " + r2);
        System.out.println("=======================================================");

        //>= , <=
        System.out.println(10 < 9);//false
        System.out.println(10 <= 9);//10 is less than or equal to 9 ==> false
        System.out.println( 10 > 10 );//false
        System.out.println( 10 >= 10);//10 is greater than or equal 10 ==> true since second part of statement is true
        System.out.println("===============================================================================================");
        // == , !=
        boolean b1 = 10 == 10; //is true
        boolean b2 = 10 != 10; // is false
        System.out.println(b1);
        System.out.println(b2);
        boolean b3 = "Cybertek" == "Virgina"; //false
        System.out.println(b3);

        int x = 100;
        boolean isEven = x % 2 == 0; //100 is evenly divisible by 2
        boolean isOdd = x % 2 !=0; //opposite of even



    }
}
