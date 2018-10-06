package com.test.ctci;

import java.util.*;

public class DFS {
    public SearchNode root;
    public Stack<SearchNode> stack;
    public Set<SearchNode> visited;
    public DFS(SearchNode root) {
        this.root = root;
        stack = new Stack<>();
        visited = new HashSet<>();
    }

    public SearchNode find(int value) {
        stack.push(root);
        SearchNode temp = root;
        while (temp.value != value && !stack.empty()) {
            temp = stack.pop();
            if (temp.value == value) {
                return temp;
            }
            if (!visited.contains(temp)) {
                System.out.println("Visiting node with value: " + temp.value);
                visited.add(temp);
                for (SearchNode d: temp.neighbors) {
                    stack.push(d);
                }
            }
        }
        return null;
    }

}
