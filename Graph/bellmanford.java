package Graph;

import java.util.Arrays;

public class bellmanford {
    static void bellmanFord(int graph[][], int s)
    {
      int V= graph.length;
      int[] dist= new int[V];
      Arrays.fill(dist, Integer.MAX_VALUE);
      dist[s]=0;
      for(int count=0;count<V-1;count++)
      {
        for(int u=0;u<V;u++)
        {
            for(int v=0;v<V;v++)
            {
                if(graph[u][v]!=0 &&(dist[v]> (dist[u]+graph[u][v])))
                dist[v]= dist[u]+graph[u][v];
            }
        }

      }
      for(int u=0;u<V;u++)
        {
            for(int v=0;v<V;v++)
            {
                if(graph[u][v]!=0 &&(dist[v]> (dist[u]+graph[u][v])))
                System.out.println("negative cycle exists");
                
            }
        }
        print(dist,V);
    }
    static void print(int dist[], int V)
    {
        for(int i=0;i<V;i++)
        {
            System.out.print(dist[i]+" ");
        }
    }
    public static void main(String[] args) {
        int[][] graph={{0,1,4,0},{0,0,-3,2},{0,0,0,3},{0,0,0,0}};
        int s=0;
        bellmanFord(graph, s);
    }
}
