package day_48_Abstraction.AnimalTask;

public class Eagle extends Animal implements Predator, Flyable{

    public Eagle(String breed, String size, char gender, int age) {
        super("Eagle", breed, size, gender, age);
    }


    @Override
    public void sleep() {
        System.out.println("Eagles can sleep");
    }

    @Override
    public void hunt() {
        System.out.println("Eagle hunts snakes");
    }

    @Override
    public void fly() {
        System.out.println("Eaaaaaaaaaaaagle");
    }
}
