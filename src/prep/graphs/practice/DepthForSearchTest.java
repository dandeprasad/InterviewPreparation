package prep.graphs.practice;


import java.util.Iterator;
import java.util.LinkedList;

public class DepthForSearchTest {
    private int V;

    // Array of lists for
    // Adjacency List Representation
    private LinkedList<Integer> adj[];

    // Constructor
DepthForSearchTest(int v)
    {
        V = v;
        adj = new LinkedList[v];
        for (int i = 0; i < v; ++i)
            adj[i] = new LinkedList();
    }

    // Function to add an edge into the graph
    void addEdge(int v, int w)
    {
        // Add w to v's list.
        adj[v].add(w);
    }
void DFSUtil(int vertex,boolean [] visited){


    visited[vertex] = true;
    System.out.print(vertex +" ");
    LinkedList data = adj[vertex];
    Iterator<Integer> iterator = data.iterator();
    while(iterator.hasNext()){
       int vv =  iterator.next();
      if(! visited[vv]){
          DFSUtil(vv,visited)  ;
      }
    }

}
    void DFS(int v)
    {
        // Mark all the vertices as
        // not visited(set as
        // false by default in java)
        boolean visited[] = new boolean[V];

        // Call the recursive helper
        // function to print DFS
        // traversal
        DFSUtil(v, visited);
    }
    public static void main(String args[])
    {
        DepthForSearchTest g = new DepthForSearchTest(4);

        g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(1, 2);
        g.addEdge(2, 0);
        g.addEdge(2, 3);
        g.addEdge(3, 3);

        System.out.println(
                "Following is Depth First Traversal "
                        + "(starting from vertex 2)");

        // Function call
        g.DFS(2);
    }
}
