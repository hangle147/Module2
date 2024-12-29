package Arrays_and_Methods_in_Java;

import java.util.Scanner;

public class CountStudent {

    public static int[] enterArray(int[] array) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < array.length; i++) {
            System.out.print("Nhập điểm học sinh " + (i + 1) + ": ");
            array[i] = sc.nextInt();
        }
        return array;
    }

    public static int countStudent(int[] array) {
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] >= 5) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size;
        do {
            System.out.print("Nhập số lượng học sinh cần kiểm tra (dưới 30 học sinh): ");
            size = sc.nextInt();
        } while (size > 30);
        int[] array = new int[size];
        enterArray(array);
        System.out.print("Số lượng học sinh thi đõ: " + countStudent(array));
    }
}
