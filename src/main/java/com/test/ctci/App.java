package com.test.ctci;

public class App {
    public static void main( String[] args ) {

        DFSNode[] dfsArray = new DFSNode[20];
        for (int i = 0; i < dfsArray.length; i++) {
            dfsArray[i] = new DFSNode(i);
        }

        dfsArray[0].addNeighbor(dfsArray[1]);

        dfsArray[0].addNeighbor(dfsArray[2]);
        dfsArray[0].addNeighbor(dfsArray[3]);
        dfsArray[1].addNeighbor(dfsArray[4]);
        dfsArray[1].addNeighbor(dfsArray[5]);
        dfsArray[2].addNeighbor(dfsArray[5]);
        dfsArray[2].addNeighbor(dfsArray[6]);
        dfsArray[3].addNeighbor(dfsArray[9]);
        dfsArray[3].addNeighbor(dfsArray[8]);
        dfsArray[7].addNeighbor(dfsArray[6]);
        dfsArray[7].addNeighbor(dfsArray[10]);
        dfsArray[8].addNeighbor(dfsArray[15]);
        dfsArray[12].addNeighbor(dfsArray[13]);
        dfsArray[11].addNeighbor(dfsArray[9]);

        DFS dfs = new DFS(dfsArray[0]);
        System.out.println("Found value:" + dfs.find(11).value);
    }

}
