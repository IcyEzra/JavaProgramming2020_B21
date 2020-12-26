package Replts;

public class replt_112_doWhilePractice {
    public static void main(String[] args) {

        int k = 1;
        int total = 0;

        do{
            for(k=1; k<=50; k++){
                total += (k*k);
            }
        }while(k<=50);
        System.out.println(total);

    }
}

