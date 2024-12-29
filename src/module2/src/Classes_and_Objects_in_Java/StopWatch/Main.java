package Classes_and_Objects_in_Java.StopWatch;

public class Main {
    public static void swap(int number1, int number2) {
        int temp = number1;
        number1 = number2;
        number2 = temp;
    }

    public static void selectionSort(int[] arr) {
        int length = arr.length, i, min;
        for (i = 0; i < length - 1; i++) {
            min = i;
            for (int j = i + 1; j < length; j++) {
                if (arr[j] < arr[min]) {
                    min = j;
                }
            }
            swap(arr[min], arr[i]);
        }
    }

    public static void main(String[] args) {
        int[] array = new int[100000];
        int length = array.length;
        for (int i = 0; i < length; i++) {
            array[i] = (int) (Math.random() * 10000);
        }

        StopWatch stopWatch = new StopWatch();

        stopWatch.start();
        selectionSort(array);
        stopWatch.stop();

        System.out.println("Thời gian thực thi thuật toán selection sort: " + stopWatch.getElapsedTime() + " milliseconds");
    }
}
