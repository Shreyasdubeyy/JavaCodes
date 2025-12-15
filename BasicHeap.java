//Heap is a complete binary tree with a node 
// having smaller/greater value then all its
// child nodes

public class BasicHeap {
    public static void main(String[] args) {
        MinHeap h=new MinHeap(5);
         h.add(5);
        h.add(2);
        h.add(8);
        h.add(1);

        System.out.println(h.remove()); 
        System.out.println(h.remove()); 
        System.out.println(h.remove()); 
    }
}

class MinHeap{
int size;
int capacity;
int heap[];
MinHeap(int capacity){
this.capacity=capacity;
heap=new int[capacity];
size=0;
}



int parent(int i){
    return (i-1)/2;
}

int left(int i){
    return 2*i+1;
}

int right(int i){
    return 2*i+2;
}


void add(int element){
heap[size]=element;
size++;

int i=size-1;

while(i>0 && heap[parent(i)]>heap[i]){
    swap(i,parent(i));
    i=parent(i);
}

}

int remove(){
    int i=heap[0];
    heap[0]=heap[size-1];
    size--;

    heapify(0);
    return i;
}


void heapify(int i){

    int smallest=i;
    int left=left(i);
    int right=right(i);

    if(left<size && heap[left]<heap[smallest]){
        smallest=left;
    }


    if(right<size && heap[right]<heap[smallest]){
        smallest=right;
    }

    if(smallest!=i){
        swap(i,smallest);
        heapify(smallest);
    }
}

void swap(int i,int j){
    int temp=heap[i];
    heap[i]=heap[j];
    heap[j]=temp;
}
}
