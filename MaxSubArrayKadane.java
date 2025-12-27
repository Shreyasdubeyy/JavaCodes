import java.util.Scanner;
public class MaxSubArrayKadane {
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

        Kadane solution=new Kadane();

        System.out.println("The max subarray sum is :"+solution.maxSubArray(arr));
    }
}


//Kadane Algorithm
class Kadane{
    public int maxSubArray(int[] nums) {
    //     int maxSum=nums[0];
    //      int currentSum=0;
    //     for(int i=0;i<nums.length;i++){
    //         if(currentSum<=0){
    //             currentSum=nums[i];
    //         }
    //         else{
    //             currentSum+=nums[i];
    //         }
            
    //         maxSum=Math.max(currentSum,maxSum);
    //     }

    //     return maxSum;
    // }
    int arr[]=nums;
    int currentSum = arr[0];
	int maxSum = arr[0];

	for(int i=1;i<arr.length;i++) {
		currentSum = Math.max(arr[i], currentSum + arr[i]);
		maxSum = Math.max(maxSum, currentSum);
	}

	return maxSum;
}

}