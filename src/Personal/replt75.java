package Personal;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.Scanner;

public class replt75 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String txt = s.next();
        //your code here
        int last = txt.length()-1;
        String word = txt.substring(0,last);
        System.out.println(word);

    }
}