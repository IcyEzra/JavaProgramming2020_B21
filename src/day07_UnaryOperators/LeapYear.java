package day07_UnaryOperators;

public class LeapYear {
    public static void main(String[] args) {

int year = 2020;
boolean isLeapYear = year % 4 < 1; //checks if 2020 is evenly divisible by 4
        // 0 < 1 ===>true
        System.out.println(year + " is leap year: " + isLeapYear);

        System.out.println("==================================================");

        int num = 30;
        boolean divisible1 = num % 2 < 1;
        boolean divisible2 = num % 3 < 1;
        boolean divisible3 = num % 5 < 1;

        System.out.println(num + " is divisible by" + " by 2: " + divisible1);
        System.out.println(num + " is divisible by" + " by 3: " + divisible2);
        System.out.println(num + " is divisible by" + " by 5: " + divisible3);

        int num2 = 80;
        boolean divisible4 = num2 % 2 < 1;
        boolean divisible5 = num2 % 3 < 1;
        boolean divisible6 = num2 % 5 < 1;

        System.out.println(num2 + " is divisible by" + " by 2: " + divisible4);
        System.out.println(num2 + " is divisible by" + " by 3: " + divisible5);
        System.out.println(num2 + " is divisible by" + " by 5: " + divisible6);










    }
}
/*
1. create a class called LeapYear, and write a program that can identify if the given is Leap Year, print true if it's leap year, otherwise print false
		Ex:
				year = 2020
			output:
				2020 is leap year: true
        Hint: if the number of year can be evenly divisible by 4, it's known as leap year


2. Divisibility, write a program that can check if a number is evenly divisible by 2, 3, 5
			Ex:
				number = 65;
			output:
				65 is divisible by 2: false
				65 is divisible by 3: false
				65 is divisible by 5: true
 */
