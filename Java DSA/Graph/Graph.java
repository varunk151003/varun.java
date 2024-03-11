package Graph;

public class Graph {

    int[][] adjMatrix;
    
    public Graph(int nodes){
        this.adjMatrix = new int[nodes][nodes];

    }

    public void addEdge(int u,int v){
        this.adjMatrix[u][v] = 1;
        this.adjMatrix[v][u] = 1;
    }

    void display(){
        for(int i=0;i<adjMatrix.length;i++){
            for(int j=0;j<adjMatrix.length;j++){
                System.out.print(adjMatrix[i][j]+ " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Graph gh = new Graph(4);

        gh.addEdge(0,1);
        gh.addEdge(1,2);
        gh.addEdge(2,3);
        gh.addEdge(3,0);

        gh.display();
    }
    
}
