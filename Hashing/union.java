package Hashing;

public class union {
    public static void findUnion(int a[], int b[])
    {
        int m= a.length;
        int n= b.length;
        int[] c= new int[m+n];
        for(int i=0;i<m;i++)
        {
            c[i]=a[i];
        }
        for(int i=0;i<n;i++)
        {
            c[m+i]=b[i];
        }
        int res=0;
        for(int i=0;i<m+n;i++)
        {
            boolean flag= false;
            for(int j=0;j<i;j++)
            {
                if(c[i]==c[j])
                {
                    flag=true;
                    break;
                }
            }
            if(flag==false)
            {
                res++;
            }
        }
        System.out.println(res);
    }
    public static void main(String args[])
    {
        int[] a={15,20,5,15};
        int[] b={15,15,15,20,10};
        findUnion(a,b);
    }
}
