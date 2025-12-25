import java.util.Scanner;

public class MaximumAndMinimum {
    
public static void main(String[] args) {
     Scanner sc =new Scanner(System.in);
        int arr[];

        //size of array
        int size=sc.nextInt();
        arr=new int[size];

        //elements of array
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }

        MaxAndMin soln=new MaxAndMin(arr);
        System.out.println("The max in the array is:"+soln.max()+"\nThe min in the array is:"+soln.min());

}}

class MaxAndMin{
    
    int arr[];
    public MaxAndMin(int [] arr) {
        this.arr=arr;
    }

    int max(){
        int maxElement=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>maxElement){
                maxElement=arr[i];
            }
        }

        return maxElement;
    }


      int min(){
        int minElement=Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]<minElement){
                minElement=arr[i];
            }
        }

        return minElement;
    }
    
}
