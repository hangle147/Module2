package Arrays_and_Methods_in_Java;

import java.util.Scanner;

public class AddElement {

    public static void addElement(int[] array, int index) {
        if (index >= array.length - 1 || index < -1) {
            System.out.println("Invalid index");
        }
        for (int i = index; i < array.length - 1; i++) {

        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int length;
        do {
            System.out.print("Enter array length (length < 10): ");
            length = sc.nextInt();
        } while (length >= 10);


        int[] array = new int[length];
        System.out.println("Enter array: ");
        for (int i = 0; i < length; i++) {
            array[i] = sc.nextInt();
        }

        System.out.print("Enter the element to be insert: ");
        int index = sc.nextInt();
    }
}
