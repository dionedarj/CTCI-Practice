package com.test.ctci;

public class Queue {
    public int size;
    public int currentSize;

    private Object[] queueArray;

    public Queue(int size) {
        this.size = size;
        this.currentSize = 0;
        queueArray = new Object[size];
    }

    public boolean enqueue(Object obj) {
        if (currentSize == size) {
            return false;
        }

        queueArray[currentSize] = obj;
        currentSize++;
        return true;
    }

    public Object pop() {
        Object toReturn = queueArray[0];
        shift();
        return toReturn;
    }

    public void printQueue() {
        System.out.println("Printing Queue");
        for (int i = 0; i < currentSize; i++) {
            System.out.println(queueArray[i]);
        }
    }

    private void shift() {
        for (int i = 0; i < currentSize- 1; i++) {
            queueArray[i] = queueArray[i+1];
        }
        currentSize--;
    }
}
