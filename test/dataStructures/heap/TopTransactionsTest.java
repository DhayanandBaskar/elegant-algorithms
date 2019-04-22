package dataStructures.heap;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class TopTransactionsTest {

    TopTransactions topTransactions;

    @Before
    public void setup() {
        topTransactions = new TopTransactions(5);
    }

    @Test
    public void WhenNoElementsAdded_ShouldReturnEmptyList() {
        assertEquals(0, topTransactions.find().size());
    }

    @Test
    public void WhenTenTransactionsAreAdded_ShouldReturnTopFive() {
        topTransactions.add(11);
        topTransactions.add(7);
        topTransactions.add(12);
        topTransactions.add(6);
        topTransactions.add(13);
        topTransactions.add(5);
        topTransactions.add(14);
        topTransactions.add(8);
        topTransactions.add(15);
        topTransactions.add(9);
        topTransactions.add(100);

        assertEquals("[12, 13, 14, 15, 100]", topTransactions.find().toString());

        topTransactions.add(81);
        topTransactions.add(47);
        topTransactions.add(99);
        topTransactions.add(1001);

        assertEquals("[47, 81, 99, 100, 1001]", topTransactions.find().toString());
    }
}