package Sorting;
import java.util.Arrays;
public class sort2 {
    //   public static void sort(int arr[])
     //  {
     //   int n= arr.length;
     //   int[] temp= new int[n];
     //   int i=0;
     //   for(int j=0;j<n;j++)
      //  {
      //      if(arr[j]==0)
      //      {
      //          temp[i]=arr[j];
      //          i++;
      //      }
      //  }
      //  for(int j=0;j<n;j++)
      //  {
      //      if(arr[j]==1)
      //      {
      //          temp[i]=arr[j];
      //          i++;
       //     }
       // }
      //  for(int j=0;j<n;j++)
      //  {
      //      if(arr[j]==2)
      //      {
      //          temp[i]=arr[j];
      //          i++;
      //      }
      //  }
      //  for(int j=0;j<n;j++)
      //  {
      //      arr[j]=temp[j];
      //  }
      // }
      //efficient solution
      public static void sort(int arr[])
      {
        int n= arr.length;
        int low=0;
        int high=n-1;
        int mid=0;
        while(mid<=high)
        {
            if(arr[mid]==0)
            { 
                swap(arr,mid,low);
                low++;
                mid++;
            }
            else if(arr[mid]==1)
            {
                mid++;
            }
            else
            { 
                swap(arr,mid,high);
                high--;

            }
        }
      }
      public static void swap(int arr[],int a,int b)
       { 
          int temp=0;
          temp =arr[a];
          arr[a]=arr[b];
          arr[b]=temp;
       
    
       }
       public static void main(String args[])
       {
        int arr[]={0,1,1,2,0,1};
        sort(arr);
        System.out.println(Arrays.toString(arr));
       }
}
