package dataStructures.trie;

import org.junit.Test;

import static org.junit.Assert.*;

public class TrieRecursionTest {

    @Test
    public void shouldBeAbleToAddMultipleWordsAndTestIfTheyArePresent() {
        Trie trie = new TrieRecursion();

        trie.insert("application");
        trie.insert("apple");
        trie.insert("app");
        trie.insert("ice");
        trie.insert("day");
        trie.insert("dream");
        trie.insert("dreamer");

        assertTrue(trie.isPresent("application"));
        assertTrue(trie.isPresent("apple"));
        assertTrue(trie.isPresent("dreamer"));
        assertTrue(trie.isPresent("ice"));
        assertTrue(trie.isPresent("app"));
    }

    @Test
    public void shouldReturnCountOfWordsThatStartWithTheGivenWord() {
        Trie trie = new TrieRecursion();
        trie.insert("application");
        trie.insert("apple");
        trie.insert("app");
        trie.insert("ice");

        assertEquals(3, trie.findCount("app"));
    }

    @Test
    public void shouldDeleteWordFromTrie() {
        TrieRecursion trie = new TrieRecursion();

        trie.insert("app");
        trie.insert("application");
        trie.insert("apple");
        trie.insert("ice");

        assertTrue(trie.isPresent("apple"));
        trie.delete("apple");
        assertFalse(trie.isPresent("apple"));
    }
}