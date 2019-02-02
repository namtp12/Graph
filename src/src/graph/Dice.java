package src.graph;
import java.util.ArrayList;

public class Dice extends Graph {
    
    public Dice() {
    	ArrayList<Vertex> v = new ArrayList<Vertex>();
        for (int i = 0; i < 9; i++) {
            Vertex vElem = new Vertex();
            vElem.setName(String.valueOf(i));
            v.add(vElem);
        }
        ver.addAll(v);
        
        addEdge("1", v.get(1), v.get(2));
        addEdge("2", v.get(2), v.get(3));
        addEdge("3", v.get(3), v.get(4));
        addEdge("4", v.get(4), v.get(1));
        addEdge("5", v.get(1), v.get(5));
        addEdge("6", v.get(2), v.get(6));
        addEdge("7", v.get(3), v.get(7));
        addEdge("8", v.get(4), v.get(8));
        addEdge("9", v.get(5), v.get(6));
        addEdge("10", v.get(6), v.get(7));
        addEdge("11", v.get(7), v.get(8));
        addEdge("12", v.get(8), v.get(1));
    }
    
    Dice(ArrayList<Vertex> VertexList) {
        for (Vertex v : VertexList) {
            ver.add(v);
        }
    }
    
}
