package Debug;

import java.util.Random;
import java.util.Scanner;

public class ArrayExample {
    public Integer[] createRandom() {
        Random rs = new Random();
        Integer[] arr = new Integer[100];
        System.out.println("Danh sách phần tử của mảng: ");
        int i, length = arr.length;
        for (i = 0; i < length; i++) {
            arr[i] = rs.nextInt(length);
            System.out.print(arr[i] + " ");
        }
        return arr;
    }

    public static void main(String[] args) {
        ArrayExample arrayExample = new ArrayExample();
        Integer[] arr = arrayExample.createRandom();

        Scanner sc = new Scanner(System.in);
        System.out.print("\nNhập chỉ số của một phần tử bất kì: ");
        int index = sc.nextInt();
        try {
            System.out.println("Giá trị của phần tử có chỉ số " + index + ": " + arr[index]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.err.println("Chỉ số không nằm trong phạm vi của mảng");
        }
    }
}
