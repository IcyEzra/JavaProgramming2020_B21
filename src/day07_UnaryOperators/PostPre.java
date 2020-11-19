package day07_UnaryOperators;

public class PostPre {
    public static void main(String[] args) {

        int a = 1;
        int b = -a-- + a++ / -a-- * --a;
          //b = -1 + 0 / -1 * -1
          //b = -1
        System.out.println(b);

        int a2 = 50;
        a2 = --a2 + a2++ + a2-- + a2++;
            // 49 + 49 +   50 +   49
        System.out.println(a2);

        int x = 4;
        int y = x * 4 - x++;
        System.out.println(y);

        int t = 100;
        int p = - ++t * -t-- / t++ + --t;

        System.out.println(p);

        int R = 20;
        int W = -R-- + -R++ + --R * R-- % 2;
             // -20 + -19 + 19 * 19 % 2
        System.out.println(W);

        int M = 300;
        int N = 400;
        int J = M + N - M * N + M / N;
             // 300 + 400 - 300 * 400 + 300 / 400
             //300 + 400 - 120000 + 0
        System.out.println(J);

        int U = ++M + N++ - M-- % 2 + --N % 2;
            // 301 + 400 - 301 % 2 + 400 % 2
            //301 + 400 - 1 + 0 = 700
        System.out.println(U);

    }
}
