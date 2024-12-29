package DSA_Stack_Queue;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class WordCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập văn bản:");
        String input = scanner.nextLine();

        TreeMap<String, Integer> wordCountMap = new TreeMap<>();

        String[] words = input.toLowerCase().split("\\W+");

        for (String word : words) {
            if (wordCountMap.containsKey(word)) {
                wordCountMap.put(word, wordCountMap.get(word) + 1);
            } else {
                wordCountMap.put(word, 1);
            }
        }

        System.out.println("Số lần xuất hiện của các từ (theo thứ tự bảng chữ cái):");
        for (Map.Entry<String, Integer> entry : wordCountMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
