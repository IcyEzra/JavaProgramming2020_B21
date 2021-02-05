package day_44_InheritanceCont2.ShapesTask;

import day_43_InheritanceCont.RestarauntTask.Restaurant;

public class Rectangle extends Shape{
    /*inherited from Shape class
    variables: 4 (1 instance, 3 static)
    methods: 4 (4 instances)
     */

    public double length, width;

    public Rectangle(double width, double length){
        super("Rectangle");
        this.width = width;
        this.length = length;

    }

   // method OVERRIDING
    // takes inherited method and changes it return value
    // override annotation is used to check if method is properly overriden, if there is an error then it did not override
   @Override
    public double calcArea(){
        return width * length;
    }

    public double calcPerimeter(){
        return width + width + length + length;
    }


}
