package day21_WhileLoop;

public class FINRA {
    public static void main(String[] args) {

        for (int i = 1; i <=100; i++){
        /*
            if(i%3==0 && i%5 ==0){
                System.out.print("FINRA ");
            }else if (i%3 == 0){
                System.out.print("FIN ");
            }else if (i%5 == 0){
                System.out.print("RA ");
            }else{
                System.out.print(i + " ");
            }
            */
            System.out.print((i%3==0 && i%5==0) ? "FINRA " : (i%3==0) ? "FIN " : (i%5==0) ? "RA " : i + " ");
        }


    }
}
/*
5. Write a method which prints out the numbers 1 to 100 but
for numbers which are a multiple of both 3 and 5, print FINRA instead of a number
for numbers which are a multiple of 3, print FIN instead of number and
for numbers which are a multiple of 5, print RA instead of the number
 */