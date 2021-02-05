package day_48_Abstraction.AnimalTask;

public class Cat extends Animal{

    public Cat(String name, String breed, String size, char gender, int age) {
        super(name, breed, size, gender, age);
    }

    @Override
    public void sleep() {

    }

    public void meow(){
        System.out.println("Mow");
    }
}
