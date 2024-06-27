package Heap;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

class Triplet implements Comparable<Triplet>
{
    int val;
    int aPos;
    int vPos;
    Triplet(int v, int ap, int vp)
    {
        val=v;
        aPos=ap;
        vPos=vp;
    }
    public int compareTo(Triplet t)
    {
        if(val<=t.val)
        return -1;
        else
        return 1;
    }
}
public class mergeksort {
    List<Integer> mergeArr(List<List<Integer>>arr)
    {
        List<Integer> res= new ArrayList<Integer>();
        PriorityQueue<Triplet> pq= new PriorityQueue<Triplet>();
        for(int i=0;i<arr.size();i++)
        {
            pq.add(new Triplet(arr.get(i).get(0),i,0));
        }
        while(pq.isEmpty()==false)
        {
            Triplet curr= pq.poll();
            res.add(curr.val);
            int ap= curr.aPos;
            int vp= curr.vPos;
            if(vp+1<arr.get(ap).size())
            pq.add(new Triplet(arr.get(ap).get(vp+1),ap,vp+1));
        }
        return res;
    }
    public static void main(String[] args) {
        List<List<Integer>> arr = new ArrayList<>();
        arr.add(List.of(10, 20, 30));
        arr.add(List.of(5, 15, 25));
        arr.add(List.of(1, 9, 11, 18));

        mergeksort ms = new mergeksort();
        List<Integer> result = ms.mergeArr(arr);

        System.out.println(result);
    }
    }
   
