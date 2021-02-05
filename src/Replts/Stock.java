package Replts;

public class Stock {
    public String tickerSymbol, companyName;
    public int price, totalShares;
    public double percentChange;
    public long marketCap;


    public Stock(String tickerSymbol, String companyName, int price, int totalShares) {
        this.tickerSymbol = tickerSymbol.toUpperCase();
        this.companyName = companyName;
        this.price = price;
        this.totalShares = totalShares;
        marketCap = totalShares * price;
        percentChange = 0;
    }


    public void adjustPrice(int value){
        price = price + value;
        marketCap = totalShares*price;
        percentChange = 0;
    }

    public String toString(){
        return "Ticker Symbol: "+tickerSymbol.toUpperCase()+"\n"+"Company: "+companyName+"\n"+"Current Price: $"+price+" (+"+percentChange+"%)"+"\n"+"Market Cap: $"+marketCap;
    }
}
