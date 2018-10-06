package com.test.ctci;

public class App {
    public static void main( String[] args ) {

        SearchNode[] sNodeArray = new SearchNode[20];
        for (int i = 0; i < sNodeArray.length; i++) {
            sNodeArray[i] = new SearchNode(i);
        }

        sNodeArray[0].addNeighbor(sNodeArray[1]);

        sNodeArray[0].addNeighbor(sNodeArray[2]);
        sNodeArray[0].addNeighbor(sNodeArray[3]);
        sNodeArray[1].addNeighbor(sNodeArray[4]);
        sNodeArray[1].addNeighbor(sNodeArray[5]);
        sNodeArray[2].addNeighbor(sNodeArray[5]);
        sNodeArray[2].addNeighbor(sNodeArray[6]);
        sNodeArray[3].addNeighbor(sNodeArray[9]);
        sNodeArray[3].addNeighbor(sNodeArray[8]);
        sNodeArray[7].addNeighbor(sNodeArray[6]);
        sNodeArray[7].addNeighbor(sNodeArray[10]);
        sNodeArray[8].addNeighbor(sNodeArray[15]);
        sNodeArray[12].addNeighbor(sNodeArray[13]);
        sNodeArray[11].addNeighbor(sNodeArray[12]);
        sNodeArray[15].addNeighbor(sNodeArray[18]);
        sNodeArray[18].addNeighbor(sNodeArray[19]);
        sNodeArray[10].addNeighbor(sNodeArray[5]);
        sNodeArray[18].addNeighbor(sNodeArray[11]);


        BFS bfs = new BFS(sNodeArray[0]);
        System.out.println("Found value:" + bfs.find(11));
    }

}
