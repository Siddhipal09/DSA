package Strings;

public class reverse {
    public static void reverseWords(StringBuilder str)
    {
     int n=str.length();
     int start=0;
     for(int end=0;end<n;end++)
     {
        if(str.charAt(end)==' ')
        {
            reverseCharacters(str,start,end-1);
            start= end+1;
        }
     }
     reverseCharacters(str,start,n-1);
     reverseCharacters(str,0,n-1);
     System.out.println(str);
    }
    
    public static void reverseCharacters(StringBuilder str, int low, int high)
     {
                while (low < high)
                 {
                    char temp = str.charAt(low);
                    str.setCharAt(low, str.charAt(high));
                    str.setCharAt(high, temp);
                    low++;
                    high--;
                 }
                }
    public static void main(String args[])
    {
        StringBuilder str = new StringBuilder("Welcome to gfg");
        reverseWords(str);
    }
}
