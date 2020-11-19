package Personal;
import java.util.*;
public class ternary {

    public static void main(String[] args) {

            //DO NOT TOUCH THESE LINES. TEACHER NEEDS THEM TO TEST YOUR CODE:
          Scanner in = new Scanner(System.in);
          byte b1 = in.nextByte();
        byte b2 = in.nextByte();
        byte b3 = in.nextByte();

        int max = (b3>b2) ? b3 + 2 : (b2 >b1) ? b2 - 4 : b1 * -1;
        System.out.println(max);

        }

}








