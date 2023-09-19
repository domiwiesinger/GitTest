import java.util.ArrayList;
import java.util.List;

public class EratosthenesPrimeSieve implements PrimeSieve{

    private int maxBound;

    private List<Integer> primes = new ArrayList<>();
    private List<Integer> numbers = new ArrayList<>();

    private List<Integer> noPrimes = new ArrayList<>();


    public EratosthenesPrimeSieve(int maxBound) {
        this.maxBound = maxBound;

        for (int i = 0; i < maxBound; i++) {
            numbers.add(i);
        }
    }

    @Override
    public boolean isPrime(int p) {
        int multiples = p;

        if ((p == 2) || (p % 2 != 0)){
            while (multiples <= maxBound){
                multiples = multiples + p;
                numbers.remove((Integer) multiples);


            }

            if (numbers.contains((Integer) p)){
                primes.add(p);
            }
            return true;
        }

        return false;
    }

    @Override
    public void printPrimes() {
        System.out.println(primes);
    }
}
