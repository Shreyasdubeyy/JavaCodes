
import java.util.*;
import java.util.stream.Collectors;
public class DescendingSortUsingStreams{
public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
   int n= sc.nextInt();
List<Integer> list=new ArrayList<>();
    for(int i=0;i<n;i++){
        list.add(sc.nextInt());
    }
    System.out.println("Before:");
    System.out.println(list);

	List<Integer> output=list.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
	
	System.out.println("After:");
    System.out.println(output);
}
}
