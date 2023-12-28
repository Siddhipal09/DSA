package Matrix;

public class spiral {
       public static void spiralTraversal(int arr[][],int R,int C)
       {
         int top=0;
         int right= C-1;
         int bottom= R-1;
         int left= 0;
         while(top<=bottom && left<=right)
         {
            for(int i=left;i<=right;i++)// top row
            {
                System.out.print(arr[top][i]+" ");

            }top++;
            for(int i=top;i<=bottom;i++)//right column
            {
                System.out.print(arr[i][right]+" ");
            }right--;
            if(top<=bottom){
            for(int i= right;i>=left;i--)//bottom row(reverse order)
            {
                System.out.print(arr[bottom][i]+" ");
            }bottom--;}
          else  if(left<=right)
            {
                for(int i=bottom;i>=top;i--)//left column(reverse order)
                {
                    System.out.print(arr[i][left]+" ");
                }left++;

            }
       }
    }
       public static void main(String args[])
       {
        int[][] arr={{1,2,3,4},{5,6,7,8},{9,10,11,12}};
         int R=3;
         int C=4;
         spiralTraversal(arr,R,C);
       }
    }

