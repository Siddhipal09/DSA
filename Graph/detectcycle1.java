package Graph;

import java.util.ArrayList;

public class detectcycle1 {
    // directed graph
    // DFS based solution
    static boolean DFSRec(ArrayList<ArrayList<Integer>>adj, int s, boolean visited[], boolean recst[])
    {
        visited[s]= true;
        recst[s]= true;
        for(int u: adj.get(s))
        {
            if(visited[u]== false)
            {
               if(DFSRec(adj, u, visited, recst) == true)
               return true;
            }
            else if(recst[u]== true)
            {
                return true;
            }
        }
        recst[s] = false;
        return false;
    }
    static boolean DFS(ArrayList<ArrayList<Integer>> adj, int v)
    {
        boolean[] visited= new boolean[v];
        boolean[] recst= new boolean[v];
        for(int i=0;i<v;i++)
        {
            if(visited[i]== false)
            if(DFSRec(adj, i, visited, recst)== true)
            return true;
           
        }
         return false;
    }
    static void addEdge(ArrayList<ArrayList<Integer>>adj, int u, int v)
    {
        adj.get(u).add(v);
        
    }
    public static void main(String[] args) {
        int v=6;
        ArrayList<ArrayList<Integer>> adj = new ArrayList<ArrayList<Integer>>(v);
        for(int i=0;i<v; i++)
        adj.add(new ArrayList<Integer>());
        addEdge(adj,0,1);
        addEdge(adj,2,1);
        addEdge(adj,2,3);
        addEdge(adj,3,4);
        addEdge(adj,4,5);
        addEdge(adj,5,3);
        boolean result= DFS(adj, v);
        System.out.println(result);
    }
}
