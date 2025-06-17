import java.util.ArrayList;
public class AdjacencyList_graph{
    public static void main (String[] args) {
        Graph g=new Graph(4);
        g.addEdge(1,0);
        g.addEdge(2,1);
        g.addEdge(2,0);
        g.addEdge(3,1);
        g.removeEdge(2,1);
        g.printGraph();
    }
}
class Graph {
	ArrayList<ArrayList<Integer>> graph;
	int vertices;
	Graph(int vertices) {
		this.vertices=vertices;
		this.graph=new ArrayList<ArrayList<Integer>>();
		for(int i=0; i<vertices; i++) {
			graph.add(new ArrayList<Integer>());
		}
	}
void addEdge(int src,int dest) {
	if(isValid(src,dest)) {
		graph.get(src).add(dest);
		graph.get(dest).add(src);
	}
	else {
		System.out.println("Invalid src and dest");
	}
}
void removeEdge(int src,int dest) {
	if(isValid(src,dest)) {
		graph.get(src).remove(dest);
		graph.get(dest).remove(src);
	} else {
		System.out.println("Invalid src and dest");
	}
}
public ArrayList<Integer> neighbours(int node) {
	return graph.get(node);
}
boolean ishavingEdge(int src,int dest) {
	if(isValid(src,dest)) {
		ArrayList<Integer> arr=graph.get(src);
		for(int i=0; i<arr.size(); i++) {
			if(arr.get(i)==dest) {
				return true;
			} else {
				return false;
			}
		}
	}
	System.out.println("Invalid src and dest");
	return false;
}
boolean isValid(int src,int dest) {
	return src>=0 && dest>=0 && src<vertices && dest<vertices && src!=dest;
}
void printGraph() {
	for(int i=0; i<vertices; i++) {
		System.out.println(i+":"+graph.get(i));
	}
}
}