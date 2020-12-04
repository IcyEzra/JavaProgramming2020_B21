package day_35_CustomClass;

import javax.naming.MalformedLinkException;
import java.time.LocalDate;
import java.util.ArrayList;

public class DogPark {
    public static void main(String[] args) {

        Dog dog1 = new Dog();
        Dog dog2 = new Dog();
        Dog dog3 = new Dog();
        Dog dog4 = new Dog();
        Dog dog5 = new Dog();
        Dog dog6 = new Dog();

        dog1.setInfo("Tima","Yorkie","Tiny",'M',"Brown", LocalDate.of(2017,12,13),2);
        dog1.getInfo();

        dog2.setInfo("Brutus","Bull Terrier","Bulkly",'M',"Multicolor",LocalDate.of(2016,2,21),4);
        dog2.getInfo();

        dog3.setInfo("Zeke","Doberman","Athletic",'M',"Black",LocalDate.of(2014,4,1),6);
        dog3.getInfo();

        dog4.setInfo("Alpha","Husky","Athletic",'F',"Grey",LocalDate.of(2014,4,1),6);
        dog4.getInfo();

        dog5.setInfo("Bunt","Maltese","Tiny",'M',"Tan",LocalDate.of(2014,4,1),6);
        dog5.getInfo();

        dog6.setInfo("Thoomp","Maltese","Very Tiny",'M',"Mix",LocalDate.of(2014,4,1),6);
        dog6.getInfo();

        // prints out statement of name of dog and what they are eating
        dog1.eat("Chicken");

        dog2.drink("Beer");

        Dog[] dogs = {dog1, dog2, dog3, dog4, dog5, dog6};

        ArrayList<Dog> huskies = new ArrayList<>();
        ArrayList<Dog> Maltese = new ArrayList<>();

        for(Dog eachDog : dogs){
            if(eachDog.breed.equalsIgnoreCase("husky")){
                huskies.add(eachDog);
            }else if(eachDog.breed.equalsIgnoreCase("maltese")){
                Maltese.add(eachDog);
            }
        }
        System.out.println("Total number of Huskies: "+huskies.size());
        System.out.println("Total number of Maltese: "+Maltese.size());

    }
}
