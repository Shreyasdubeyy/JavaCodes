
import java.util.Scanner;

public class MaximumSubArrayWithSubArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int arr[]=new int[size];
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }

        int value=maxSubarraySum(arr);

        System.out.println("The maximum sum of sub array is:"+value);
    }
 static int maxSubarraySum(int[] arr) {
        // Code here
        int max=arr[0];
        int currentMax=arr[0];
        int start=0,end=0;
        int tempStart=0;
        for(int i=1;i<arr.length;i++){
            if(currentMax+arr[i]<arr[i]){
                tempStart=i; //start where we get new currentMax
                currentMax=arr[i];
            }
            else{
                currentMax+=arr[i]; //since start index is previous one so no change
            }
            
            if(max<currentMax){
                max=currentMax; //actual max
                start=tempStart; //fixing the start
                end=i; //fixing the end
            }
        }
        System.out.print("The array is:");
        for(int i=start;i<=end;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
         return max;
    }

}
