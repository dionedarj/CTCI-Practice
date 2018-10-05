package com.test.ctci;

import java.util.*;

public class DFS {
    public DFSNode root;
    public Stack<DFSNode> stack;
    public Set<DFSNode> visited;
    public DFS(DFSNode root) {
        this.root = root;
        stack = new Stack<>();
        visited = new HashSet<>();
    }

    public DFSNode find(int value) {
        stack.push(root);
        DFSNode temp = root;
        while (temp.value != value && !stack.empty()) {
            temp = stack.pop();
            if (temp.value == value) {
                return temp;
            }
            if (!visited.contains(temp)) {
                System.out.println("Visiting node with value: " + temp.value);
                visited.add(temp);
                for (DFSNode d: temp.neighbors) {
                    stack.push(d);
                }
            }
        }
        return null;
    }

}

class DFSNode {
    public int value;
    public Set<DFSNode> neighbors;
    public DFSNode(int value) {
        this.value = value;
        neighbors = new HashSet<>();
    }

    public void addNeighbor(DFSNode node) {
        neighbors.add(node);
        node.neighbors.add(this);
    }
}
