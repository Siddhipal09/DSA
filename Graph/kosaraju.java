package Graph;

import java.util.ArrayList;
import java.util.Stack;

public class kosaraju {
    static ArrayList<ArrayList<Integer>> kosarajuAlgo(ArrayList<ArrayList<Integer>>adj, int v)
    {
        Stack<Integer> st = new Stack<Integer>();
        boolean[] visited = new boolean[v];
        for(int i=0;i<v;i++)
        {
            if(visited[i]== false)
            {
                fillOrder(i, st, adj, visited);
            }
        }
          ArrayList<ArrayList<Integer>> transposedGraph = transposeGraph(adj, v);
          visited = new boolean[v];
          ArrayList<ArrayList<Integer>> sccList = new ArrayList<>();
        while(st.isEmpty()== false)
        {
           
            int s= st.pop();
             if(visited[s]==false)
             {
            ArrayList<Integer>scc = new ArrayList<>();
             dfs(s, transposedGraph, visited, scc);
             sccList.add(scc);
             }
        }
         return sccList;
    }
      static void fillOrder(int v, Stack<Integer> st, ArrayList<ArrayList<Integer>>adj, boolean visited[])
      {
        visited[v]= true;
        for(int neighbor: adj.get(v))
        {
            if(visited[neighbor]==false)
            fillOrder(neighbor, st, adj, visited);
        
      }
      st.push(v);
}
   static ArrayList<ArrayList<Integer>> transposeGraph(ArrayList<ArrayList<Integer>> adj, int v) {
        ArrayList<ArrayList<Integer>> transposedGraph = new ArrayList<>(v);
        for (int i = 0; i < v; i++) {
            transposedGraph.add(new ArrayList<>());
        }
        for (int i = 0; i < v; i++) {
            for (int neighbor : adj.get(i)) {
                transposedGraph.get(neighbor).add(i);
            }
        }
        return transposedGraph;
    }
    static void dfs(int v, ArrayList<ArrayList<Integer>> adj, boolean[] visited, ArrayList<Integer> scc) {
        visited[v] = true;
        scc.add(v);
        for (int neighbor : adj.get(v)) {
            if (!visited[neighbor]) {
                dfs(neighbor, adj, visited, scc);
            }
        }
    }
     public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        int v = 5;
        for (int i = 0; i < v; i++) {
            adj.add(new ArrayList<>());
        }

        adj.get(0).add(1);
        adj.get(1).add(2);
        adj.get(1).add(3);
        adj.get(2).add(0);
        adj.get(3).add(4);

        ArrayList<ArrayList<Integer>> sccs = kosarajuAlgo(adj, v);
        System.out.println("Strongly Connected Components:");
        for (ArrayList<Integer> scc : sccs) {
            System.out.println(scc);
        }
}
}

