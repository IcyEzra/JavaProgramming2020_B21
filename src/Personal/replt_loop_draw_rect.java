package Personal;

import java.util.Scanner;

public class replt_loop_draw_rect {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String word = scan.next();
        String separator = scan.next();
        int count = scan.nextInt();
        String combine = "";

        for(int i = 1; i <= count; i++) {
            if (count > 1) {
                combine += word + separator;
                System.out.print(combine);
            }else{
                System.out.println(word);
            }
        }


    }
}