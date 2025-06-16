import java.util.HashSet;
public class EdgeList_graph {
	public static void main (String[] args) {
		Graph g=new Graph(4,true);
		g.addEdge(1,2);
		g.addEdge(1,0);
		g.addEdge(2,3);
		g.addEdge(2,0);

	}
}
class Edge {
	int src;
	int dest;
	int weight;
	Edge(int src,int dest,int weight) {
		this.src=src;
		this.dest=dest;
		this.weight=weight;
	}
	Edge(int src,int dest) {
		this.src=src;
		this.dest=dest;
		this.weight=1;
	}
}
class Graph {
	HashSet<Edge> graph;
	int vertices;
	boolean isDirected;
	Graph(int vertices,boolean isDirected) {
		this.vertices=vertices;
		this.isDirected=isDirected;
		graph=new HashSet<Edge>();
	}
	public void addEdge(int src,int dest) {
		if(isValid(src,dest)) {
			Edge e=new Edge(src,dest);
			graph.add(e);
			if(!isDirected) {
				Edge e2=new Edge(dest,src);
				graph.add(e2);
			}
		}
		System.out.println("Invalid src and dest");
	}
	public void addEdge (int src,int dest,int weight) {
		if(isValid(src,dest)) {
			Edge e=new Edge(src,dest,weight);
			graph.add(e);
			if(!isDirected) {
				Edge e2=new Edge(dest,src,weight);
				graph.add(e2);
			}
		}
		System.out.println("Invalid src and dest");
	}
	public boolean isValid(int src,int dest) {
		return src>=0 && dest>=0 && src!=dest && src<vertices && dest<vertices;
	}
	public void removeEdge(int src,int dest) {
		if(isValid(src,dest)) {
			graph.remove(src,dest);
			if(!isDirected){
			    graph.remove(dest,src);
			}
		}
		System.out.println("Invalid src and destination");
	}
	public void printGraph() {
			System.out.println(graph);
		}
}


