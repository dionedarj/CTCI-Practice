package com.test.ctci;

public class Node {
    public Node next;
    public int val;

    public Node(int val) {
        this.val = val;
    }

    public static void printNodes(Node node) {
        while (node != null) {
            System.out.println(node.val);
            node = node.next;
        }
    }
}
