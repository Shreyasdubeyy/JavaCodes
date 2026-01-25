import java.util.*;
import java.util.stream.Collectors;
public class CheckIfAllElementsAreEvenOrNotUsingStreams {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of list:");
		int n=sc.nextInt();
		
		List<Integer> list = new ArrayList<>();
		System.out.println("Enter elements:");
		for(int i=0;i<n;i++) {
			list.add(sc.nextInt());
		}
		
		List evenNumbers=list.stream().filter(x->x%2==0).collect(Collectors.toList());
		
		if(evenNumbers.size()==list.size()) {
			System.out.println("All elements are even");
			return;
		}
		System.out.println("Few Elements are not even");
    }
}