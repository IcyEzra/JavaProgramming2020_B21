package day03_Variables;

public class CalculateRectangle {
    public static void main(String[] args) {
        //width: 10 length: 20
        int width = 10;
        int length = 20;

        System.out.print("Area is: ");
        System.out.print( width*length ); //if you want the answer to be reusable you can declare it as a variable
        int area = width * length;

        int perimeter = width * 2 + length * 2;

        System.out.print("\nPerimeter is: ");
        System.out.print(perimeter);

        System.out.println("\nArea * Perimeter: ");
        System.out.println(perimeter * area);

        //Write the formula and variables for the radius of a circle, use double primitive for decimals
        double radius = 4.5;
        double Pi = 3.14;
        double CircleArea = radius * radius * Pi;
        double CirclePerimeter = radius * 2 * Pi;
        System.out.print("Circle Area ");
        System.out.println(CircleArea);
        System.out.print("Circle Perimeter ");
        System.out.println(CirclePerimeter);


    }

}
