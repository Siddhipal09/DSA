package Sorting;
import java.util.Arrays;
class test 
{


 public static void bubblesort(int arr[])
    {
        int n=arr.length;
        //int temp=0;
        for(int i=0;i<n-1;i++)
       {
        for(int j=0;j<n-1;j++)//optimized loop for(intj=0;j<n-i-1;j++)
            {
            if(arr[j+1]<arr[j])
            
             swap(arr,j,j+1); 
           // temp =arr[j+1];
           //arr[j+1]=arr[j];
           //arr[j]=temp;

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
//optimized bubble sort
// public static void bubblesort(int arr[])
//{
   // for(int i=0;i<n-1;i++)
    //{
      // boolean swapped=false;
       //for(int j=0;j<n-i-1;j++)
       //{
        //if(arr[j+1]<arr[j])
       // {
       //     swap(arr[j],arr[j+1]);
        //   swapped=true;
        //}
        //if (swapped==false)
        //break;
       //}
    //}
//}
    
    public static void main(String[] args) 
     {
        int arr[]={10,8,20,5};
        
        bubblesort(arr);
        System.out.println(Arrays.toString(arr));
      }
    }





  

   
   

   

