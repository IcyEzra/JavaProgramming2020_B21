package day_35_CustomClass;

import java.util.ArrayList;
import java.util.Arrays;

public class CarMax {

    public static void main(String[] args) {
        Car car1 = new Car();
        Car car2 = new Car();
        Car car3 = new Car();
        Car car4 = new Car();
        Car car5 = new Car();

        // instance method used to set the info for car1
        car1.setInfo("Toyota","Avalon","Blue", 2019,30000.00);
        // instance method used to retrieve and print info
        //car1.getInfo();

        //System.out.println("My Car :)");
        car2.setInfo("Honda", "CRV","Titanium Grey",2016,31000);
        //car2.getInfo();

        car3.setInfo("Mercedes","AMG","Silver",2020,100000);
        //car3.getInfo();

        car4.setInfo("Audi","R8","White",2020,150000);
        //car4.getInfo();

        car5.setInfo("Nissan","R32 GTR","Dark Red",2021,200000);
        //car5.getInfo();

        // assign Cars to an array
        Car[] cars = {car1, car2, car3, car4, car5};
        // for each loop used to print each car
        for(Car eachCar : cars){
            eachCar.getInfo();
        }
        System.out.println("=====================================");

        ArrayList<Car> carList = new ArrayList<>();
        carList.addAll( Arrays.asList(cars) );
        // removes cars which are priced below 90k
        carList.removeIf(p -> p.price < 90000);
        // for loop used to print out carList after removal
        for(int i = 0; i <= carList.size()-1; i++){
            carList.get(i).getInfo();
        }


    }
}
