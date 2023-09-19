public class Main {

    public static void main(String[] args) {
        int max = 10000;
        EratosthenesPrimeSieve primeSieve = new EratosthenesPrimeSieve(max);
        for (int i = 2; i < max; i++) {
            primeSieve.isPrime(i);

        }

        primeSieve.printPrimes();
    }
}