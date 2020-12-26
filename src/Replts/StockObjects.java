package Replts;

public class StockObjects {
    public static void main(String[] args)
    {
        Stock stock1 = new Stock();
        stock1.setInfo("goog","Google Inc",300,100000);
        System.out.println(stock1);

        stock1.adjustPrice(30);
        System.out.println(stock1);
    }
}
