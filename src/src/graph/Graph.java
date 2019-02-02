package src.graph;
//import java.util.Scanner;
import java.util.ArrayList;

public class Graph {
    protected int n;
    protected String name;
    protected ArrayList<Vertex> ver = new ArrayList<Vertex>();
    protected ArrayList<Edge> edg = new ArrayList<Edge>();
    
    //Thuoc tinh thu cap
    
    boolean isTree;
    boolean isDirected;
    boolean isWeighted;
    boolean hasLoops;
	
    public Graph() {
        
    }
	
    public Graph(ArrayList<Vertex> VertexList) {
        System.out.println("Added");
        for (Vertex v : VertexList) {
            ver.add(v);
            System.out.println("Added");
        }
    }
    
    public void addVertex(Vertex v) {
    	ver.add(v);
    }
    
    public void addVertex(String name) {
    	Vertex v = new Vertex(name);
        ver.add(v);
    }
    
    public void addVertexList(ArrayList<String> sList) {
    	ArrayList<Vertex> vList = new ArrayList<Vertex>();
    	for(String s : sList) {
    		Vertex v = new Vertex(s);
    		vList.add(v);
    	}
        ver.addAll(vList);
    }
    
    public Vertex getVer(String name) { //return vertex obj reference from its string name
    	for (Vertex v : ver) {
    		if (v.getName() == name) {
    			return v;
    		}
    	}
    	return null;
    }
    
    public ArrayList<Vertex> getVerList () {
    	return ver;
    }
    
    public void addEdge(String name, Vertex v1, Vertex v2) {
        
        Edge e = new Edge(v1, v2);
        edg.add(e);
        v1.adja.add(v2);
        v2.adja.add(v1);
    }
    
    public void addEdge(Vertex v1, Vertex v2) {
        
        Edge e = new Edge(v1, v2);
        edg.add(e);
        v1.adja.add(v2);
        v2.adja.add(v1);
    }
    
    public void addEdge(String name1, String name2) {
    	//boolean v1isExist, v2isExist;
    	Vertex v1 = getVer(name1);
    	Vertex v2 = getVer(name2);
    	if (v1 != null && v2 != null) { //v1 and v2 are both exist
    		Edge e = new Edge(v1, v2);
    		edg.add(e);
    		v1.adja.add(v2);
    		v2.adja.add(v1);
    	}
    	else {
    		System.out.println("Check your two vertices existence");
    	}
    }
    
    public boolean adjacent(Vertex v1, Vertex v2) { //check2pointsAdjacent
        for (Vertex v : v2.adja){
            if (v == v1)
                return true;
        }
        return false;
    }
    
    public void BFS(Vertex v1) {
        //ArrayList<Vertex> S = new ArrayList<Vertex>();
        //S: set of vertices which belongs to BFS tree
    }
    
    /*Path DFS(Vertex v1) { //phuong thuc khoi tao 1 cay dfs
        //Cach2: Su dung kieu void va tao 1 doi tuong path "p"
         => p se bi huy khi DFS ket thuc
        //
        Path p = new Path();
        ArrayList<Vertex> S = new ArrayList<Vertex>();
        //S: set of vertices which belongs to DFS tree
        S.add(v1); //visit v1
        //visit v1 by add it to the set. Any vertex which has alredy
        //been in S is the vertex has been VISITED
        
        return p;
    }*/
}
