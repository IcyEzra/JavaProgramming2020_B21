package day_42_Inheritance.AnimalTask;

public class Dog extends Animal{ // Dog IS A Animal

    // setting info for dog, using setInfo method, which was inherited
    public Dog(String name, String breed, char gender, int age, String color, String size){
        setInfo(breed, color, name, size, gender, age);
    }

    public void bark(){
        System.out.println(name+" is barking");
    }

}



/*
class example{
        example of calling the method via Inheritance, shows difference between inheritance and import
    public static void main(String[] args) {
        new Dog().eat("Food");
        new Animal().eat("food");
    }

 */

