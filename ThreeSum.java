import java.util.*;

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

        // SolutionBruteForce bsolution=new SolutionBruteForce();

        // System.out.println("The triplets are :"+bsolution.threeSum(arr));


    //     Solution1 solution1=new Solution1();

    //     System.out.println("The triplets are :"+solution1.threeSum(arr));
    // 
    
        Solution2 solution2=new Solution2();

        System.out.println("The triplets are :"+solution2.threeSum(arr));
    

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


class Solution1{

     public List<List<Integer>> threeSum(int[] nums) {
     Arrays.sort(nums);

        List<List<Integer>> outerList=new ArrayList<>();

        for(int i=0;i<nums.length-2;i++){
            int compliment=-nums[i];

            

            int start=i+1;
            int end=nums.length-1;

            while(end>start){
                List<Integer> innerList=new ArrayList<>();
                if(nums[start]+nums[end]==compliment){
                    innerList.add(nums[start]);
                    innerList.add(nums[end]);
                    innerList.add(nums[i]);
                    if(!outerList.contains(innerList)){
                    outerList.add(innerList);
                    }
                    start++;
                    end--;
                }
                else if(nums[start]+nums[end]>compliment){
                    end--;
                }
                else{
                    start++;
                }
                
            }

        }
        return outerList;       
}
}


class Solution2{
public List<List<Integer>> threeSum(int[] nums) {
    Arrays.sort(nums);
        Set<List<Integer>> set =new HashSet<>();
        for(int i=0;i<nums.length-2;i++){
           

            int start=i+1;
            int end=nums.length-1;


            while(start<end){
                int sum=nums[i]+nums[start]+nums[end];
                if(sum==0){
                 List<Integer> innerList=new ArrayList<>();
                 innerList.add(nums[i]);
                 innerList.add(nums[start]);
                 innerList.add(nums[end]);
                 set.add(innerList);
                 start++;
                 end--;
                    
                }
                else if(sum<0){
                    start++;
                }
                else{
                    end--;
                }
            }
        }
        List<List<Integer>> outerList=new ArrayList<>(set);
        return outerList;
    }
}