package com.test.ctci;

import java.util.HashSet;
import java.util.Set;

public class SearchNode {
    public int value;
    public Set<SearchNode> neighbors;
    public SearchNode(int value) {
        this.value = value;
        neighbors = new HashSet<>();
    }

    public void addNeighbor(SearchNode node) {
        neighbors.add(node);
        node.neighbors.add(this);
    }
}
