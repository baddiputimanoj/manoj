 
import java.util.HashSet;

public class App {
    public static void main(String[] args) {
        Graph g = new Graph(5, false);
        g.addEdge(0, 1);
        g.addEdge(0, 2, 5);
        g.addEdge(3, 4);

        System.out.println("Graph edges:");
        for (Edge e : g.graph) {
            System.out.println(e.src + " -> " + e.dest + " (weight: " + e.weight + ")");
        }
    }
}

class Edge {
    int src;
    int dest;
    int weight;

    Edge(int src, int dest, int weight) {
        this.src = src;
        this.dest = dest;
        this.weight = weight;
    }

    Edge(int src, int dest) {
        this(src, dest, 1);
    }
}

class Graph {
    HashSet<Edge> graph;
    int vertices;
    boolean isDirected;

    Graph(int vertices, boolean isDirected) {
        this.vertices = vertices;
        this.isDirected = isDirected;
        graph = new HashSet<>();
    }

    public void addEdge(int src, int dest) {
        addEdge(src, dest, 1);
    }

    public void addEdge(int src, int dest, int weight) {
        if (isValid(src, dest)) {
            Edge e = new Edge(src, dest, weight);
            graph.add(e);
            if (!isDirected) {
                Edge e2 = new Edge(dest, src, weight);
                graph.add(e2);
            }
        } else {
            System.out.println("Invalid edge: " + src + " -> " + dest);
        }
    }

    public boolean isValid(int src, int dest) {
        return src >= 0 && dest >= 0 && src < vertices && dest < vertices && src != dest;
    }
}
p2.java
Displaying p3.java.