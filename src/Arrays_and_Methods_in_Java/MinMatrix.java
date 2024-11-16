package Arrays_and_Methods_in_Java;

import java.util.Scanner;

public class MinMatrix {
    public static int[][] enterArray(int[][] matrix, int row, int col) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
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

    public static int minMatrix(int[][] matrix) {
        int min = matrix[0][0];
        for (int i = 1; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] < min) {
                    min = matrix[i][j];
                }
            }
        }
        return min;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập số hàng của mảng 2 chiều: ");
        int row = sc.nextInt();
        System.out.print("Nhập số cột của mảng 2 chiều: ");
        int col = sc.nextInt();

        int[][] matrix = new int[row][col];

        System.out.println("Nhập các phần tử của mảng: ");
        enterArray(matrix, row, col);
        System.out.println("Mảng đã nhập: ");
        displayArray(matrix);
        System.out.print("Phần tử nhỏ nhất trong mảng: " + minMatrix(matrix));
    }
}
