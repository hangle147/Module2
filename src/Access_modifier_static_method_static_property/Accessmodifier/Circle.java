package Access_modifier_static_method_static_property.Accessmodifier;

public class Circle {
    private double radius = 1;
    private String color = "red";

    public Circle() {}

    public Circle(double radius) {}

    public double getRadius() {
        return radius;
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }
}