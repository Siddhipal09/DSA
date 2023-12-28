package Sorting;

public class intersection {
    public static void interSection(int a[],int b[])
    {
        int n=a.length;
        int m=b.length;
        for(int i=0;i<n;i++)
        {
            if(i>0&& a[i]==a[i-1])
            continue;
            for(int j=0;j<m;j++)
            {
                if(a[i]==b[j])
                {
                    System.out.print((a[i])+",");
                   
                    break;
                }
            }
        }
        //efficient solution
        //int i=0;j=0;
        //while(i<m&& j<n)
        //{
        //if(i>0 && a[i]==a[i-1])
        //{
        //i++;
        //continue;
       // }
       //if(a[i]<b[j])
       //{i++;}
       //else if(a[i]>b[j])
       //{j++;}
       //else{
        //  System.out.println(a[i]);
        //i++;
        //j++;
       //}
        //}
    }
    public static void main(String args[])
    {
        int a[]={1,20,20,40,60};
        int b[]={2,20,20,40};
        interSection(a,b);
    }
}
