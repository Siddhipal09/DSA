package Matrix;
import java.util.Arrays;
public class median {
       public static void Matmedian(int arr[][], int r, int c) 
       {
        int min= arr[0][0];
        int max= arr[0][c-1];
       for(int i=1;i<r;i++)
       {
        if(arr[i][0]<min)
        {
            min=arr[i][0];
        }
        else if(arr[i][c-1]>max)
        {
            max=arr[i][c-1];
        }
       }
       int medPos=(r*c+1)/2;
       while(min<max)
       {
        int mid=(min+max)/2;
        int midPos=0;
        for(int i=0;i<r;i++)
        {
          int pos= Arrays.binarySearch(arr[i],mid)+1;
          midPos+=Math.abs(pos);  
        }
        if(midPos<medPos)
        {min= mid+1;}
        else
        {max=mid;}
    }
       System.out.print(min);
       
    
    
}
       public static void main(String args[])
       {
        int[][] arr={{1,10,20},{15,25,30},{5,8,40}};
        int r=3;
        int c=3;
        Matmedian(arr,r,c);
        
       }

}
