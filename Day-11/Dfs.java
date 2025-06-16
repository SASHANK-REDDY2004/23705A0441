import java.util.ArrayList;
import java.util.LinkedList;
import java.util.HashSet;
public class Dfs {
	public static void main (String[] args) {
		Graph g=new Graph(5,false);
		g.addEdge(1,0);
		g.addEdge(2,1);
		g.addEdge(3,2);
		g.addEdge(4,1);
		g.addEdge(0,4);
		g.printGraph();
		g.dfs(0,new boolean[5]);

	}
}
class Graph {
	ArrayList<HashSet<Integer>> graph;
	int vertices;
	boolean isDirected;
	Graph(int vertices,boolean isDirected) {
		this.vertices=vertices;
		this.isDirected=isDirected;
		this.graph=new  ArrayList<HashSet<Integer>>();
		for(int i=0; i<vertices; i++) {
			graph.add(new HashSet<>());
		}
	}
	public void addEdge(int src,int dest) {
		if(isValid(src,dest)) {
			this.graph.get(src).add(dest);
			if(!isDirected) {
				this.graph.get(dest).add(src);
			}
		}
		else {
			System.out.println("Invalid source and destination");
		}
	}
	public void remEdge(int src, int dest) {
		if(isValid(src,dest)) {
			this.graph.get(src).remove(dest);
			if(!isDirected) {
				this.graph.get(dest).remove(src);
			}
		}
		else {
			System.out.println("Invalid source and destination");
		}
	}
	boolean isValid(int src,int dest) {
		return(src>=0 && dest>=0 && src<vertices && dest<vertices && src!=dest);
	}
	boolean isHavingEdge(int src,int dest) {
		return this.graph.get(src).contains(dest);
	}
	HashSet<Integer>getNeighbours(int src)throws IndexOutOfBoundsException {
		if(src>=0 && src<vertices) {
			return this.graph.get(src);
		}
		System.out.println("Invalid");
		return this.graph.get(src);
	}
	void printGraph() {
		System.out.println(graph);
	}
	void dfs(int start,boolean[] visited) {
		visited[start]=true;
		System.out.print(start+" ");
		
		HashSet<Integer> neighbours=getNeighbours(start);
		for( int neighbour:neighbours) {
			if(!visited[neighbour]) {
				dfs(neighbour,visited);
			}
		}
	}
}
