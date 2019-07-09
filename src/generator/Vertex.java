package generator;

import java.util.ArrayList;

public class Vertex {
	public int id;
	public int val;
	public ArrayList<Edge> edges;
	
	
	public Vertex(int i, int v){
		id =i;
		val = v;
		edges = new ArrayList<Edge>();
	}
	
	public void addEdge(int val, int to){
		edges.add(new Edge(val,to));	
	}
	
	public String toString(){
		String res = "{" + id + "," + val +"," +"[";
		for(int i =0;i<edges.size();i++){
			res+= edges.get(i).toString();
			if(i < (edges.size()-1)) res+=",";
		}
		res+= "]}";
		return res;
	}
}
