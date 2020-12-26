package Personal;

public class quiz {
    public static void main(String[] args) {
        int x = 7;
            if(available(x)){
                System.out.println("1");
            }else{
                System.out.println("2");
            }



    }
public static boolean available(int x){
        return x > 1 ? true : false;
}

}