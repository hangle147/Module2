package Inherit.Circle;

public class Cylinder extends Circle {
    private double height;

    public Cylinder() {}

    public Cylinder(double height) {
        this.height = height;
    }

    public Cylinder(double height, double radius, String color) {
        super(radius, color);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public double getArea() {
        return 2 * Math.PI * getRadius() * (height + getRadius());
    }

    public double getVolume() {
        return Math.PI * Math.pow(getRadius(), 2) * height;
    }

    @Override
    public String toString() {
        return "Cylinder [radius = " + getRadius() + ", height = " + height + ", color = " + getColor() + "]"
                + "\nThe surface area: " + getArea()
                + "\nThe volume: " + getVolume() + "\n";
    }
}
