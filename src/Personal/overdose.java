package Personal;

import java.util.Scanner;

public class overdose {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter number of milligrams in drink: ");
        int milligrams = scan.nextInt();
        scan.close();
        if(milligrams>0) {
            int od = 10 * 1000;
            int test = od/milligrams;

            String result = "It would take about " + test + " drinks for a lethal overdose";
            System.out.println(result);
        }
    }

}
