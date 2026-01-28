import java.util.*;
import java.util.stream.Collectors;
public class SortingUsingStreams {
   public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter number of elements in list");
    int n=sc.nextInt();
    System.out.println("Enter list elements");
    List <Integer> list=new ArrayList<>();  
    for(int i=0;i<n;i++) {
        list.add(sc.nextInt());
    }
    List<Integer> sortedList = list.stream().sorted().collect(Collectors.toList());
    System.out.println("Sorted List: " + sortedList);
   } 
}
