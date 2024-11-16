package Loops_in_Java;

import java.util.Scanner;

public class Interest {
    public static void main(String[] args) {
        int month;
        double  money = 1.0, interestRate = 1.0, totalInterest = 0;

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter investment amount: ");
        money = sc.nextDouble();

        System.out.print("Enter number of month: ");
        month = sc.nextInt();

        System.out.print("Enter annual interest rate in percentage: ");
        interestRate = sc.nextDouble();

        for (int i = 0; i < month; i++) {
            totalInterest += money * (interestRate / 100) / 12 * month;
        }
        System.out.println("Total of Interest: " + totalInterest);
    }
}
