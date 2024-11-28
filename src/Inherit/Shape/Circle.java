package Inherit.Shape;

import Abstract_Class_Interface.Colorable.Colorable;
import Abstract_Class_Interface.Resizeable.Resizeable;

public class Circle extends Shape
        implements Resizeable, Colorable {
    private double radius = 1.0;

    public Circle() {}

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(double radius, String color, boolean filled) {
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }

    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public void resize(double percent) {
        radius += radius * (percent / 100);
    }

    @Override
    public String howToColor() {
        return "Color all four sides " + getColor();
    }

    @Override
    public String toString() {
        return "\nCircle with " + getRadius()
                + ", which is a subclass of " + super.toString()
                + "\nThe area: " + getArea()
                + "\nThe Perimeter: " + getPerimeter();
    }
}
