package Replts;
import java.util.Arrays;
import java.util.Collections;

public class replt_205_MethodsWithArrays_addElements {


    public static int[] addElements(int[] ints1, int[] ints2) {
        int[] arr = new int[5];

        for(int i = 0; i <= 4; i++) {
            arr[i] = ints1[i] + ints2[i];
        }
        return arr;
    }


// replt 207, switch first and last

    public static int[] do_switch(int[] i)
    {
        int first = i[0];
        int last = i[i.length-1];
        i[0] = last;
        i[i.length-1] = first;

        return i;
    }

}
