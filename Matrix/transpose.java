package Matrix;

public class transpose {
    //  public static void transposeMatrix(int arr[][])
     // { int n=4;
       // int[][] temp= new int[n][n];
      //  for(int i=0;i<n;i++)
      //  {
        //    for(int j=0;j<n;j++)
          //  {
            //    temp[i][j]=arr[j][i];
           // }
        //}
        //for(int i=0;i<n;i++)
        //{
          //  for(int j=0;j<n;j++)
           // {
             //   arr[i][j]=temp[i][j];
            
           // System.out.print(arr[i][j]+" ");
       // }
       // System.out.println(" ");
      //} 
    
    //efficient solution
    public static void transposeMatrix(int arr[][])
    {int n=4;
        for(int i=0;i<n;i++)
        {
          for(int j=i+1;j<n;j++)
        {
           swap(arr,i,j);
           
        }
       
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(arr[i][j] + " ");
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
        int arr[][]={{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        transposeMatrix(arr);
      }
    }

