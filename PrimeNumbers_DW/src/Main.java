public class Main {

    public static void main(String[] args) {
        int max = 100;
        EratosthenesPrimeSieve primeSieve = new EratosthenesPrimeSieve(max);
        for (int i = 0; i < max; i++) {
            primeSieve.isPrime(i);

        }

        primeSieve.printPrimes();
    }
}