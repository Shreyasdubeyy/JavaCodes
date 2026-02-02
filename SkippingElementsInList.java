

import java.util.*;
import java.util.stream.Collectors;


public class SkippingElementsInList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of the list:");
		int n=sc.nextInt();
		
		List<Integer> list=new ArrayList<>();
		System.out.println("Enter array elements");
		for(int i=0;i<n;i++) {
			list.add(sc.nextInt());
		}		
		System.out.println("Enter number of elements to skip");
		int s=sc.nextInt();
		
		
		
		System.out.println("The list is:");
		System.out.println(list);
		if(s>n || n<0) {
			System.out.println("Entered number is out of range");
			return;
		}
		List<Integer> moddifiedList = list.stream().skip(s).collect(Collectors.toList());
		System.out.println("Moddififed List:");
		System.out.println(moddifiedList);
	}

}
