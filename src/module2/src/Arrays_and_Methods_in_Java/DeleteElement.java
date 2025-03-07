package Arrays_and_Methods_in_Java;

import java.util.Scanner;

public class DeleteElement {

    public static void deleteElement(int[] array, int index) {
        int i, j;
        for (i = 0; i < array.length; i++) {
            if (array[i] == index) {
                for (j = i; j < array.length - 1; j++) {
                    array[j] = array[j + 1];
                }
                array[array.length - 1] = 0;
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập độ da mảng: ");
        int length = sc.nextInt();

        int[] array = new int[length];
        System.out.println("Nhập mảng: ");
        for (int i = 0; i < length; i++) {
            array[i] = sc.nextInt();
        }

        System.out.print("Enter the element to be deleted: ");
        int index = sc.nextInt();

        System.out.print("Array that has performed the deletion of element " + index + ": ");
        deleteElement(array, index);

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
