package Strings;

public class subsequence {
    public static void subSequence(String S1,String S2)
    {
        int n= S1.length();
        int m= S2.length();
        if(n<m){
            System.out.println("no");
        }
        int j=0;
        for(int i=0;(i<n)&&(j<m);i++)
        {
            if(S1.charAt(i)==S2.charAt(j))
            {
                j++;
            }
        }
        if(j==m)
        {
            System.out.println("yes");
        }else
        {
            System.out.println("no");
    }
    }
    public static void main(String args[])
    {
        String S1="ABCDEF";
        String S2="AED";
        subSequence(S1,S2);
    }
}
