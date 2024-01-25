package Strings;

//import java.util.Arrays;

public class repeating {
//    public static void leftmost(String str)
//    {
//        for(int i=0;i<str.length();i++)
//        {
//            for(int j=i+1;j<str.length();j++)
//            {
//                if(str.charAt(i)==str.charAt(j))
//                {
//                    System.out.println(i);
//                    return;
//                }
//            }
//        }
//        System.out.println("-1");
//    }
//better approach
   //  static final int CHAR=256;
   //   public static void leftmost(String str)
   //   {
   //     int[] count= new int[CHAR];
   //     for(int i=0;i<str.length();i++)
   //     {
   //         count[str.charAt(i)]++;
   //     }
   //     for(int i=0;i<str.length();i++)
   //     {
   //         if(count[str.charAt(i)]>1)
   //         {
   //             System.out.println(i);
   //             return;
   //         }
   //     }
   //     System.out.println("-1");
   //   }
   //efficient solution 1
     //    static final int CHAR=256;
     //    public static void leftmost(String str)
     //    {
     //      int[] fIndex = new int[CHAR];
     //      Arrays.fill(fIndex,-1);
     //      int res= Integer.MAX_VALUE;
     //      for(int i=0;i<str.length();i++)
     //      {
     //       int fi=fIndex[str.charAt(i)];
     //       if(fi==-1)
     //       {
     //           fIndex[str.charAt(i)]=i;  
     //       }else
     //       res= Math.min(res,fi);
     //      }
     //      if(res==Integer.MAX_VALUE)
     //      {
     //       System.out.println("-1");
     //      }else{
     //      System.out.println(res);
     //    }
     //   }
     //efficient solution 2
     static final int CHAR=256;
     public static void leftmost(String str)
     {   
        boolean[] visited= new boolean[CHAR];
        int res=-1;
        for(int i=str.length()-1;i>=0;i--)
        {
            if(visited[str.charAt(i)])
            {
                res=i;
            }else{
                visited[str.charAt(i)]=true;
            }
        }
        System.out.println(res);
     }
    public static void main(String args[])
    {
        String str="cabbad";
        leftmost(str);

    }
}
