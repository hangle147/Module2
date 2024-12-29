package Classes_and_Objects_in_Java.QuadraticEquation;

public class QuadraticEquation {
    private double a, b, c;

    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getDiscriminant() {
        return Math.pow(b, 2) - 4 * a * c;
    }

    public double getRoot(){
        return (-b) / (2 * a);
    }

    public double getRoot1() {
        return (- b + Math.sqrt(getDiscriminant())) / (2 * a);
    }

    public double getRoot2() {
        return (- b - Math.sqrt(getDiscriminant())) / (2 * a);
    }

    public String display(){
        return "Quadratic Equation: " + a + " * (x * x) + " + b + " * x + " + c + " = 0";
    }
}
