package Graph;

import java.util.LinkedList;

public class AdjacencyList {

    LinkedList<Integer>[] adj; // Use an array of LinkedList to represent adjacency list

    public AdjacencyList(int nodes){
        this.adj = new LinkedList[nodes];

        for(int i = 0; i < nodes; i++){
            this.adj[i] = new LinkedList<Integer>(); // Initialize each element of the array with an empty LinkedList
        }
    }

    public void addEdge(int u, int v){
        // Since you're implementing an undirected graph, you need to add edges for both u and v
        this.adj[u].add(v);
        this.adj[v].add(u);
    }

    void display(){
        for (int i = 0; i < adj.length; i++) {
            System.out.print("Adjacency list of vertex " + i + ": ");
            for (Integer vertex : adj[i]) {
                System.out.print(vertex + " ");
            }
            System.out.println();
        }

    }

    public static void main(String[] args) {
        AdjacencyList list = new AdjacencyList(4);
        list.addEdge(0,1);
        list.addEdge(1, 2);
        list.addEdge(2, 3);
        list.addEdge(3, 0);

        // Print the adjacency list
        for (int i = 0; i < list.adj.length; i++) {
            System.out.print("Adjacency list of vertex " + i + ": ");
            for (Integer vertex : list.adj[i]) {
                System.out.print(vertex + " ");
            }
            System.out.println();
        }
    }
}
