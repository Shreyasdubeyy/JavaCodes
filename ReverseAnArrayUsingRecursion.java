
public class ReverseAnArrayUsingRecursion {
    public static void main(String[] args) {
        int [] arr={1,2,3,4,5};
        // recursionInParameterizedWay(0, arr.length-1, arr);
        // System.out.println("Recursion of array in parameterized way:");
        // System.out.println(Arrays.toString(arr));

        // recursionInFunctionalWay(0, arr);
        // System.out.println("Recursion of array in functional way:");
        // System.out.println(Arrays.toString(arr));
    }

static void swap(int i,int j,int arr[]){
    int temp=arr[j];
    arr[j]=arr[i];
    arr[i]=temp;
}

static void recursionInParameterizedWay(int i,int j,int arr[]){
    if(i==j)return;
    swap(i,j,arr);
    recursionInParameterizedWay(i+1, j-1, arr);
   
}

static void recursionInFunctionalWay(int i,int arr[]){
    if(i>=arr.length/2)return;
    swap(i,arr.length-i-1,arr);
    recursionInFunctionalWay(i+1, arr);
}

}

