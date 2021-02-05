package day_41_Encapsulation;

import java.util.ArrayList;
import java.util.Arrays;

public class Item {

    public String name;
    public double unitPrice;
    public int quantity;

    public Item(String name, double unitPrice, int quantity) {
        this.name = name;
        this.unitPrice = unitPrice;
        this.quantity = quantity;
    }

    public double calcCost(){
        return quantity * unitPrice;
    }


    public String toString() {
        return "Item{" +
                "name= " + name + '\'' +
                ", unitPrice= " + unitPrice +
                ", quantity= " + quantity +
                ", total cost= " + calcCost() +
                '}';
    }
}

