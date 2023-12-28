package Sorting;
import java.util.Arrays;
import java.util.Comparator;
class Interval{
    int start;
    int end;
    Interval(int start,int end){
        this.start= start;
        this.end= end;
    }
}
public class mergeoverlapping {
    public static void mergeOverlapping(Interval arr[])
    {
        if(arr== null || arr.length<=1)
        {
            return;
        }
        Arrays.sort(arr,Comparator.comparingInt(i-> i.start));
        int res=0;
        for(int i=1;i< arr.length;i++)
        {
            if(arr[res].end>= arr[i].start)
            {
                arr[res].end= Math.max(arr[res].end, arr[i].end);
                arr[res].start= Math.min(arr[res].start, arr[i].start);

            }
            else{
                res++;
                arr[res]=arr[i];
            }
        }
        for(int i=0;i<=res;i++)
        {
            System.out.println(arr[i].start+" "+arr[i].end);
        }
    }
    public static void main(String args[])
    {
        Interval[] arr={new Interval(5,10),new Interval(3,15),new Interval(18,30),new Interval(2,7)};
        mergeOverlapping(arr);
        
    }
    
}
