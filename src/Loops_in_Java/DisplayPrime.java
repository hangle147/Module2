package Loops_in_Java;

import java.util.Scanner;

public class DisplayPrime {

    public static boolean isPrime(int number) {
        if (number < 2) {
            return false;
        } else if (number == 2) {
            return true;
        } else {
            for (int i = 2; i <= Math.sqrt(number); i++) {
                if (number % i == 0) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập phạm vi sô nguyên tố cần hiển thị: ");
        int number = sc.nextInt();

        for (int i = 2; i < number; i++) {
            if (isPrime(i)) {
                System.out.println(i);
            }
        }
    }
}
