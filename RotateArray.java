
import java.util.Arrays;
import java.util.Scanner;

public class RotateArray {
public static void main(String[] args) {
     Scanner sc= new Scanner(System.in);
    int size=sc.nextInt();
    int arr[]=new int[size];

    for(int i=0;i<size;i++){
        arr[i]=sc.nextInt();
    }
    int k=sc.nextInt();
    k=k%size;

System.out.println("Original array:"+Arrays.toString(arr));
rotateArray(arr,k);
System.out.println("Rotated Array:"+Arrays.toString(arr));
        
} 

static void swap(int arr[],int start,int end){
   {
        int temp=arr[start];
        arr[start]=arr[end];
        arr[end]=temp;
    }
}
static void rotateArray(int arr[],int k){
    reverse(arr,0,arr.length-1);
    reverse(arr,0,k-1);
    reverse(arr,k,arr.length-1);
}

static void reverse(int arr[],int start,int end){
    while(start<end){
        swap(arr,start,end);
        start++;
        end--;
    }
}
}
