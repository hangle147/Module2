package Loops_in_Java;

import java.util.Scanner;

public class CountPrime {

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
        int count = 0, number = 2;
        System.out.print("Nhập số lượng số nguyên tố cần in: ");
        int N = sc.nextInt();

        while (count < N) {
            if (isPrime(number)) {
                System.out.println(number);
                count++;
                number++;
            }
            number++;
        }
    }
}
