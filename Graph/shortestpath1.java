package Graph;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
class vPair{
  int vertex;
  int weight;
  vPair(int v, int w)
  {
    vertex = v;
    weight = w;
  }
}
public class shortestpath1 {
    // shortest path in DAG
    static void shortestPath(ArrayList<ArrayList<vPair>>adj, int v, int s)
    {
        int[] dist= new int[v];
        for(int i=0;i<v;i++)
        dist[i]= Integer.MAX_VALUE;
        dist[s]=0;
       ArrayList<Integer> topoOrder = topologicalSort(adj, v);
         for(int u: topoOrder)
         {
            for(vPair neighbour : adj.get(u))
            {
                if(dist[neighbour.vertex] > dist[u] + neighbour.weight)
                {
                    dist[neighbour.vertex] = dist[u] + neighbour.weight;
                }
            }
         }
        for(int i=0;i<v;i++)
        {
            if (dist[i] == Integer.MAX_VALUE) {
                System.out.println("INF");
            } else {
            System.out.print(dist[i]+" ");
        }
    }
       
    }
    static ArrayList<Integer> topologicalSort(ArrayList<ArrayList<vPair>> adj, int v)
    {
        int[] indegree = new int[v];
        for(int i=0;i<v;i++)
        {
            for(vPair pair: adj.get(i))
            {
                indegree[pair.vertex]++;
            }
        }
        Queue<Integer> q= new LinkedList<Integer>();
         for(int i=0;i<v;i++)
         {
            if(indegree[i]==0)
            q.add(i);
         }
         ArrayList<Integer> topoOrder = new ArrayList<>();
         while(q.isEmpty()== false)
         {
           int u= q.poll();
          topoOrder.add(u);
           for(vPair neighbour: adj.get(u)){
             if(--indegree[neighbour.vertex]== 0)
             q.add(neighbour.vertex);
           }
         }
        return topoOrder;
    }
    public static void main(String[] args) {
        int v = 6;
        ArrayList<ArrayList<vPair>> adj = new ArrayList<>(v);

        for (int i = 0; i < v; i++) {
            adj.add(new ArrayList<>());
        }

        adj.get(0).add(new vPair(1, 2));
        adj.get(0).add(new vPair(4, 1));
        adj.get(1).add(new vPair(2, 3));
        adj.get(2).add(new vPair(3, 6));
        adj.get(4).add(new vPair(2, 2));
        adj.get(4).add(new vPair(5, 4));
        adj.get(5).add(new vPair(3, 1));

        int source = 0;
        shortestPath(adj, v, source);
    }
}
