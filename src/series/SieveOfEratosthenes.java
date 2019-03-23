package series;

import java.util.ArrayList;
import java.util.List;

/**
 * Time complexity - O(n log log n)
 * Space complexity - O(n)
 */

public class SieveOfEratosthenes {
    public List<Integer> primes(int n) {
        int[] sieve = sieve(n);
        List<Integer> primes = new ArrayList<>();
        for (int i = 2; i < sieve.length; i++)
            if (sieve[i] == 0)
                primes.add(i);
        return primes;
    }

    private int[] sieve(int n) {
        int[] sieve = new int[n + 1];
        for (int i = 2; i < sieve.length; i++)
            if (sieve[i] == 0)
                for (int j = i + i; j < sieve.length; j += i)
                    sieve[j] = 1;
        return sieve;
    }
}
