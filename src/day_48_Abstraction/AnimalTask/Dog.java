package day_48_Abstraction.AnimalTask;

public class Dog extends Animal implements Playable, Swimmable{

    public Dog(String breed, String size, char gender, int age) {
        super("Dog", breed, size, gender, age);
    }

    @Override
    public void sleep() {

    }

    public void bark(){
        System.out.println("Bork");
    }


    @Override
    public void play() {
        System.out.println("Dog plays with ball");
    }

    @Override
    public void swim() {
        System.out.println("Dogs can swim");
    }
}
