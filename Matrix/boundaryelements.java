package Matrix;

public class boundaryelements {
    public static void bTraversal(int arr[][])
    {
        if(arr.length==1)// corner cases(row matrix)
        {
            for(int i=0;i<arr[0].length;i++)
            {
                System.out.print(arr[0][i]+" ");
            }
        }else if(arr[0].length==1)//(column matrix)
        {
          for(int i=0;i<arr.length;i++)
          {
            System.out.print(arr[i][0]+" ");
          }
        }
        else{
            for(int i=0;i<arr[0].length;i++)
            {
                System.out.print(arr[0][i]+" ");
            }
            for(int i=1;i<arr.length;i++)
            {
                System.out.print(arr[i][arr[i].length-1]+" ");
            }
            for(int i=arr[0].length-2;i>=0;i--)
            {
                System.out.print(arr[arr.length-1][i]+" ");
            }
            for(int i=arr.length-2;i>=1;i--)
            {
                System.out.print(arr[i][0]+" ");
            }
        }
    }
    public static void main (String args[])
    {
        int arr[][]={{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        bTraversal(arr);
    }
}
