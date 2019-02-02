package src.graph;

public class DFS extends Graph {
    
	//String name;
	
    public DFS() {
        
    }
    
    public void DFSVisit(Graph G, Vertex v) { //DFSRecur
        for (Vertex w : G.ver) { //for each vertex w belongs to graph G
            if(!ver.contains(w) && w.isAdjacentTo(v)) { //w is adjacent to v and not
                //yet in p( "p" here means the set T that hold the vertices of the dfs tree
                ver.add(w);
                DFSVisit(G, w);
            }
        }
    }
        
    public DFS(Graph G, Vertex v) {
        ver.add(v);
        DFSVisit(G, v);
    }
}
