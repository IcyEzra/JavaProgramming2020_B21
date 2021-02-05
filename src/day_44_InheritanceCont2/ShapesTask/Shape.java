package day_44_InheritanceCont2.ShapesTask;

public class Shape {

    public String name;
    public static boolean isShape, hasArea, hasPerimeter; // constant variables



    static{
        isShape = true;
        hasArea = true;
        hasPerimeter = true;
    }

    public Shape(String name){
        this.name = name;
    }

    public double calcArea(){
        return 0;
    }

    public double calcPerimeter(){
        return 0;
    }

    @Override
    public String toString() {
        return "Shape{" +
                "name= " + name + '\'' +
                ", area= " + calcArea() + '\'' +
                ", perimeter= " + calcPerimeter() + '\''+
                '}';
    }
}
/*
1. create a class called Shape
						variables: name, isShape(boolean), hasArea(boolean), hasPerimeter(boolean)
						methods: setInfo, calcArea(), calcPerimeter()
								 toString(): returns the name, area and perimeter that are returned by calcArea(), calcPerimeter()
 */