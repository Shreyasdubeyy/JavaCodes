import java.util.Arrays;
import java.util.Scanner;

public class MaxSumOfMAxAndMinNumbers{
    
    public static void main(String[] args){
        
       Scanner sc=new Scanner(System.in);
       
        //Fill the code here
        System.out.println("Enter the array size");
        int size=sc.nextInt();
        
        if(size<=0) {
        	System.out.println(size+" is an invalid array size");
        	return;
        }
        if(size%2!=0) {
        	System.out.println(size+" is an odd number. Please enter even number");
        	return;
        }
        
        int numbers[]=new int[size];
        
        System.out.println("Enter the number");
        for(int i=0;i<size;i++) {
        	numbers[i]=sc.nextInt();
        }
        
        Arrays.sort(numbers);
        
        int sum[]=calculateSum(numbers);
        
        Arrays.sort(sum);
        
        System.out.println("The maximum number is "+sum[sum.length-1]);
        
        
        
    }
    
    static int[] calculateSum(int arr[]) {
    	int result[]=new int[arr.length/2];
    	int j=arr.length-1;
    	for(int i=0;i<arr.length/2;i++) {
    		result[i]=arr[i]+arr[j--];
    	}
    	
    	return result;
    	
    }
   
    
    static void swap(int arr[],int i,int j) {
    	int temp=arr[i];
    	arr[i]=arr[j];
    	arr[j]=temp;
    }
}