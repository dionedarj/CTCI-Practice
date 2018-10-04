package com.test.ctci;

import java.util.HashMap;
import java.util.Map;

public class Trie {
    public TrieNode root;

    public Trie() {
        root = new TrieNode(null);
    }

    public Object getValue(String word) {
        TrieNode node = root;
        for (int i  = 0; i < word.length(); i++) {
            node = node.children.get(word.charAt(i));
            if (node == null) {
                return null;
            }
        }
        return node.value;
    }

    public void insert(String word, Object val) {
        TrieNode node = root;
        for (int i = 0; i < word.length(); i++) {
            TrieNode next = node.children.get(word.charAt(i));
            if (next == null) {
                next = new TrieNode(null);
                node.children.put(word.charAt(i), next);
            }
            node = next;
        }
        node.value = val;
    }

}


class TrieNode {
    public Map<Character, TrieNode> children;
    public Object value;

    public TrieNode(Object value) {
        children = new HashMap<>();
        this.value = value;
    }
}
