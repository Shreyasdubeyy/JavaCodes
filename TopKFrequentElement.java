import java.util.*;

public class TopKFrequentElement {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int arr[];

        //size of array
        int size=sc.nextInt();
        arr=new int[size];

        //array
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        //frequent
        int k=sc.nextInt();

        Solution solution=new Solution();

        System.out.println("The "+k+" of the most frequent element is: "+Arrays.toString(solution.topKFrequent(arr,k)));
    }
}
class Solution {

    //Not Optimal
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer,Integer> map=new TreeMap<>();

        for(int e:nums){
            map.put(e,map.getOrDefault(e,0)+1);
        }

        List<Integer> list=new ArrayList<>();

        for(Map.Entry<Integer,Integer> e:map.entrySet()){
            list.add(e.getKey());
        }

        Collections.sort(list,(a,b)->map.get(b)-map.get(a));


        int arr[]=new int[k];
        
        for(int i=0;i<arr.length;i++){
            arr[i]=list.get(i);
           
        }
        return arr;
    }
}