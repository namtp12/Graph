package src.graph;
public class Path extends Graph {
    //String name;
    
    public Path() {
        
    }
    
    public Path(Graph G, Vertex v, Vertex z) {
        //ver.add(v);
        PathVisit(G, v, z);
    }
    
    public void PathVisit(Graph G, Vertex v, Vertex z) { //DFSRecur
        for (Vertex w : G.ver) { //for each vertex w belongs to graph G
            if(!ver.contains(w) && w.isAdjacentTo(v)) { //w is adjacent to v and not
                //yet in p( "p" here means the set T that hold the vertices of the dfs tree
                ver.add(w); //things which this func actually do
                //System.out.println(w.name);
                PathVisit(G, w, z);
            }
            //if z is in the path, the task is complete
            if (ver.contains(z))
            	return;
            //but if no w is adjacent to v, return to father function
            //and delete v from p         
        }
    }
    
    public boolean Comprise(Vertex v) {
        for (Vertex v1 : ver) {
            if (v == v1)
                return true;
        }
        return false;
    }
}
