package com.test.ctci;

public class BST {
    public BSTNode root;

    public BST(int value) {
        root = new BSTNode(value);
    }
}

class BSTNode {
    public int value;
    public BSTNode left;
    public BSTNode right;

    public BSTNode(int value) {
        this.value = value;
    }

    public BSTNode(int value, BSTNode left, BSTNode right) {
        this.value = value;
        this.left = left;
        this.right = right;
    }
}
