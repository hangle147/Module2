package Loops_in_Java;

import java.util.Scanner;

public class Display {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Menu");
        System.out.println("1. Print the rectangle");
        System.out.println("2. Print the square triangle (The corner is square at 4 different angles: top-left, top-right, botton-left, botton-right)");
        System.out.println("3. Exit");
        System.out.print("Enter your choice: ");
        int choice = sc.nextInt();

        switch(choice) {
            case 1:
                System.out.println("Draw the rectangle");
                System.out.println("* * * * * *");
                System.out.println("* * * * * *");
                System.out.println("* * * * * *");
            case 2:
                System.out.println("The corner is square at: ");
                System.out.println("1) top-left");
                System.out.println("2) top-right");
                System.out.println("3) bottom-left");
                System.out.println("4) bottom-right");
                System.out.print("Enter your choice: ");
                int choiceCorner = sc.nextInt();

                switch(choiceCorner) {
                    case 1:
                        System.out.println("Draw the triangle at top-left");
                        for (int i = 5; i > 0; i--) {
                            for (int j = 0; j < i; j++) {
                                System.out.print("*");
                            }
                            System.out.print("\n");
                        }
                        break;
                    case 2:
                        System.out.println("Draw the triangle at top-right");
                        for (int i = 5; i > 0; i--) {
                            for (int j = 1; j < 5 - i; j++) {
                                System.out.println(" ");
                            }
                            for (int k = 0; k <= i; k++) {
                                System.out.println("*");
                            }
                        }
                        break;
                    case 3:
                        System.out.println("Draw the triangle at bottom-left");
                        for (int i = 0; i < 5; i++) {
                            for (int j = 0; j <= i; j++) {
                                System.out.print("*");
                            }
                            System.out.print("\n");
                        }
                        break;
                    case 4:
                        System.out.println("Draw the triangle at bottom-right");
                        for (int i = 5; i > 0; i--) {
                            for (int j = 1; j < i; j--) {
                                System.out.print(" ");
                            }
                            for (int k = 0; k <= 5 - i; k++) {
                                System.out.print("*");
                            }
                        }
                        break;
                }

            case 0:
                System.exit(0);
            default:
                System.out.println("No choice!");
        }
    }
}
