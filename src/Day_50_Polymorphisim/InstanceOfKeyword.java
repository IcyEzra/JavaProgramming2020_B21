package Day_50_Polymorphisim;

import day_48_Abstraction.AnimalTask.Animal;
import day_48_Abstraction.AnimalTask.Dog;
import day_48_Abstraction.AnimalTask.Lion;


public class InstanceOfKeyword {

    public static void main(String[] args) {

        Animal animal = new Dog("xx","yy",'f',12);

        // instanceof always returns boolean
        boolean isDog = animal instanceof Dog;
        boolean isLion = animal instanceof Lion;
        boolean isAnimal = animal instanceof Animal;

        System.out.println("isDog = "+isDog); // true
        System.out.println("isLion = "+isLion); // false
        System.out.println("isAnimal = "+isAnimal); // true


    }


}
