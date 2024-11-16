package Introduction_to_Java;

import java.util.Scanner;

public class USDToVND {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rate = 24000, USD, VND;

        System.out.print("USD = ");
        USD = sc.nextInt();
        VND = rate * USD;
        System.out.println("VND = " + VND);
    }
}
