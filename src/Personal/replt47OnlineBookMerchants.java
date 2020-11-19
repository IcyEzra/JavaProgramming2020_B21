package Personal;

import java.util.Scanner;

public class replt47OnlineBookMerchants {
    public static void main(String[] args) {

        int freeBooks = 0;
        Scanner scan = new Scanner(System.in);
        boolean isPremiumCustomer = scan.nextBoolean();
        int nbooksPurchased = scan.nextInt();

        if(isPremiumCustomer==true && nbooksPurchased >= 8){
            freeBooks += 2;
        }else if(isPremiumCustomer==true && nbooksPurchased >= 5){
            freeBooks += 1;
        }else if(isPremiumCustomer==false && nbooksPurchased >= 7){
            freeBooks += 1;
        }else if(isPremiumCustomer==false && nbooksPurchased >= 12){
            freeBooks += 2;
        }else {
            System.out.println(freeBooks);
        }
        System.out.println(freeBooks);
    }
}
