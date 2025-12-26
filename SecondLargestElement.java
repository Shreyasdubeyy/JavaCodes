import java.util.Scanner;

public class SecondLargestElement {
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

         if(getSecondLargest(arr)==-1) {
    	System.out.println("Second Largest Element does not exist");
    }
    else
    System.out.println("The second largest element is :"+getSecondLargest(arr));
    }

    public static int getSecondLargest(int[] arr) {
        //code here
        int largest=Integer.MIN_VALUE;
        int secondLargest=Integer.MIN_VALUE;
        if(arr.length==0 || arr.length==1){
            return -1;
        }
        
        for(int i=0;i<arr.length;i++){
            
            if(arr[i]>largest){
                if(arr[i]<secondLargest){
                    secondLargest=largest;
                    largest=arr[i];
                }
                else{
                    secondLargest=largest;
                    largest=arr[i];
                }
            }
            else if(arr[i]>secondLargest && arr[i]!=largest){
                secondLargest=arr[i];
            }
        
            
            
        }
        return secondLargest;
}
}
