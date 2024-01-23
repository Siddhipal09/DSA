package Strings;

public class palindrome {
   // public static void isPal(String str)
   // {
   //     StringBuilder rev= new StringBuilder(str);
   //     rev.reverse();
   //     System.out.println(str.equals(rev.toString()));
   // }
   //efficient solution
   public static void isPal(String str)
   {
    int begin=0;
    int end= str.length()-1;
    while(begin<end)
    {
        if(str.charAt(begin)!= str.charAt(end))
        {
            System.out.println("no");
        }
        begin++;
        end--;
    }
    System.out.println("yes");
   }
    public static void main(String args[])
    {
       String str= "ABBA";
       isPal(str); 
    }
}
