
import java.util.*;
import java.util.stream.Collectors;

public class ConvertListToUpperCaseUsingStreams{

	public static void main(String[] args) {
		
//		static content for test
//		List<String> list=Arrays.asList("shreyas","kshitij","rhythm","shravan");
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter number of elements");
		int n=sc.nextInt();
		sc.nextLine();
		
		System.out.println("Enter elements in Array List:");
		
		List<String> list=new ArrayList<>();
		for(int i=0;i<n;i++) {
			String input=sc.nextLine();
			list.add(input);
		}
        System.out.println("Before:");

		System.out.println(list);
		List<String> upperCases=list.stream().map(x->x.toUpperCase()).collect(Collectors.toList());
		
        System.out.println("After:");
		System.out.println(upperCases);
	}

}
