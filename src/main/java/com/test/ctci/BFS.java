package com.test.ctci;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

public class BFS {
    public SearchNode root;
    public Queue<SearchNode> queue;
    public Set<SearchNode> visited;

    public BFS(SearchNode root) {
        this.root = root;
        queue = new LinkedList<>();
        visited = new HashSet<>();
    }

    public boolean find(int value) {
        SearchNode temp = root;
        queue.offer(temp);
        while (temp.value != value && !queue.isEmpty()) {
            temp = queue.poll();
            if (temp.value == value) {
                System.out.println("Found Value: " + value);
                return true;
            }
            if (!visited.contains(temp)) {
                System.out.println("Visiting Node with Value: " + temp.value);
                for (SearchNode s : temp.neighbors) {
                    queue.offer(s);
                }
                visited.add(temp);
            }

        }
        return false;
    }
}
