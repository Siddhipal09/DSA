package Strings;

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
      static final int CHAR=256;
      public static void nonRepeating(String str)
      {
        int[] count= new int[CHAR];
         for(int i=0;i<str.length();i++)
         {
          count[str.charAt(i)]++;
         }
         for(int i=0;i<str.length();i++)
         {
          if(count[str.charAt(i)]==1)
          {
           System.out.println(i);
           return;
          }
        }
        System.out.println("-1");
      }
          public static void main(String args[])
          {
            String str="geeks for geeks";
            nonRepeating(str);
          }
}
