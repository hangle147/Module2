package Classes_and_Objects_in_Java.QuadraticEquation;

import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the first parameter: ");
        double a = sc.nextDouble();
        System.out.print("Enter the second parameter: ");
        double b = sc.nextDouble();
        System.out.print("Enter the third parameter: ");
        double c = sc.nextDouble();

        QuadraticEquation equation = new QuadraticEquation(a, b, c);

        System.out.println(equation.display());

        if (equation.getDiscriminant() < 0) {
            System.out.println("The equation has no real roots");
        } else if (equation.getDiscriminant() == 0) {
            System.out.print("The equation has one roots: " + equation.getRoot());
        } else {
            System.out.print("The equation has two roots: " + equation.getRoot1() + ", " + equation.getRoot2());
        }
    }
}
