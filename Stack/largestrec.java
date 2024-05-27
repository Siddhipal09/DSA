package Stack;

import java.util.Stack;

public class largestrec {
    static void largestRectangle(int Mat[][],int R, int C)
    {
        int res= getMaxArea(Mat[0]);
        for(int i=1;i<R;i++)
        {
            for(int j=0;j<C;j++)
            {
                if(Mat[i][j]==1)
                {
                    Mat[i][j]+=Mat[i-1][j];
                }
            }
            res=Math.max(res,getMaxArea(Mat[i]));
        }
        System.out.println(res);
    }
     static int getMaxArea(int Mat[])
      {
        int n= Mat.length;
        Stack<Integer> s= new Stack<Integer>();
        int res=0;
        for(int i=0;i<n;i++)
        {
            while(s.isEmpty()== false&& Mat[s.peek()]>=Mat[i])
            {
               int tp= s.pop();
               int curr= Mat[tp]*(s.isEmpty()?i:(i-s.peek()-1));
                res= Math.max(res, curr);
            }
            s.push(i);
        }
        while(s.isEmpty()==false)
        {
            int tp= s.pop();
           int curr=Mat[tp]*(s.isEmpty()?n:(n-s.peek()-1));
            res= Math.max(res, curr);
        }
        return res;
      }
      public static void main(String[] args) {
       int[][] Mat={{0,1,1,0},{1,1,1,1},{1,1,1,1},{1,1,0,0}};
       int R=4;
       int C=4;
       largestRectangle(Mat,R,C);
      }
}


