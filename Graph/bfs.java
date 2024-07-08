package Graph;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class bfs {
    static void BFS(ArrayList<ArrayList<Integer>>adj, int v, int s)
    {
        boolean[] visited = new boolean[v];
        Queue<Integer> q= new LinkedList<Integer>();
        visited[s] = true;
        q.add(s);
        while(q.isEmpty()== false)
        {
            int u= q.poll();
            System.out.print(u+" ");
            for(int i: adj.get(u))
            {
                if(visited[i]== false)
                {
                    visited[i]= true;
                    q.add(i);
                }
            }
        }
    }
    static void addEdge(ArrayList<ArrayList<Integer>>adj, int u, int v)
    {
        adj.get(u).add(v);
        adj.get(v).add(u);
    }
    public static void main(String[] args) {
        int v=6;
        int s=0;
        ArrayList<ArrayList<Integer>> adj = new ArrayList<ArrayList<Integer>>(v);
        for(int i=0;i<v; i++)
        adj.add(new ArrayList<Integer>());
        addEdge(adj,0,1);
        addEdge(adj,0,2);
        addEdge(adj,0,5);
        addEdge(adj,1,3);
        addEdge(adj,3,5);
        addEdge(adj,2,4);
        addEdge(adj,4,5);
        BFS(adj, v, s);
    }
}
