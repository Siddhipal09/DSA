package Stack;

import java.util.Stack;

public class balancedparanthesis {
    static boolean isBalance(String str)
    {
        Stack<Character>s= new Stack<Character>();
        for(int i=0;i< str.length(); i++)
        {
            if(str.charAt(i)=='('|| str.charAt(i)=='{'|| str.charAt(i)=='[')
            s.push(str.charAt(i));
            else
            {
                if(s.isEmpty()== true)
                return false;

            
            else if(matching (s.pop(), str.charAt(i))== false)
            return false;
            
        }
    }
   
    
    return(s.isEmpty()== true);
}
    static boolean matching(char a, char b)
    {
        return((a=='(' && b==')')||(a=='{' && b=='}')||(a=='[' && b==']'));
    }
    public static void main(String args[])
    {
        String str="([])";
       boolean result= isBalance(str);
       System.out.println(result);
    }

}