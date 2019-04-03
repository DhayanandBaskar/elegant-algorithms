package dataStructures.trie;

public class TrieRecursion extends Trie {

    @Override
    public void insert(String word) {
        insert(word, root, 0);
    }

    private void insert(String word, Node node, int index) {
        if (word.length() == index) {
            node.end = true;
            return;
        }

        char currentChar = word.charAt(index);
        Node child = node.children.get(currentChar);
        if (child == null) {
            child = new Node();
            node.children.put(currentChar, child);
        }

        child.count++;
        insert(word, child, ++index);
    }

    @Override
    public boolean isPresent(String word) {
        return isPresent(word, root, 0);
    }

    private boolean isPresent(String word, Node node, int index) {
        if (word.length() == index) {
            return node.end;
        }

        char currentChar = word.charAt(index);
        if (node.children.containsKey(currentChar)) {
            return isPresent(word, node.children.get(currentChar), ++index);
        } else {
            return false;
        }
    }

    @Override
    public int findCount(String word) {
        return findCount(word, root, 0);
    }

    public void delete(String word) {
        delete(word, root, 0);
    }

    private boolean delete(String word, Node node, int index) {
        if (word.length() == index) {
            if (!node.end) {
                return false;
            }
            node.end = false;
            return node.children.size() == 0;
        }
        char currentChar = word.charAt(index);
        Node child = node.children.get(currentChar);
        if (child == null) {
            return false;
        }
        boolean shouldDeleteCurrentNode = delete(word, child, ++index);
        if (shouldDeleteCurrentNode) {
            node.children.remove(currentChar);
            return node.children.size() == 0;
        }
        return false;
    }

    private int findCount(String word, Node node, int index) {
        if (word.length() == index) {
            return node.count;
        }

        char currentChar = word.charAt(index);
        if (node.children.containsKey(currentChar)) {
            return findCount(word, node.children.get(currentChar), ++index);
        } else {
            return 0;
        }
    }
}
