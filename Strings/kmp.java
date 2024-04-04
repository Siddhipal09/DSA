package Strings;

public class kmp {
    public static int longPropPreSuff(String str, int n)
    {
        
        for(int len=n-1;len>0;len--)
        {
            boolean flag=true;
            for(int i=0;i<len;i++)
            {
                if(str.charAt(i)!=str.charAt(n-len+i))
                {
                    flag= false;
                }
            }
            if(flag==true)
            {
              return len;
               // System.out.println(len);
            }
              
        }
        return 0;
    }
    public static void fillLps(String str,int lps[])
    {
        for(int i=0;i<str.length();i++)
        {
            lps[i]= longPropPreSuff(str,i+1);
            System.out.print(lps[i]);
        }
    }
    public static void main(String args[])
    {
        String str="ababacab";
        int[] lps= new int[str.length()];
        fillLps(str,lps);
    }
}
