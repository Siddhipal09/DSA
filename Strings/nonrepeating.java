package Strings;

import java.util.Arrays;

public class nonrepeating {
      //    public static void nonRepeating(String str)
      //    {
      //      for(int i=0;i<str.length();i++)
      //      {
      //          boolean flag= false;
      //          for(int j=0;j<str.length();j++)
      //          {
      //              if(i!=j&& str.charAt(i)==str.charAt(j))
      //              {
      //                  flag=true;
      //                  break;
      //              }
      //          }
      //          if(flag==false)
      //          {
      //          System.out.println(i);
      //          break;
      //          } 
      //      }
      //    }
      //better solution
    //  static final int CHAR=256;
    //  public static void nonRepeating(String str)
    //  {
    //    int[] count= new int[CHAR];
    //     for(int i=0;i<str.length();i++)
    //     {
    //      count[str.charAt(i)]++;
    //     }
    //     for(int i=0;i<str.length();i++)
    //     {
    //      if(count[str.charAt(i)]==1)
    //      {
    //       System.out.println(i);
    //       return;
    //      }
    //    }
    //    System.out.println("-1");
    //  }
    //efficient solution
      static final int CHAR=256;
       public static void nonRepeating(String str)
       {
        int[] fI= new int[CHAR];
        Arrays.fill(fI,-1);
        for(int i=0;i<str.length();i++)
        {
          if(fI[str.charAt(i)]==-1)
          {
            fI[str.charAt(i)]=i;
          }
          else{
            fI[str.charAt(i)]=-2;
          }
        }
        int res=Integer.MAX_VALUE;
        for(int i=0;i<CHAR;i++)
        {
          if(fI[i]>=0)
          {
            res=Math.min(res,fI[i]);
          }
        }
          if(res==Integer.MAX_VALUE)
          {
            System.out.println("-1");
           }else{
           System.out.println(res);
        }
      
        
       }
      
          public static void main(String args[])
          {
            String str="geeks for geeks";
            nonRepeating(str);
          }
}
