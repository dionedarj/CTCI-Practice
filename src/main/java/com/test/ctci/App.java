package com.test.ctci;

public class App {
    public static void main( String[] args ) {

        Queue testQueue = new Queue(5);
        testQueue.enqueue("test");
        testQueue.printQueue();
        testQueue.enqueue("help");
        testQueue.enqueue("nope");
        testQueue.enqueue("one");
        testQueue.enqueue("two");
        testQueue.enqueue("full");
        testQueue.printQueue();
        testQueue.pop();
        testQueue.pop();
        testQueue.printQueue();
        testQueue.enqueue("not full");
        testQueue.printQueue();
    }

}
