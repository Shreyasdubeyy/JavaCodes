
import java.util.*
; import java.util.stream.*;
public class PartitionEvenOddUsingStreams {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of list");
		int n=sc.nextInt();
		
		List<Integer> list=new ArrayList<Integer>();
		
		System.out.println("Enter elements in the list:");
		for(int i=0;i<n;i++) {
			list.add(sc.nextInt());
		}
	
		System.out.println("The list is"+list);
		
		Map<Boolean, List<Integer>> booleanMap = list.stream().collect(Collectors.partitioningBy(x->x%2==0));
		
		System.out.println("Even:"+booleanMap.get(true));
		System.out.println("Odd:"+booleanMap.get(false));
		
	}

}
