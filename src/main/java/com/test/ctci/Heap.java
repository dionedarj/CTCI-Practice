package com.test.ctci;

public class Heap {
    private int[] heapArray;
    private int currentSize;
    private int capacity;

    public Heap(int capacity) {
        heapArray = new int[capacity];
        currentSize = 0;
        capacity = 0;
    }

    private int parent(int child) {
        return (child - 1)/2;
    }


    
}
