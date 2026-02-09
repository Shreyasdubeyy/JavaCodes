import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class SortingStringBasedOnLengthUsingStreams {
    public static void main(String[] args) {
        List<String> list=new ArrayList<String>();
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter array size");
	int n=sc.nextInt();
	sc.nextLine();
	
	for(int i=0;i<n;i++) {
		list.add(sc.nextLine());
	}
	
    System.out.println("Before sorting:"+list);
    List<String> sortedList = list.stream().sorted(Comparator.comparing(String::length)).collect(Collectors.toList());
		System.out.println("After sorting Ascending:"+sortedList);
		System.out.println("After sorting Descending:"+list.stream().sorted(Comparator.comparing(String::length).reversed()).collect(Collectors.toList()));
	}
}
