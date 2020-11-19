package day_23_NestedLoop;

public class DoWhilePractice {
    public static void main(String[] args) {
        //for loop way
        for(int i =1; i <= 20; i++){
            if(i%2 !=0){
                System.out.println(i);
            }
        }


        System.out.println("====================================");
        // do while loop way
        int i =1;

        do{
            if(i%2 !=0){
                System.out.println(i);
            }
            i++;
        }while( i <= 20 );



    }

}
