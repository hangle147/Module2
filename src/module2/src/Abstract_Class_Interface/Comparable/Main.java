package Abstract_Class_Interface.Comparable;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        ComparableCircle[] circle = new ComparableCircle[3];
        circle[1] = new ComparableCircle();
        circle[0] = new ComparableCircle(3.6);
        circle[2] = new ComparableCircle(3.5, "White", false);
        System.out.println("Pre-sorted:");
        for (ComparableCircle circles : circle) {
            System.out.println(circles);
        }

        Arrays.sort(circle);

        System.out.println("\nAfter-sorted:");
        for (ComparableCircle circles : circle) {
            System.out.println(circles);
        }
    }
}
