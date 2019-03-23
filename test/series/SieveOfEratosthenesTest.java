package series;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

public class SieveOfEratosthenesTest {

    @Test
    public void shouldPrintPrimeNumbersTillGivenInput() {
        SieveOfEratosthenes sieve = new SieveOfEratosthenes();
        Integer[] expected = {2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97};
        List<Integer> primes = sieve.primes(100);
        Integer[] result = new Integer[primes.size()];
        result = primes.toArray(result);
        assertArrayEquals(expected, result);
    }

    @Test
    public void shouldReturnEmptyListWhenInvokedByZero() {
        SieveOfEratosthenes sieve = new SieveOfEratosthenes();
        List<Integer> primes = sieve.primes(0);
        assertEquals(0, primes.size());
    }
}