package day_42_Inheritance.AnimalTask;

public class Tiger extends Animal{

    public Tiger(String breed, String color, String name, String size, char gender, int age){
        setInfo(breed, color, name, size, gender, age);
    }

    public void roar(){
        System.out.println(name+" is roaring!");
    }

    public void hunt(){
        System.out.println(name+" is hunting");
    }

}
