package day08_ShortHand_Relational;

public class ShortHandOperators {
    public static void main(String[] args) {

    int x = 100;
        x+=62;
        System.out.println(x);

        double salary = 10000;
               salary -= salary * .28;
        System.out.println(salary);

        int x2 = 999999;
            x2 -= 25;
        System.out.println(x2);

        double balance = 2000;
               balance -= 450;
        System.out.println(balance);
                balance -= 1000;
        System.out.println(balance);

        int y2 = 400;
        y2 += 10000 * 0.1;
        // y2 += 1000
        // y2 = 1400
        System.out.println(y2);

        String name = "Cybertek";
               name += " School ";
               //name = name + " School "
        System.out.println(name);

        int bonus = 5000;
            bonus *= 2+1; //bonus = 5000 * 3 = 1500
        System.out.println(bonus);

        int y3 = 10;
            y3 /= 5; // y3 = 10/5 = 2
        System.out.println(y3);

        int house = 500000;
        int month = 240;
        double monthlypayment = house;
                monthlypayment /= month;
        System.out.println(monthlypayment);


    }






}
