package day_38_StaticKeyWord.iPhone;

public class iPhoneObjects {

    public static void main(String[] args) {

        // before setting info, the only thing that's same (before setting info) is the OS, brand, and madeIn
        iPhone phone1 = new iPhone();
        iPhone phone2 = new iPhone();
        iPhone phone3 = new iPhone();
        iPhone phone4 = new iPhone();

       // phone1.OS = "Android"; If this is done, then the OS for all phones will be Android, so be careful with static

        // Shows that OS is the same
        System.out.println(phone1.OS);
        System.out.println(phone2.OS);
        System.out.println(phone3.OS);
        System.out.println(phone4.OS);


        System.out.println("===============================");

        iPhone.getInfo();


    }


}
