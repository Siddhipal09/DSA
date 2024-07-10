package Graph;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class detectcycle2 {
    // directed graph
    // using kahn's algorithm
    static boolean detectCycle(ArrayList<ArrayList<Integer>> adj, int v)
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
         int count=0;
         while(q.isEmpty()== false)
         {
           int u= q.poll();
           System.out.print(u+" ");
           for(int neighbour: adj.get(u)){
             if(--indegree[neighbour]== 0)
             q.add(neighbour);
           }
           count++;
         }
         return(count!=v);
        
    }
    static void addEdge(ArrayList<ArrayList<Integer>>adj, int u, int v)
    {
        adj.get(u).add(v);
    }
    public static void main(String[] args) {
         int v=4;
        ArrayList<ArrayList<Integer>> adj = new ArrayList<ArrayList<Integer>>(v);
        for(int i=0;i<v; i++)
        adj.add(new ArrayList<Integer>());
        addEdge(adj,0,1);
        addEdge(adj,1,2);
        addEdge(adj,2,3);
        addEdge(adj,2,0);
        boolean result= detectCycle(adj, v);
        System.out.println(result);
    }
}


