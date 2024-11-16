package Arrays_and_Methods_in_Java;

import java.util.Scanner;

public class CountCharacters {
    public static int countCharacters(String s, char crt) {
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == crt) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập một chuỗi bất kì: ");
        String s = sc.nextLine();
        System.out.print("Nhập kí tự cần kiểm tra và đếm trong chuỗi: ");
        char crt = sc.next().charAt(0);
        System.out.print("Số lần xuất hiện của kí tự " + crt + " trong chuỗi là: " + countCharacters(s, crt));
    }
}
