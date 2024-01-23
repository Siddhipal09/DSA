package Strings;

public class palindrome {
    public static void isPal(String str)
    {
        StringBuilder rev= new StringBuilder(str);
        rev.reverse();
        System.out.println(str.equals(rev.toString()));
    }
    public static void main(String args[])
    {
       String str= "ABBA";
       isPal(str); 
    }
}
