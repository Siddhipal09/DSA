package Sorting;
import java.util.Arrays;
public class sort1 {
          public static void segregatePosNeg(int arr[])
          {
            int n= arr.length;
            int[] temp= new int[n];
            int i=0;
            for(int j=0;j<n;j++)
            {
                if(arr[j]<0)
                {
                    temp[i]=arr[j];
                    i++;
                }
            }
            for(int j=0;j<n;j++)
            {
                if(arr[j]>0)
                {
                    temp[i]=arr[j];
                    i++;
                }
            }
            for(int j=0;j<n;j++)
            {
                arr[j]=temp[j];
            }
          }
          //efficient solution
        //  public static void segregatePosNeg(int arr[])
         // {
           // int n= arr.length();
         //   int i= -1;
         //   int j= n;
         //   while(true)
         //   {
         //       do{
          //          i++;
            //    }while(arr[i]<0);
              //  do{
              //      j--;
              //  }while(arr[j]>=0);
              //  if(i>=j)
              //  return;
              //  swap(arr,i,j)
            //}
        //  }
        //  public static void swap(int arr[],int a,int b)
        //  { 
        //      int temp=0;
        //      temp =arr[a];
        //      arr[a]=arr[b];
         //    arr[b]=temp;
         
      
        //  }
          public static void main(String args[])
          {
            int arr[]={13,-12,18,-10};
            segregatePosNeg(arr);
            System.out.println(Arrays.toString(arr));
          }
}
