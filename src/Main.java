import src.graph.*;

public class Main {
    public static void main(String[] args) {
        
        Graph G = new Graph();
        G.addVertex("a");
        G.addVertex("b");
        G.addVertex("c");
        G.addVertex("d");
        G.addVertex("e");
        G.addVertex("f");
        G.addVertex("g");
        G.addEdge("a", "b");
        G.addEdge("b", "c");
        G.addEdge("b", "d");
        G.addEdge("a", "e");
        G.addEdge("a", "f");
        G.addEdge("f", "g");
        //G.addEdge("d", "e");
        //G.addEdge("e", "g");
        
        Path P = new Path(G, G.getVer("a"), G.getVer("g"));
        DFS D = new DFS(G, G.getVer("a"));
        for (Vertex v : D.getVerList()) {
        	System.out.print(v.getName() + " ");
        }
        
        /*Dice d = new Dice();
        
        
        //Test 1
        if (d.ver.get(1).isAdjacent(d.ver.get(2)))
            System.out.println("v[1] is adjacent to v[2]");
        
        //Test 2
        DFS d1 = new DFS(d.ver.get(1), d);
        
        for (Vertex v1 : d1.ver) {
            System.out.print(v1.name + "  ");
        }
        System.out.println();
        //System.out.print(d1.p.);
        //Test 2.1
        for (Vertex v2 : d.ver) {
            System.out.print(v2.name + "  ");
        }
        System.out.println();
        */
    }
}
