package day_44_InheritanceCont2.ShapesTask;

public class ShapeObjects {

    public static void main(String[] args) {

        Circle circle = new Circle(3);
        Rectangle rectangle = new Rectangle(4,5);
        Square square = new Square(3);
        Cube cube = new Cube(4);
        Triangle triangle = new Triangle(2,5);

        System.out.println(circle);
        System.out.println(rectangle);
        System.out.println(square);
        System.out.println(cube);
        System.out.println(triangle);

    }

}
