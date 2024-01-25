package Strings;

//import java.util.Arrays;

public class anagram {
 //   public static void areAnagram(String S1, String S2)
 //   {
 //       if(S1.length()!=S2.length())
 //       {
 //           System.out.println("not anagram");
 //       }
 //       char a1[]= S1.toCharArray();
 //       Arrays.sort(a1);
 //       S1= new String(a1);
 //       char a2[]= S2.toCharArray();
 //       Arrays.sort(a2);
 //       S2= new String(a2);
 //       System.out.println(S1.equals(S2));
 //   }
 //efficient solution
        static final int CHAR= 256;
        public static void areAnagram(String S1, String S2)
        {
            if(S1.length()!= S2.length())
            {
                System.out.println("false");
                return;
            }
            int[] count= new int[CHAR];
            for(int i=0;i<S1.length();i++)
            {
                count[S1.charAt(i)]++;
                count[S2.charAt(i)]--;
            }
            for(int i=0;i<CHAR;i++)
            {
                if(count[i]!=0)
                {
                    System.out.println("false");
                    return;
                }
                   
            }
            System.out.println("true");
        }
    public static void main(String args[])
    {
        String S1="listen";
        String S2="silent";
        areAnagram(S1, S2);
    }
}
