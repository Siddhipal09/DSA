package Heap;

public class heapsort {
    int[] arr;
    int size;
    int capacity;
    heapsort(int c)
    {
        arr= new int[c];
        size=0;
        capacity=c;
    }
    int left(int i){
        return(2*i +1);
    }
    int right(int i){
        return(2*i +2);
    }
    int parent(int i){
        return((i-1)/2);
    }
    void maxHeapify(int arr[], int size, int i)
    {
        int largest= i;
        int left= 2*i+1;
        int right= 2*i+2;
        if(left< size && arr[left]>arr[largest])
         largest=left;
        if(right< size && arr[right]>arr[largest])
         largest=right;
         if(largest!=i)
         {
           swap(arr, largest,i);
            maxHeapify(arr, size, largest);
         }
    }
    void swap(int arr[], int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
    void buildHeap(int arr[], int size)
    {
        for(int i= (size-2)/2; i>=0;i--)
        maxHeapify(arr, size, i);
    }
    void heapSort(int arr[], int size)
    {
        buildHeap(arr, size);
        for(int i=size-1; i>=1;i--)
        {
           swap(arr,0,i);
           maxHeapify(arr,i,0);
        }
    }
    void printArray(int arr[], int size) {
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int[] arr= {10,15,50,4,20};
        heapsort sort= new heapsort(10);
        sort.arr = arr;
        sort.size= arr.length;
        sort.heapSort(arr, sort.size);
        System.out.println("Sorted array is:");
        sort.printArray(arr, sort.size);
    }
}
