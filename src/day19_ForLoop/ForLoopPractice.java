package day19_ForLoop;

public class ForLoopPractice {
    public static void main(String[] args) {

        for (int i = 0; i <= 1000; i++){
            System.out.print(i + " "); // prints 0 to 1000. using print instead of println will make code run on same line. " " is concated so space is added between each number
        }

        System.out.println("===============================");

        for(int i = 1000; i <= 2000; i++){
            System.out.print(i + " ");
        }
        System.out.println(); // extra print statement given so next print statement prints on new line since last print doesn't append a new line
        System.out.println("Hello");

        System.out.println("===================================================");
        //task for printing odd numbers between 1 and 100
        for(int i = 1; i <= 100; i+=2){
            System.out.println(i + " "); // prints odd numbers
        }
        System.out.println();
        // if condition version of solution
        for(int i = 0; i <= 100; i++){
            if (i % 2 != 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
        System.out.println("===============================================================");
        //print only even number this looks similar to odd task but difference is i starts at 0, so every increment increase is even whereas odd started at 1 and gets odd result with each increase
        for(int i = 0; i <= 100; i+=2){
            System.out.println(i + " ");
        }
        System.out.println();
        System.out.println("==================================================================");
        //push up task: do 500 push ups
        for(int i =1; i <=500; i++){
            System.out.println("Push ups: " + i);
        }
    }
}
