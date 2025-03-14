package Inherit.Shape;

import Abstract_Class_Interface.Colorable.Colorable;
import Abstract_Class_Interface.Resizeable.Resizeable;

public class Rectangle extends Shape
        implements Resizeable, Colorable {
    private double width = 1.0;
    private double height = 1.0;

    public Rectangle() {
    }

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public Rectangle(double width, double height, String color, boolean filled) {
        super(color, filled);
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getArea() {
        return width * height;
    }

    public double getPerimeter() {
        return (width + height) * 2;
    }

    @Override
    public void resize(double percent) {
        width += width * (percent / 100);
        height += height * (percent / 100);
    }

    @Override
    public String howToColor() {
        return "Color all four sides " + getColor();
    }

    @Override
    public String toString() {
        return "\nA Square with width = " + getWidth()
                + ", height = " + getHeight()
                + ", which is a subclass of " + super.toString()
                + "\nThe area: " + getArea()
                + "\nThe Perimeter: " + getPerimeter();
    }

}
