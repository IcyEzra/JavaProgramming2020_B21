package day18_Strings;

import java.util.Scanner;

public class StringPractice3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter an Apple product name");
        String product = scan.nextLine(); // user could enter something like mAc bOok
        product = product.replace(" ", "").toLowerCase(); // this line of code will get rid of spaces and lowercase the word ie -> macbook

        switch(product){
            case "macbook":
                System.out.println("Which model Macbook would you like?");
                String model = scan.nextLine();
                    if(model.equalsIgnoreCase("air")){
                        System.out.println("Macbook Air is $2400");
                    }else if(model.equalsIgnoreCase("pro")){
                        System.out.println("Macbook Pro is $2500");
                    }else {
                        System.err.println("Invalid version of MacBook entered");
                    }
                break;

            case "iphone":
                System.out.println("Which iPhone model would you like");
                String model2 = scan.nextLine().toLowerCase();
                    if(model2.equals("12")){
                        System.out.println("iPhone 12 is $1000");
                    }else if(model2.equals("11")){
                        System.out.println("iPhone 11 is $900");
                    }else if(model2.equals("10")){
                        System.out.println("iPhone 10 is $800");
                    }else if(model2.equals("8")){
                        System.out.println("iPhone 8 is $700");
                    }else{
                        System.err.println("Invalid version of iPhone given");
                    }
                break;

            case "ipad":
                System.out.println("Which model of iPad?");
                String model3 = scan.nextLine();
                switch (model3){
                    case "air":
                        System.out.println("iPad Air is $500");
                        break;
                    case "pro":
                        System.out.println("iPad Pro is $400");
                        break;
                    case "mini":
                        System.out.println("iPad Mini is $300");
                    default:
                        System.err.println("Invalid model of iPad given");



                }

                break;
        }

    }
}
/*
      Macbook:
        air: 2400
        pro: 2500

      Iphone:
        12: 1000
        11: 900
        10: 800
        8: 700

      Ipad:
        air: 500
        mini: 400
        pro: 300



 */