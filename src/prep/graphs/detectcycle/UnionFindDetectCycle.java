package prep.graphs.detectcycle;

import java.util.ArrayList;
import java.util.List;

 class UnionFindDetectCycle {
    private int vertices;
    private List<Edge> edges;

    public UnionFindDetectCycle(int vertices) {
        this.vertices = vertices;
        this.edges = new ArrayList<>();
    }

    public void addEdge(int u, int v) {
        edges.add(new Edge(u, v));
    }

    class Edge {
        int src, dest;

        Edge(int src, int dest) {
            this.src = src;
            this.dest = dest;
        }
    }

    class Subset {
        int parent, rank;
    }

    int find(Subset subsets[], int i) {
        if (subsets[i].parent != i)
            subsets[i].parent = find(subsets, subsets[i].parent);

        return subsets[i].parent;
    }

    void union(Subset subsets[], int x, int y) {
        int xroot = find(subsets, x);
        int yroot = find(subsets, y);

        if (subsets[xroot].rank < subsets[yroot].rank)
            subsets[xroot].parent = yroot;
        else if (subsets[xroot].rank > subsets[yroot].rank)
            subsets[yroot].parent = xroot;
        else {
            subsets[xroot].parent = yroot;
            subsets[yroot].rank++;
        }
    }

    boolean isCyclic() {
        Subset[] subsets = new Subset[vertices];
        for (int i = 0; i < vertices; i++) {
            subsets[i] = new Subset();
            subsets[i].parent = i;
            subsets[i].rank = 0;
        }

        for (Edge edge : edges) {
            int x = find(subsets, edge.src);
            int y = find(subsets, edge.dest);

            if (x == y)
                return true;

            union(subsets, x, y);
        }
        return false;
    }




    public static void main(String[] args) {
        UnionFindDetectCycle graph = new UnionFindDetectCycle(5);

        graph.addEdge(0, 1);
        graph.addEdge(1, 2);
        graph.addEdge(2, 0);
        graph.addEdge(1, 3);
        graph.addEdge(3, 4);

        if (graph.isCyclic()) {
            System.out.println("The graph contains a cycle.");
        } else {
            System.out.println("The graph does not contain a cycle.");
        }
    }
}
