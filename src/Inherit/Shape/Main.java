package Inherit.Shape;

public class Main {
    public static void main(String[] args) {
        Shape shape = new Shape();
        System.out.println(shape);
        shape = new Shape("red", false);
        System.out.println(shape);

        Circle circle = new Circle();
        System.out.println(circle + "");
        circle = new Circle(4);
        System.out.println(circle);
        circle = new Circle(5, "yellow", false);
        System.out.println(circle);

        Rectangle rectangle = new Rectangle();
        System.out.println(rectangle);
        rectangle = new Rectangle(4.0, 5.8);
        System.out.println(rectangle);
        rectangle = new Rectangle(3.65, 4.38, "white", false);
        System.out.println(rectangle);

        Square square = new Square();
        System.out.println(square);
        square = new Square(4.0);
        System.out.println(square);
        square = new Square(3.65, "red", false);
        System.out.println(square);
    }
}
