package Stack;

import java.util.ArrayList;
import java.util.Stack;

public class nextgreaterelement {
    // static void nextGreater(int arr[])
    // {
    // int n= arr.length;
    // for(int i=0;i<n;i++)
    // {
    // int j;
    // for(j= i+1;j<n;j++)
    // {
    // if(arr[j]> arr[i])
    // {
    // System.out.print(arr[j]+" ");
    // break;
    // }
    // }
    // if(j==n)
    // System.out.print("-1"+" ");
    // }
    // }
    // efficient solution
    static ArrayList<Integer> nextGreater(int arr[]) {
        int n = arr.length;
        ArrayList<Integer> al = new ArrayList<Integer>();
        Stack<Integer> s = new Stack<Integer>();
        s.push(arr[n - 1]);
        // System.out.print("-1"+" ");
        al.add(-1);
        for (int i = n - 2; i >= 0; i--) {
            while (s.isEmpty() == false && s.peek() <= arr[i])
                s.pop();

            int ng = s.isEmpty() ? -1 : s.peek();
            // System.out.print(ng+" ");
            al.add(ng);
            s.push(arr[i]);
        }
        ArrayList<Integer> result = new ArrayList<>();
        for (int i = al.size() - 1; i >= 0; i--) {
            result.add(al.get(i));
        }

        return result;
    }

    

    public static void main(String args[]) {
        int arr[] = { 5, 15, 10, 8, 6, 12, 9, 18 };
        ArrayList<Integer> result = nextGreater(arr);
        System.out.println(result);
    }
}
