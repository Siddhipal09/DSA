package Graph;

import java.util.Arrays;

public class primalgo {
    static int primMST( int graph[][], int v)
    {
        int[] key= new int[v];
        int res=0;
        Arrays.fill(key, Integer.MAX_VALUE);
        key[0]=0;
        boolean[] mSet = new boolean[v];
        for(int count= 0;count<v;count++)
        {
            int u=-1;
            for(int i=0;i<v;i++)
            {
                if(!mSet[i] && (u==-1 || key[i]< key[u]))
                u=i;
            }
                mSet[u]= true;
                res = res+ key[u];
                for(int s=0;s<v;s++)
                {
                    if(!mSet[s] && graph[u][s]!= 0 && graph[u][s] < key[s])
                    key[s]= graph[u][s];
                }
            
        }
        return res;

    }
    public static void main(String[] args) {
        int[][] graph = {{0,5,8,0},{5,0,10,15},{8,10,0,20},{0,15,20,0}};
        int v=4;
        int result= primMST(graph, v);
        System.out.println(result);
    }
}
