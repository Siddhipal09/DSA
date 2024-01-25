package Strings;

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
       static final int CHAR=256;
      public static void leftmost(String str)
      {
        int[] count= new int[CHAR];
        for(int i=0;i<str.length();i++)
        {
            count[str.charAt(i)]++;
        }
        for(int i=0;i<str.length();i++)
        {
            if(count[str.charAt(i)]>1)
            {
                System.out.println(i);
                return;
            }
        }
        System.out.println("-1");
      }
    public static void main(String args[])
    {
        String str="cabbad";
        leftmost(str);

    }
}
