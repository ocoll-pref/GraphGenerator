package generator;

public class Edge {
	public int value;
	public int to;
	
	public Edge(int v, int t){
		value = v;
		to = t;
	}
	public String toString(){
		String res = "{" + value + "," + to + "}";
		return res;
	}
}
