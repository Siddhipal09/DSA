package BST;

public class ceilingonleft {
    static void printCeiling(int arr[])
    {
        int n= arr.length;
        System.out.print("-1"+" ");
        for(int i= 1;i<n;i++)
        {
            int diff= Integer.MAX_VALUE;
            for(int j=0;j<i;j++)
            {
                if(arr[j]>=arr[i])
                {
                    diff= Math.min(diff, (arr[j]-arr[i]));
                }
            }
            if(diff== Integer.MAX_VALUE)
            System.out.print("-1"+" ");
            else
            System.out.print((arr[i]+diff)+" ");
        }
    }
    public static void main(String[] args) {
        int[] arr={2,8,30,15,25,13};
        printCeiling(arr);
    }
}
