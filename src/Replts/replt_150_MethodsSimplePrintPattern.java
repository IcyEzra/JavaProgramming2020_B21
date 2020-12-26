package Replts;

public class replt_150_MethodsSimplePrintPattern {


        public static void printHollowRect(){
            // write your codes here
            for(int i = 0; i <= 5; i++){
                System.out.print("*");

            }

            System.out.println();

            for(int i = 0; i <= 5; i++){
                if(i==0 || i==5) {
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }

            System.out.println();

            for(int i = 0; i <= 5; i++){
                if(i==0 || i==5) {
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();

            for(int i = 0; i <= 5; i++){
                if(i==0 || i==5) {
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }


            System.out.println();

            for(int i = 0; i <= 5; i++){
                System.out.print("*");

            }


        }

    public static void main(String[] args) {

        printHollowRect();
    }

}
