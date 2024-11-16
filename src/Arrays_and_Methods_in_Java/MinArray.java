package Arrays_and_Methods_in_Java;

import java.util.Scanner;

public class MinArray {

    public static int minValue(int[] array) {
        int index = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < array[index]) {
                index = i;
            }
        }
        return index;
    }

    public static int[] enterArray(int length) {
        Scanner sc = new Scanner(System.in);
        int[] array = new int[length];
        System.out.println("Enter array: ");
        for (int i = 0; i < length; i++) {
            array[i] = sc.nextInt();
        }
        return array;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array length: ");
        int length = sc.nextInt();

        System.out.println("The smallest element in array is: " + minValue(enterArray(length)));
    }
}
