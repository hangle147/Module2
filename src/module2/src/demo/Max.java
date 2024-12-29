package demo;

import java.util.Scanner;

public class Max {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập lần lượt 4 số: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        int max = a;

        if (b > max) {
            max = b;
        }
        if (c > max){
            max = c;
        }
        if (d > max){
            max = d;
        }

        System.out.println("Số lớn nhất trong 4 số: " + max);
    }
}
