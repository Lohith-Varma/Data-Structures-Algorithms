import java.util.*;

class Graph {
    private int V;
    private int[][] matrix;

    Graph(int V) {
        this.V = V;
        matrix = new int[V][V];
    }

    void addEdge(int u, int v) {
        matrix[u][v] = 1;
        matrix[v][u] = 1; //Undirected

    }

    void printGraph() {
        for(int i=0; i<V; i++) {
            for(int j=0; j<V; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}


public class Implementation {
    public static void main(String[] args) {
        Graph g = new Graph(4);

        g.addEdge(0,1);
        g.addEdge(0,2);
        g.addEdge(1,2);
        g.addEdge(2,3);

        g.printGraph();
    }
}
