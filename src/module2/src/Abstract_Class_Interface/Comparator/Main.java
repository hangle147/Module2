package Abstract_Class_Interface.Comparator;

import Inherit.Shape.Circle;
import Inherit.Shape.Rectangle;
import Inherit.Shape.Square;

import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        Circle[] circle = new Circle[3];
        circle[0] = new Circle();
        circle[1] = new Circle(3.4);
        circle[2] = new Circle(5.4, "White", false);

        Rectangle[] rectangle = new Rectangle[3];
        rectangle[0] = new Rectangle();
        rectangle[1] = new Rectangle(3.4, 5);
        rectangle[2] = new Rectangle(5.6, 4, "Red", false);


        Square[] square = new Square[3];
        square[0] = new Square();
        square[1] = new Square(3.4);
        square[2] = new Square(5.6, "Red", false);

        System.out.println("Pre-sorted:");
        for (Circle circles : circle) {
            System.out.println(circles);
        }
        for (Rectangle rectangles : rectangle) {
            System.out.println(rectangles);
        }
        for (Square squares : square) {
            System.out.println(squares);
        }

        System.out.println("After-sorted:");
        Comparator circleComparator = new CircleComparator();
        Arrays.sort(circle, circleComparator);
        for (Circle circles : circle) {
            System.out.println(circles);
        }

        Comparator rectangleComparator = new RectangleComparator();
        Arrays.sort(rectangle, rectangleComparator);
        for (Rectangle rectangles : rectangle) {
            System.out.println(rectangles);
        }

        Comparator squareComparator = new SquareComparator();
        Arrays.sort(square, squareComparator);
        for (Square squares : square) {
            System.out.println(squares);
        }
    }
}
