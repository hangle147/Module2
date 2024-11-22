package Inherit.Circle;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle();
        System.out.println(circle);
        circle = new Circle(4.56, "red");
        System.out.println(circle);

        Cylinder cylinder = new Cylinder();
        System.out.println(cylinder);
        cylinder = new Cylinder(4.56);
        System.out.println(cylinder);
        cylinder = new Cylinder(3.45, 3, "blue");
        System.out.println(cylinder);
    }
}
