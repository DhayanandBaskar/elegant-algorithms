package dataStructures.trie;

import java.util.HashMap;

/**
 * Time Complexity
 * l -> average length of strings
 * n -> number of strings
 * Insert - O(l*n)
 * Search - O(l)
 *
 * A data structure that trades store for speed.
 * Real time example: search auto complete or suggestions
 */

public class Trie {

    protected Node root;

    Trie() {
        root = new Node();
    }

    protected class Node {
        boolean end;
        int count;
        HashMap<Character, Node> children;

        Node() {
            children = new HashMap<>();
        }
    }

    public void insert(String word) {
        Node current = root;
        for(int i = 0; i < word.length(); i++) {
            char c = word.charAt(i);
            if(!current.children.containsKey(c)) {
                current.children.put(c, new Node());
            }
            current = current.children.get(c);
            current.count++;
        }
        current.end = true;
    }

    public boolean isPresent(String word) {
        Node current = root;
        for(int i = 0; i < word.length(); i++) {
            char c = word.charAt(i);
            if(!current.children.containsKey(c)) {
                return false;
            }
            current = current.children.get(c);
        }
        return current.end;
    }

    public int findCount(String word) {
        Node current = root;
        for(int i = 0; i < word.length(); i++) {
            char c = word.charAt(i);
            if(!current.children.containsKey(c)) {
                return 0;
            }
            current = current.children.get(c);
        }
        return current.count;
    }
}
