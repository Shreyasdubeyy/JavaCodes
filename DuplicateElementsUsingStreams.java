import java.util.*;
import java.util.stream.*;
public class DuplicateElementsUsingStreams {
    public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		List<Integer> list=new ArrayList<>();
		
		System.out.println("Enter size of the list");
		int n=sc.nextInt();
		System.out.println("Enter element in list");
		
		for(int i=0;i<n;i++) {
			list.add(sc.nextInt());
		}
		
		System.out.println(list);
		
		Set<Integer> set = new HashSet<>();
		Set<Integer> duplicates = list.stream().filter(x->!set.add(x)).collect(Collectors.toSet());
		
		System.out.println(duplicates);
		
	}
}



