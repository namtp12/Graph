package src.graph;
import java.util.ArrayList;

public class Vertex {
    private String name;
    ArrayList<Vertex> adja = new ArrayList<Vertex>();
    
    public Vertex() {
        
    }
    
    public Vertex(String name) {
        this.name = name;
    }
    
    public String getName() {
    	return name;
    }
    /*Visit a vertex then the only thing can be done is return void.
     * That  is useless. For example:
     * (If) visit 1 a vertex from another vertex has been chosen before
     *  will return AN EDGE.
     *  (If) visit n adjacent vertices from another vertex has been chosen 
     *  before will return a (n+1)-edges-path. 
     *  So I decided to write a temp_path method and path class instead of 
     *  writing a visit method. "Temp" means it's temporary and it can be
     *  add to new "path object" with arraylist, if it's nesscessary.
     */
    
    public void setName(String name) {
    	this.name = name;
    }
    
    public boolean isAdjacentTo (Vertex v) {//check if vertex v is adjacent
        for (Vertex v1: adja) {
            if (v == v1)
                return true;
        }
        return false;
    }
}
