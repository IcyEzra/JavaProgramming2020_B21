package Personal;
import java.util.*;
public class replt_166_Methods_ProfitOrLoss {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        c_profits(scan.nextInt(), scan.nextInt() );
    }

    public static String c_profits (int buyPrice,int sellPrice)
    {
        //your code here
    String profitability = "";

    if(buyPrice > sellPrice){
        profitability = "loss";
    }else if(sellPrice > buyPrice){
        profitability = "profit";
    }else{
        profitability = "no loss";
    }

    return profitability;
    }
}
