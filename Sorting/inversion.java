package Sorting;



public class inversion {
    public static void countInversion(int arr[])
    {
        int n=arr.length;
        int count=0;
        for(int i=0;i<(n-1);i++)
        {
            for(int j=i+1;j<n;j++)
            {
                if(arr[i]>arr[j])
                {
                    count++;
                }
            }
        }
        System.out.println(count);
    }
    //efficient solution
   // public static int countInversion(int arr[],int l, int r)
   //{int n=arr.length;
    // int count;
    //if(l<r)
    //{
    // int m=(l+r)/2;
    // count+= countInversion(arr,l,m);
    // count+= countInversion(arr,m+1,r);
    // count+= countandmerge(arr,l,m,r);
    //}
    //return count;
  //}
  //public static int countandmerge(int arr[],int low,int mid,int right)
  //{ int mid=(low+high)/2;
    //int n1=mid-low+1;
      //  int n2=high-mid;
        //int[]left=new int[n1];
        //int[]right=new int[n2];
        //for(int i=0;i<n1;i++)
        //{
          //left[i]=arr[low+i];
        //}
        //for(int i=0;i<n2;i++)
        //{
          //  right[i]=arr[n1+i];
        //}
        //int count=0;
        //int i=0;
        //int j=0;
        //int k=low;
        //while(i<n1&&j<n2)
        //{
          //  if(left[i]<=right[j])
           // {
             //   arr[k]=left[i];
               // i++;
                //k++;
            //}else{
              //  arr[k]=right[j];
                //j++;
                //count= count+(n1-i);
                //k++;
            //}
        //}
        //while(i<n1)
        //{
          //  arr[k]=left[i];
            //i++;
            //k++;
        //}
        //while(j<n2)
        //{
          //  arr[k]=right[j];
            //j++;
            //k++;
        //}
       // return count;
    //}
    
//}


   //}
    public static void main(String args[])
    {
        int arr[]={2,4,1,3,5};
        countInversion(arr);
    }
}
