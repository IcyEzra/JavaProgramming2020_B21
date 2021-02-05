package Replts;

public class StockObjects {
    public static void main(String[] args)
    {
        Stock stock1 = new Stock("goog","google",10,100);

        System.out.println(stock1);

        stock1.adjustPrice(30);
        System.out.println(stock1);
    }
}
