package src.graph;

public class Edge {
    private String name;
    private Vertex v1 = new Vertex();
    private Vertex v2 = new Vertex();
    private int weight;
    
    public Edge (Vertex v1, Vertex v2) {
        this.v1 = v1;
        this.v2 = v2;
    }
}
