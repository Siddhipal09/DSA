package Heap;

public class MinHeap{
    int[] arr;
    int size;
    int capacity;
    MinHeap(int c)
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
    void insert(int x)
    {
        if(size== capacity)
        return;
        size++;
        arr[size-1]= x;
        for(int i= size-1;i!=0 && arr[parent(i)]>arr[i]; i= parent(i))
        {
            int temp= arr[i];
            arr[i] = arr[parent(i)];
            arr[parent(i)]= temp;
           
        }
    }
    void printHeap() {
        for (int i = 0; i < size / 2; i++) {
            System.out.print("PARENT : " + arr[i]);
            if (left(i) < size) System.out.print(" LEFT CHILD : " + arr[left(i)]);
            if (right(i) < size) System.out.print(" RIGHT CHILD :" + arr[right(i)]);
            System.out.println();
        }
    }
    void minHeapify(int i)
    {
        int lt= left(i);
        int rt= right(i);
        int smallest= i;
        if(lt<size && arr[lt]< arr[i])
        smallest= lt;
        if(rt<size && arr[rt]< arr[smallest])
        smallest= rt;
        if(smallest!= i)
        {
            int temp= arr[i];
            arr[i] = arr[smallest];
            arr[smallest]= temp;
            minHeapify(smallest);
        }
    }
    int extractMin()
    {
        if(size== 0)
        return Integer.MAX_VALUE;
        if(size==1)
        {
            size--;
            return arr[0];
        }
           int temp= arr[0];
            arr[0] = arr[size-1];
            arr[size-1]= temp;
            size--;
            minHeapify(0);
            return arr[size];
    }
      
    public static void main(String[] args) {
     //   MinHeap minHeap = new MinHeap(15);
     //   minHeap.insert(3);
     //   minHeap.insert(2);
     //   minHeap.insert(1);
     //    minHeap.insert(15);
     //   minHeap.insert(5);
     //   minHeap.insert(4);
     //   minHeap.insert(45);
     int[] arr = { 15, 5, 20, 1, 17, 10, 30 };
     MinHeap minHeap = new MinHeap(15);
     minHeap.arr = arr;
        minHeap.size = arr.length;
     minHeap.printHeap();
     minHeap.minHeapify(0);

        System.out.println("Heap after minHeapify at index 0:");
        minHeap.printHeap();
        minHeap.extractMin();
        System.out.println("Heap after extractmin at index 0:");
        minHeap.printHeap();

    }
}
