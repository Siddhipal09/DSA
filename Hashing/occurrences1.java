package Hashing;

import java.util.HashMap;

public class occurrences1 {
    public static void printNbyK(int arr[],int k)
    {
        int n= arr.length;
        HashMap<Integer,Integer> m= new HashMap<Integer,Integer>();
        for(int i=0;i<n;i++)
        {
            if(m.containsKey(arr[i]))
            {
                m.put(arr[i],m.get(arr[i])+1);  
            }
            else if(m.size()<(k-1))
            {
                m.put(arr[i],m.getOrDefault(arr[i],0)+1);
            }else{
                for (int key : m.keySet())
                {
                    m.put(key,m.get(key)-1);
                    if(m.get(key)==0){
                        m.remove(key);
                    }
                }
            }
        }
        for (int key : m.keySet())
        {
          if(m.get(key)>n/k)
          {
            System.out.println(key);
          }
        }
    }
    public static void main(String args[])
    {
        int[] arr={30,10,20,20,10,20,30,30};
        int k=4;
        printNbyK(arr,k);
    }
}
