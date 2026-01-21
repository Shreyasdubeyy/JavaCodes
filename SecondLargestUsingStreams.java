
import java.util.*;
import java.util.stream.Collectors;
public class SecondLargestUsingStreams {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
List<Integer> list=new ArrayList<>();
for(int i=0;i<n;i++){
    list.add(sc.nextInt());
}
		System.out.print("List:");
        System.out.println(list);
		List<Integer> output=list.stream().distinct().sorted(Comparator.reverseOrder()).skip(1).collect(Collectors.toList());
		if(output.size()==0) {
			System.out.println("No second largest element");
			return;
		}
        System.out.print("Second Largest:");
		System.out.println(output.get(0));
	}

}
