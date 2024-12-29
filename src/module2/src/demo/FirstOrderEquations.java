package demo;

import java.util.Scanner;

public class FirstOrderEquations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập hệ số a: ");
        double a = sc.nextDouble();
        System.out.print("Nhập hệ số b: ");
        double b = sc.nextDouble();

        if (a != 0) {
            double x = -b / a;
            System.out.print("Phương trình có nghiệm x = " + x);
        } else {
            if (b == 0) {
                System.out.println("Phương trình có vô số nghệm");
            } else {
                System.out.println("Phương trình vô nghiệm");
            }
        }
    }
}
