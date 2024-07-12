package Graph;

import java.util.Arrays;

public class dijkstra {
    static int[] dijkstraAlgo(int graph[][], int s)
    {
        int V= graph.length;
        int[] dist= new int[V];
        Arrays.fill(dist, Integer.MAX_VALUE);
        dist[s]=0;
        boolean[] fin = new boolean[V];
        for(int count=0;count<V-1;count++)
        {
            int u=-1;
            for(int i=0;i<V;i++)
            {
                if(!fin[i]&&(u==-1 || dist[i]<dist[u]))
                u=i;
            }
            fin[u]=true;
            for(int v=0;v<V;v++)
            {
                if(!fin[v] && graph[u][v]!=0)
                dist[v]= Math.min(dist[v], dist[u]+ graph[u][v]);
            }
        }
        for(int i=0;i<V;i++)
        {
            System.out.print(dist[i] +" ");
            
        }
        return dist;
    }
    public static void main(String[] args) {
        int[][] graph={{0,5,10,0},{5,0,3,20},{10,3,0,2},{0,20,2,0}};
        int s=0;
         dijkstraAlgo(graph,s);
       
    }
}
