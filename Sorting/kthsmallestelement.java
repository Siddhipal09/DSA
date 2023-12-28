package Sorting;
 //import java.util.Arrays;
public class kthsmallestelement {
      // naive solution
       // public static int kthSmallest(int arr[], int k)
       // {
            
        //    Arrays.sort(arr);
          //  return arr[k-1];
       // }
        public static int kthSmallest(int arr[],int k)
        {
            int n= arr.length;
            int l=0;
            int r=n-1;
           
            while(l<=r)
            {
              int  p= lomutoPartition(arr,l,r);
                if(p==(k-1)){
                System.out.println(arr[p]);
                return p;}
               
                else if(p> (k-1))
                {
               r= p-1;
                }
                else
              { l=p+1;}
            }
           return -1;
        }
        public static int lomutoPartition(int arr[], int l, int r)
    {
        int pivot= arr[r];
        int i=l-1;
        for(int j=l;j<=r-1;j++)
        {
            if(arr[j]<pivot)
            {
                i++;
                swap(arr,i,j);
            }
        }
        swap(arr,i+1,r);
        return i+1;
       
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
            int[] arr={10,5,30,12};
            int k=2;
            kthSmallest(arr,k);
           // System.out.println(arr[k-1]);
        }
}
