package Stack;

import java.util.Stack;

public class previousgreater {
 //  static void printPreviousGreater(int arr[])
 //   {
 //       int n= arr.length;
 //       for(int i=0;i<n;i++)
 //       {
 //           int j;
 //           for(j=i-1;j>=0;j--)
 //           {
 //               if(arr[j]> arr[i])
 //               {
 //                   System.out.print(arr[j]+" ");
 //                   break;
 //               }
 //           }
 //           if(j==-1)
 //           {
 //                System.out.print("-1"+" ");
 //           }
 //       }
 //   }
 //efficient solution
     static void printPreviousGreater(int arr[])
     {
        int n= arr.length;
        Stack<Integer> s= new Stack<Integer>();
        s.push(arr[0]);
        System.out.print("-1"+" ");
        for(int i=1;i<n;i++)
        {
            while(s.isEmpty()== false&& s.peek()<= arr[i])
            s.pop();
        
        int pg= s.isEmpty()?-1:s.peek();
        System.out.print(pg+" ");
        s.push(arr[i]);
     }
    }
    public static void main(String args[])
    {
       int arr[] = {20, 30, 10, 5, 15};
       printPreviousGreater(arr);
    }
}
