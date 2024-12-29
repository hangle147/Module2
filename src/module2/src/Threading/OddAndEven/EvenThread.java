package Threading.OddAndEven;

public class EvenThread extends Thread {
    @Override
    public void run() {
        for (int i = 2; i <= 10; i += 2) {
            System.out.println("Even: " + i);
            try {
                Thread.sleep(15); // Tạm dừng 15 milliseconds
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
