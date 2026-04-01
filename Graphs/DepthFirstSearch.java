import java.util.*;

class Graph {
    private int V;
    private ArrayList<ArrayList<Integer>> adj;

    Graph(int V) {
        this.V = V;
        adj = new ArrayList<>();

        for(int i=0; i<V; i++) {
            adj.add(new ArrayList<>());
        }
    }

    void addEdge(int u, int v) {
        adj.get(u).add(v);
    }

    void DFS(int start) {
        boolean[] visited = new boolean[V];
        Stack<Integer> s = new Stack<>();

        visited[start] = true;
        s.push(start);

        while(!s.isEmpty()) {
            int node = s.pop();
            System.out.print(node + " ");

            for(int neighbour : adj.get(node)) {
                if(!visited[neighbour]) {
                    visited[neighbour] = true;
                    s.push(neighbour);
                }
            }
        }
    }
}

public class DepthFirstSearch {
    public static void main(String[] args) {
        Graph g = new Graph(4);

        g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(1, 2);
        g.addEdge(2, 3);

        System.out.println("DFS Traversal: ");
        g.DFS(0);
    }
}
