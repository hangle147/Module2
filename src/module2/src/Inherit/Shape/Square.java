package Inherit.Shape;

public class Square extends Rectangle {
    public Square() {}

    public Square(double side) {
        super(side, side);
    }

    public Square(double side, String color, boolean filled) {
        super(side, side, color, filled);
    }

    public double getSide() {
        return getWidth();
    }

    public void setSide(double side) {
        setWidth(side);
        setLength(side);
    }


    public void setLength(double length) {
        setSide(length);
    }

    @Override
    public void setWidth(double width) {
        setSide(width);
    }

    @Override
    public String howToColor() {
        return "Color all four sides " + getColor();
    }

    @Override
    public String toString() {
        return "\nA Square with side = " + getSide()
                + "\nThe area: " + getArea()
                + "\nThe Perimeter: " + getPerimeter();
    }
}
