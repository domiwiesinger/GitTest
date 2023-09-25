import java.util.ArrayList;
import java.util.List;

public class EratosthenesPrimeSieve implements PrimeSieve{

    private int maxBound;
    private List<Integer> numbers = new ArrayList<>();

    public EratosthenesPrimeSieve(int maxBound) {
        this.maxBound = maxBound;

        for (int i = 2; i < maxBound; i++) {
            numbers.add(i);
        }
    }

    @Override
    public boolean isPrime(int p) {
        int multiples = p;

        if ((p == 2) || ((p % 2 != 0) && (p > 1))){
            while (multiples <= maxBound){
                multiples = multiples + p;
                numbers.remove((Integer) multiples);
            }
            return true;
        }
        return false;
    }

    @Override
    public void printPrimes() {
        System.out.println(numbers);
        System.out.println(numbers.size());


    }
}
