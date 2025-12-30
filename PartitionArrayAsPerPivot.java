
import java.util.Arrays;
import java.util.Scanner;

public class PartitionArrayAsPerPivot {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();

        int arr[]=new int[size];

        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }

        int pivot=sc.nextInt();
        System.out.println(Arrays.toString(pivotArray(arr, pivot)));

        
    }

 static  public int[] pivotArray(int[] nums, int pivot) {
        int result[]=new int[nums.length];
        int k=0;

        for(int i=0;i<nums.length;i++){
            if(nums[i]<pivot){
                result[k++]=nums[i];
            }
        }

        for(int i=0;i<nums.length;i++){
            if(nums[i]==pivot){
                result[k++]=nums[i];
            }
        }

        for(int i=0;i<nums.length;i++){
            if(nums[i]>pivot){
                result[k++]=nums[i];
            }
        }
    
    return result;
}

}
