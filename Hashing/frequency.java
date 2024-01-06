package Hashing;

public class frequency {
    public static void printFrequency(int arr[])
    {
        int n= arr.length;
        for(int i=0;i<n;i++)
        {
            boolean flag= false;
            for(int j=0;j<i;j++)
            {
                if(arr[i]==arr[j])
                {
                    flag= true;
                    break;
                }
            }
            if(flag== true)
            {
                continue;
            }
            else{
                int freq=1;
                for(int j=i+1;j<n;j++)
                {
                    if(arr[i]==arr[j])
                    {
                        freq++;
                    }
                }
            
            System.out.println(arr[i]+" "+ freq);
        }
    }
}
    public static void main(String args[])
    {
        int[] arr={10,20,20,30,10};
        printFrequency(arr);
    }
}
