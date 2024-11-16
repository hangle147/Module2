package Arrays_and_Methods_in_Java;

import java.util.Scanner;

public class SumCount {
    public static int[][] enterArray(int[][] matrix, int rows, int cols) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = sc.nextInt();
            }
            System.out.println();
        }
        return matrix;
    }

    public static void displayArray(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static int sumCols(int[][] matrix, int num) {
        int sum = 0;
        for (int i = 0; i < matrix.length; i++) {
            sum += matrix[i][num];
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rows, cols, num;

        System.out.print("Nhập số hàng của mảng 2 chiều: ");
        rows = sc.nextInt();
        System.out.print("Nhập số cột của mảng 2 chiều: ");
        cols = sc.nextInt();

        int[][] matrix = new int[rows][cols];

        System.out.println("Nhập các phần tử của mảng: ");
        enterArray(matrix, rows, cols);
        System.out.println("Mảng đã nhập: ");
        displayArray(matrix);
        System.out.print("Nhập vào số thứ tự của cột cần tính các phần tử (tính từ 0): ");
        num = sc.nextInt();
        System.out.print("Tổng các phần tử trong cột: " + sumCols(matrix, num));
    }
}
