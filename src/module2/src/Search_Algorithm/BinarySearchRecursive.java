package Search_Algorithm;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearchRecursive {
    public static int binarySearch(int[] array, int left, int right, int value) {
        if (left > right) {
            return -1;
        }

        int middle = (left + right) / 2;

        if (array[middle] == value) {
            return middle;
        }

        if (array[middle] < value) {
            return binarySearch(array, middle + 1, right, value);
        }

        return binarySearch(array, left, middle - 1, value);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập số phần tử trong mảng: ");
        int n = scanner.nextInt();
        int[] array = new int[n];

        System.out.println("Nhập các phần tử của mảng:");
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }

        Arrays.sort(array);

        System.out.println("Mảng sau khi sắp xếp: " + Arrays.toString(array));

        System.out.print("Nhập giá trị cần tìm: ");
        int value = scanner.nextInt();

        int result = binarySearch(array, 0, n - 1, value);

        if (result != -1) {
            System.out.println("Phần tử " + value + " được tìm thấy tại vị trí: " + result);
        } else {
            System.out.println("Phần tử " + value + " không tồn tại trong mảng.");
        }
    }
}
