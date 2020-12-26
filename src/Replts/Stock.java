package Replts;

public class Stock {
    public String tickerSymbol, companyName;
    public int price, totalShares;
    public double percentChange;
    public long marketCap;


    public void Stock(String tickerSymbol, String companyName, int price, int totalShares) {
        this.tickerSymbol = tickerSymbol;
        this.companyName = companyName;
        this.price = price;
        this.totalShares = totalShares;
    }

    public void setInfo(String tickerSymbol, String companyName, int price, int totalShares) {
        this.tickerSymbol = tickerSymbol;
        this.companyName = companyName;
        this.price = price;
        this.totalShares = totalShares;
        this.marketCap = totalShares*price;
    }



    public void adjustPrice(int value){
        price = price + value;
        marketCap = totalShares*price;
    }

    public String toString(){
        return "Ticker Symbol: "+tickerSymbol.toUpperCase()+"\n"+"Company: "+companyName+"\n"+"Current Price: $"+price+" (+"+percentChange+"%)"+"\n"+"Market Cap: $"+marketCap;
    }
}
