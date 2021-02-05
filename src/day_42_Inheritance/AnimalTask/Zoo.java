package day_42_Inheritance.AnimalTask;

public class Zoo { // Zoo has a tiger

    public static void main(String[] args) {

        Tiger tiger = new Tiger("Tiger","Golden","Sher-Khan","Larger", 'M',30);

        System.out.println(tiger);
        tiger.eat("Chicken");
        // tiger.meow(); in a different subclass so it cannot be reached
        // tiger.bark();
        tiger.hunt();
        tiger.roar();

        Cat cat = new Cat("Calico","Mixed", "Kitty","Little",'F',8);

        System.out.println(cat);

        cat.eat("Cat food");
        cat.drink("milk");
        cat.sleep();
        cat.meow();

        Dog dog = new Dog("Nina","American Bull Dog",'F',4,"White and Brown","Big");

        System.out.println(dog);
        dog.eat("Chicken");
        dog.drink("water");
        dog.sleep();
        dog.bark();
    }

}
