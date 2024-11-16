package Introduction_to_Java;

import java.util.Scanner;

public class Leapyear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the year to be checked: ");
        int year = sc.nextInt();

        boolean isLeapYear = false;
        if (year % 400 == 0) {
            isLeapYear = true;
        }
        if (isLeapYear) {
            System.out.printf("%d is a leap year", year);
        } else {
            System.out.printf("%d is not a leap year", year);
        }
    }
}
