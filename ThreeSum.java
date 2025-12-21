import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

class ThreeSum{
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

        SolutionBruteForce bsolution=new SolutionBruteForce();

        System.out.println("The triplets are :"+bsolution.threeSum(arr));
    }
}

   

//Brute Force
class SolutionBruteForce {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> list =new ArrayList<>();
        
        for(int i=0;i<nums.length-2;i++){
            for(int j=i+1;j<nums.length-1;j++){
                for(int k=j+1;k<nums.length;k++){
                    if(nums[i]+nums[j]+nums[k]==0){
                            List<Integer> list2=new ArrayList<>();

                                list2.add(nums[i]);
                                list2.add(nums[j]);
                                list2.add(nums[k]);

                                Collections.sort(list2);
                                
                                if(!list.contains(list2)){
                                list.add(list2);
                                }
                                
                    }
                    
                }
                
            }

        }

        return list;
    }
}