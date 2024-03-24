package Strings;

public class pattern {
    public static void patSearching(String txt, String pat)
    {
        int m= pat.length();
        int n= txt.length();
        for(int i=0;i<=n-m;i++)
        {   
            int j;
            for( j=0;j<m;j++)
            {
                if(pat.charAt(j)!=txt.charAt(i+j))
                break;
                
            }
            if(j==m)
            {
                System.out.println(i+" ");
            }
        }
    }
 
    public static void main(String args[])
    {
        String txt="AAAAA";
        String pat="AAA";
        patSearching(txt,pat);
    }
}
