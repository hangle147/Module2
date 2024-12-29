package Threading.OddAndEven;

public class OddThread extends Thread {
    @Override
    public void run() {
        for (int i = 1; i <= 10; i += 2) {
            System.out.println("Odd: " + i);
            try {
                Thread.sleep(10); // Tạm dừng 10 milliseconds
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
