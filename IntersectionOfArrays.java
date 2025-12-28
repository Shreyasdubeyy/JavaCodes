import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class IntersectionOfArrays {
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);

    // Read size of first array
    System.out.println("Enter size of first array:");
    int sizeA = scanner.nextInt();

    int[] firstArray = new int[sizeA];
    System.out.println("Enter elements of first array:");
    for (int i = 0; i < sizeA; i++) {
        firstArray[i] = scanner.nextInt();
    }

    // Read size of second array
    System.out.println("Enter size of second array:");
    int sizeB = scanner.nextInt();

    int[] secondArray = new int[sizeB];
    System.out.println("Enter elements of second array:");
    for (int i = 0; i < sizeB; i++) {
        secondArray[i] = scanner.nextInt();
    }

    // Find intersection of the two arrays
    ArrayList<Integer> intersection =
            intersect(firstArray, secondArray);

    // Display result
    System.out.println("Intersection of arrays: " + intersection);

    // Close scanner to free resources
    scanner.close();
    }

    public static ArrayList<Integer> intersect(int[] a, int[] b) {
        // code here
       
        Set<Integer> set=new HashSet<>();
        Arrays.sort(a);
        Arrays.sort(b);
        
        int i=0,j=0;
       while(i<a.length && j<b.length){
          
            if(a[i]==b[j]){
                set.add(a[i]);
                i++;
                j++;
            }
            else if(a[i]>b[j]){
                j++;
            }
            else{
                i++;
            }
            
        }
        
       
         ArrayList<Integer> list=new ArrayList<>(set);
        return list;
        
    }
}
