package DataStructures.graph;

public class main {

    public static void main(String[] args) {
        Graph mygraph= new Graph();
        mygraph.addVertex("A");
        mygraph.addVertex("B");
        mygraph.addVertex("C");

        mygraph.addEdge("A","B");
        mygraph.addEdge("A","C");
        mygraph.addEdge("B","C");

        mygraph.removeEdge("A","B");

        mygraph.printGraph();
    }
}
