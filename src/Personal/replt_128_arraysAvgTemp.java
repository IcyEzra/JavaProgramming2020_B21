package Personal;

import java.util.Scanner;

public class replt_128_arraysAvgTemp {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int k = 0;
        double total = 0;
        double avgTemp = 0;
        double[] temps = { scan.nextDouble(), scan.nextDouble(), scan.nextDouble(), scan.nextDouble(),
                scan.nextDouble(), scan.nextDouble(), scan.nextDouble() , scan.nextDouble()  };

        total = ( temps[0] + temps[1] + temps[2] + temps[3] + temps[4] + temps[5] + temps[6] +temps[7] );

        k = 8;

        avgTemp = total/k;


        System.out.println(avgTemp);

    }
}


