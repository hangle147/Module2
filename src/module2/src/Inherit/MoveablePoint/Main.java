package Inherit.MoveablePoint;

public class Main {
    public static void main(String[] args) {
        Point point = new Point(3, 55);
        System.out.println("Point" + point);

        MoveablePoint movablePoint = new MoveablePoint(1, 2, 3, 4);
        System.out.println("MovablePoint (before move): " + movablePoint);
        movablePoint.move();
        System.out.println("MovablePoint (after move): " + movablePoint);
    }
}
