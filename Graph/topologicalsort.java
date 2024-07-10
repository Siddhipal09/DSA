package Graph;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class topologicalsort {
    static void topologicalSort(ArrayList<ArrayList<Integer>> adj, int v)
    {
        int[] indegree = new int[v];
        for(int i=0;i<v;i++)
        {
            for(int u: adj.get(i))
            {
                indegree[u]++;
            }
        }
        Queue<Integer> q= new LinkedList<Integer>();
         for(int i=0;i<v;i++)
         {
            if(indegree[i]==0)
            q.add(i);
         }
         while(q.isEmpty()== false)
         {
           int u= q.poll();
           System.out.print(u+" ");
           for(int neighbour: adj.get(u)){
             if(--indegree[neighbour]== 0)
             q.add(neighbour);
           }
         }
        
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
        addEdge(adj,0,2);
        addEdge(adj,1,3);
        addEdge(adj,2,3);
        addEdge(adj,3,4);
        addEdge(adj,3,5);
        topologicalSort(adj, v);
    }
}
