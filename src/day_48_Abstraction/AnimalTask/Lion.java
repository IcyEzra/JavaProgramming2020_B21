package day_48_Abstraction.AnimalTask;

public class Lion extends Animal implements Predator{

    public Lion(String breed, String size, char gender, int age) {
        super("Lion", breed, size, gender, age);
    }

    @Override
    public void sleep() {
        System.out.println("Lion sleeps for 10 hours");
    }

    public void hunt(){
        System.out.println("Lion is hunting");
    }
}
