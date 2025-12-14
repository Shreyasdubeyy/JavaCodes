
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;


public class kthLargestElement {
    
public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the size of array");
    int n=sc.nextInt();
    int arr[]=new int[n];
    System.out.println("enter elements to find kth largest among them");
    for(int i=0;i<n;i++){
        arr[i]=sc.nextInt();
    }
    System.out.println("enter the kth largest element that you need");
    int k=sc.nextInt();

    int element=findKthLargest(arr, k);
    System.out.println("The "+k+" largest"+" element is: "+element);
}

    static int findKthLargest(int[] nums, int k) {


      Queue<Integer> q=new PriorityQueue<>();  
    
    for(int i=0;i<nums.length;i++){
        if(i<k){
            q.add(nums[i]);
            continue;
        }

        if(nums[i]<q.peek()){
            continue;
        }

        if(nums[i]>q.peek()){
            q.poll();
            q.add(nums[i]);
        }

    }

    return q.poll();


    }
}