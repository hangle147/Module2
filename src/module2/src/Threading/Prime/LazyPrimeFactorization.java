package Threading.Prime;

public class LazyPrimeFactorization implements Runnable{
    @Override
    public void run() {
        int number = 2;
        while (number <= 1000) {
            if (isPrime(number)) {
                System.out.println("LazyPrimeFactorization found prime: " + number);
            }
            number++;
        }
    }

    private boolean isPrime(int num) {
        if (num < 2) return false;
        for (int i = 2; i < num; i++) {
            if (num % i == 0) return false;
        }
        return true;
    }
}
