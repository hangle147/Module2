package Classes_and_Objects_in_Java.Rectangle;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the width: ");
        double width = sc.nextDouble();
        System.out.print("Enter the height: ");
        double height = sc.nextDouble();

        Rectangle rectangle = new Rectangle(width, height);
        System.out.println(rectangle.display());
        System.out.println("Area is " + rectangle.getArea());
        System.out.println("Perimeter is " + rectangle.getPerimeter());
    }
}
