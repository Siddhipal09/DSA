package Matrix;

public class rotatematrix {
      //  public static void rotateMatrix(int arr[][])
      //  { 
      //      int n=3;
      //      int[][] temp = new int[n][n];
      //      for(int i=0;i<arr.length;i++)
      //      {
      //          for(int j=0;j<arr.length;j++)
      //          {
      //              temp[n-j-1][i]=arr[i][j];
      //          }
      //      }
      //      for(int i=0;i<arr.length;i++)
      //      {
      //          for(int j=0;j<arr.length;j++)
      //          {
      //              arr[i][j]=temp[i][j];
      //          }
      //      }
      //      for(int i=0;i<arr.length;i++)
      //      {
      //          for(int j=0;j<arr.length;j++)
      //          {
      //              System.out.print(arr[i][j]+" ");
      //          }
      //          System.out.println("");
      //      }
      //  } 
      // effient solution
      public static void rotateMatrix(int arr[][])
      {
        for(int i=0;i<arr.length;i++)
        {
          for(int j=i+1;j<arr.length;j++)
            {
                 swap(arr,i,j);
            }
        }
        for(int i=arr.length-1;i>=0;i--)
        {
            for(int j=0;j<arr.length;j++)
            {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
      }
      public static void swap(int[][] arr,int i,int j)
      { 
          int temp=0;
          temp =arr[i][j];
         arr[i][j]=arr[j][i];
         arr[j][i]=temp;

       }
        public static void main(String args[])
        {
            int[][] arr={{1,2,3},{4,5,6},{7,8,9}};
            rotateMatrix(arr);
        }
}
