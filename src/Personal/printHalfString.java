package Personal;

import java.util.Scanner;

public class printHalfString {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        String result = "";

        for(int i = 0; i<=str.length()/2-1; i++){
            result += str.charAt(i);
        }
        System.out.println(result + result);



    }
}
// prints half of the given input then concates both halves together
