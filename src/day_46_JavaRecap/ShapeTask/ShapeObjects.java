package day_46_JavaRecap.ShapeTask;

public class ShapeObjects {

    public static void main(String[] args) {

        Circle circle = new Circle(3);

        System.out.println(circle);
        System.out.println(circle.getD());
        System.out.println(circle.getR());

        Rectangle rectangle = new Rectangle(3,5);

        System.out.println(rectangle);
        System.out.println(rectangle.getLength());
        System.out.println(rectangle.getWidth());



    }

}
