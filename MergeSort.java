
import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int arr[]={4,3,2,6,1,23,3};

        System.out.println("Before Sorting:"+Arrays.toString(arr));

        mergeSort(arr,0,arr.length-1);
        System.out.println("After Sorting:"+Arrays.toString(arr));
    }
     static void mergeSort(int arr[], int l, int r) {
        // code here
        if(l>=r)return;
        
        int left[]=new int[((l+r)+1)/2];
        int right[]=new int [((l+r)/2)+1];
        
        //left array
        for(int i=0;i<left.length;i++){
            left[i]=arr[i];
        }
        
        //right
        for(int i=0;i<right.length;i++){
            right[i]=arr[left.length+i];
        }
        
        mergeSort(left,0,left.length-1);
        mergeSort(right,0,right.length-1);
        merge(left,right,arr);
    }
    
    static void merge(int left[],int right[],int arr[]){
        int i=0,j=0,k=0;
        
        while(i<left.length && j<right.length){
            if(left[i]<right[j]){
                arr[k++]=left[i++];
            }
            else{
                arr[k++]=right[j++];
            }
        }
        
        while(i<left.length){
            arr[k++]=left[i++];
        }
        
        while(j<right.length){
            arr[k++]=right[j++];
        }
        
        
    }
}
