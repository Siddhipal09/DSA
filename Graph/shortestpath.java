package Graph;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class shortestpath {
    static void shortestPath(ArrayList<ArrayList<Integer>>adj, int s, int v)
    {
      int[] dist = new int[v];
      dist[s] = 0;
      boolean[] visited= new boolean[v];
      Queue<Integer> q= new LinkedList<Integer>();
      q.add(s);
      visited[s]= true;
        while(q.isEmpty()== false)
        {
            int u= q.poll();
            for(int i: adj.get(u))
            {
                if(visited[i]==false)
                {
                    dist[i]= dist[u]+1;
                    q.add(i);
                    visited[i]= true;
                }
            }
        }
        for(int i=0;i<v;i++)
        {
            System.out.print(dist[i]+" ");
        }

    }
    static void addEdge(ArrayList<ArrayList<Integer>>adj, int u, int v)
    {
        adj.get(u).add(v);
        adj.get(v).add(u);
    }
    public static void main(String[] args) {
        int v= 4;
        int s=0;
         ArrayList<ArrayList<Integer>> adj = new ArrayList<ArrayList<Integer>>(v);
        for(int i=0;i<v; i++)
        adj.add(new ArrayList<Integer>());
        addEdge(adj, 0, 1);
        addEdge(adj, 0, 2);
        addEdge(adj, 1, 2);
        addEdge(adj, 1, 3);
        addEdge(adj, 2, 3);
        shortestPath(adj, s, v);
    }
}
