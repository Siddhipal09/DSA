package Sorting;
import java.util.Arrays;
public class union {
    public static void unionSort(int a[],int b[] )
    {
        int m= a.length;
        int n= b.length;
        int[]c=new int[m+n];
        for(int i=0;i<m;i++)
        {
            c[i]=a[i];
        }
        for(int i=0;i<n;i++)
        {
          c[m+i]=b[i];
        }
        Arrays.sort(c);
        for(int i=0;i<(m+n);i++)
        {
            if((i==0)||(c[i]!=c[i-1]))
            {
                System.out.print(c[i]+" ");
            }
        }
    }
    //efficient solution
     // public static void unionSort(int a[],int b[])
     //{int i=0; int j=0;
      //  while(i<m && j<n)
      //{if((i>0)&&(a[i]==a[i-1])
        //{
          //i++;
          //continue;
        //}
        //if((j>0)&&(b[j]==b[j-1]))
        //{
          // j++;
          //continue;
        //}
        //if(a[i]<b[j])
        //{System.out.print(a[i]+" ");
        //i++;
        //}else if(a[i]>b[j])
        //{System.out.print(b[j]+" ");
        // j++;
         // }else
         //{ System.out.print(a[i]+" ");
        // i++;
        //j++;
        //}

      //}
      //while(i<m)
      //{
        //if(i>0&&a[i]!=a[i-1])
        //{
            //System.out.print(a[i]+" ");
            //i++;
        //}
        // }
        //while(j<n)
        //{
         //   if((j>0)&&(b[j]!=b[j-1]))
        //{System.out.print(b[j]+" ");j++;}
       //}

    // }
public static void main(String args[])
{
    int a[]={3,5,8};
    int b[]={2,8,9,10,15};
    unionSort(a,b);
}
    
}
