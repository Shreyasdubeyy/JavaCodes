import java.util.Scanner;
// Boyer–Moore Algorithm where majority has to be >n/2 (n=array size)
public class MajorityElementMooresAlgorithm {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int arr[];
        int size=sc.nextInt();
        arr=new int[size];
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }

        Solution solution=new Solution();

        System.out.println("The majority element is:"+solution.majorityElement(arr));
    }
}

class Solution {
    public int majorityElement(int[] nums) {
        int count=0,candidate=0;

        for(int i=0;i<nums.length;i++){
            if(count==0){
                candidate=nums[i];
                count++;
            }
            else if(candidate==nums[i]){
                count++;
            }
            else{
                count--;
            }
        }
        return candidate;
    }
}