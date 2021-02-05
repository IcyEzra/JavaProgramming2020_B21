package day_46_JavaRecap.ShapeTask;

public class Shape {

    public String name;

    public Shape(String name){
        if(name.isEmpty()){
            throw new RuntimeException("Shape Name cannot be empty");
        }

        for(int i = 0; i < name.length(); i++){
            char eachChar = name.charAt(i);
            if(!Character.isLetter(eachChar)){ // if any character is not letter
                throw new RuntimeException("No such a shape");
            }
        }

        this.name = name;
    }

    public double area(){
        return 0;
    }

    public double perimeter(){
        return 0;
    }

    @Override
    public String toString() {
        return "Shape{" +
                "name='" + name + '\'' +
                ", area= "+area() +
                ", perimeter= "+perimeter()+
                '}';
    }
}
/*
1. create a class called Shape:
				Attributes: name
				add a constructor that can set the name of the shape:
						if shape' name is set to be empty, throw an exception with a message of: "Shape Name cannot be empty"
						if name contains a character that is not letter, throw an exception with a message of: "No such a Shape"
				methods:
					area(): returns the area of the shape
					perimeter(): returns the perimeter of the shape
					toString(): prints the shape' Name, Area and Perimeter
 */