package Hashing;
import java.util.HashSet;
public class intersection {
//    public static void intersectionDistinct(int a[], int b[])
//    {
//        int m= a.length;
//        int n= b.length;
//        int res=0;
//        for(int i=0;i<m;i++)
//        {
//            boolean flag= false;
//            for(int j=0;j<i;j++)
//            {
//                if(a[i]==a[j])
//                {
//                    flag= true;
//                    break;
//                }
//            }
//            if(flag==true)
//            {
//                continue;
//            }
//            for(int j=0;j<n;j++)
//            {
//                if(a[i]==b[j])
//                {
//                    res++;
//                    break;
//                }
//            }
//        }
//        System.out.println(res);
//    }
//efficient solution
      public static void intersectionDistinct(int a[], int b[])
      {
        int m= a.length;
        int n= b.length;
        HashSet<Integer> s= new HashSet<Integer>();
        for(int i=0;i<m;i++)
        {
            s.add(a[i]);
        }
       int res=0;
       for(int j=0;j<n;j++)
       {
        if(s.contains(b[j]))
        {
            res++;
            s.remove(b[j]);
        }
       }
       System.out.println(res);
      }
    public static void main(String args[])
    {
        int[] a={10,15,20,15,30,30,5};
        int[] b={30,5,30,80};
        intersectionDistinct(a,b);
    }
}
