package Inherit.Point;

public class Main {
    public static void main(String[] args) {
        Point2D point = new Point2D();
        System.out.println(point);
        point = new Point2D(4,5);
        System.out.println(point);

        Point3D point3D = new Point3D();
        System.out.println(point3D);
        point3D = new Point3D(4);
        System.out.println(point3D);

    }
}
