package Replts.StoreProductsClass;

public class StoreProduct {

    public String label, category;
    public int price, stock;
    public boolean hasExpiration;

    public StoreProduct(String label, int price, String category, boolean hasExpiration, int stock) {
        this.label = label;
        this.category = category;
        this.price = price;
        this.stock = stock;
        this.hasExpiration = hasExpiration;
    }

    public StoreProduct(String label, int price, int stock) {
        this.category = "misc";
        this.hasExpiration = false;
        this.label = label;
        this.price = price;
        this.stock = stock;
    }

    public StoreProduct(String label, int price) {
        this.stock = 0;
        this.label = label;
        this.price = price;
        this.hasExpiration = false;
        this.category = "misc";
    }

    public StoreProduct(String label, String category, int price, boolean hasExpiration) {
        this.label = label;
        this.category = category;
        this.price = price;
        this.hasExpiration = hasExpiration;
        this.stock = 0;
    }

    public void expired(boolean hasExpired){
        if(hasExpired == true && hasExpiration == true){
            this.stock = 0;
        }
    }

    public boolean sale(int quantity){
        if(stock > quantity){
            stock = stock - quantity;
            return true;
        }else{
            return false;
        }
    }

    public double getDiscountedPrice(double discount){
        return price - (price * discount);
    }

}
