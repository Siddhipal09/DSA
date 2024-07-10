package Graph;

import java.util.ArrayList;
//undirected graph
public class detectcycle {
    static boolean DFSRec(ArrayList<ArrayList<Integer>>adj, int s, boolean visited[], int parent)
    {
        visited[s] = true;
        for(int u: adj.get(s))
        {
            if(visited[u]==false)
            {
               if (DFSRec(adj, u, visited, s)== true)
               return true;
            }
            else if(u!= parent)
             return true;
        }
        return false;
    }
    static boolean DFS(ArrayList<ArrayList<Integer>>adj, int v)
    {
        boolean[] visited = new boolean[v];
        for(int i=0;i<v;i++)
        {
            if(visited[i]== false)
            if(DFSRec(adj, i, visited, -1)== true)
            return true;
           
        }
         return false;
    }
    static void addEdge(ArrayList<ArrayList<Integer>>adj, int u, int v)
    {
        adj.get(u).add(v);
        adj.get(v).add(u);
    }
    public static void main(String[] args) {
         int v=6;
        ArrayList<ArrayList<Integer>> adj = new ArrayList<ArrayList<Integer>>(v);
        for(int i=0;i<v; i++)
        adj.add(new ArrayList<Integer>());
        addEdge(adj,0,1);
        addEdge(adj,1,2);
        addEdge(adj,1,3);
        addEdge(adj,2,3);
        addEdge(adj,2,4);
        addEdge(adj,4,5);
       boolean result= DFS(adj, v);
       System.out.println(result);
    }
}
