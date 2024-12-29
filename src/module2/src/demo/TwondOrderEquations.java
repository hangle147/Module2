package demo;

import java.util.Scanner;

public class TwondOrderEquations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập lần lượt 3 hệ số a, b, c: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        double delta = b * b - 4 * a * c;

        if (a == 0) {
            if (b != 0) {
                double x = -c / b;
                System.out.print("Phương trình có nghiệm x = " + x);
            } else {
                if (c == 0) {
                    System.out.println("Phương trình có vô số nghệm");
                } else {
                    System.out.println("Phương trình vô nghiệm");
                }
            }
        } else {
            if (delta > 0) {
                double x1 = (-b + Math.sqrt(delta)) / (2 * a);
                double x2 = (-b - Math.sqrt(delta)) / (2 * a);
                System.out.println("Phương trình có 2 nghiệm phân biệt: \n" + "x1 = " + x1 + "\n" + "x2 = " + x2);
            } else if (delta == 0) {
                double x = -b / (2 * a);
                System.out.println("Phương trình có nghiệm kép: x = " + x);
            } else {
                System.out.println("Phương trình vô nghiệm.");
            }
        }
    }
}
