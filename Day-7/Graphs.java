public class Graphs{
    public static void main (String[] args) {
        Graph g=new Graph(4,true);
        g.addEdge(1,2);
        g.addEdge(2,3);
        g.addEdge(0,1);
        g.addEdge(3,1);
        g.printGraph();
        
    }
}
class Graph{
    int[][] graph;
    int vertices;
    boolean isDirect;
    Graph(int vertices,boolean isDirect){
        this.vertices=vertices;
        this.isDirect=isDirect;
        this.graph=new int[vertices][vertices];
    }
    void addEdge(int src,int dest){
        if(isVaild(src,dest)){
            graph[src][dest]=1;
            if(!isDirect)
                graph[dest][src]=1;
        }
        else{
            return;
        }
    }
    void remEdge(int src,int dest){
        if(isVaild(src,dest)){
            graph[src][dest]=0;
            if(!isDirect)
                graph[dest][src]=0;
        }
        else{
            System.out.println("Invalid");
        }
    }
    boolean isConnect(int src,int dest){
        if(graph[src][dest]==1 && graph[dest][src]==1) return true;
        else return false;
    }
    boolean isVaild(int src,int dest){
        if(src>=0 && src<vertices && dest>=0 && dest< vertices && src!=dest) return true;
        else return false;
    }
    void printGraph(){
        for(int i=0;i<vertices;i++){
            for (int j=0;j<vertices;j++){
                System.out.print(graph[i][j]);
            }
            System.out.println("");
        }
    }
}