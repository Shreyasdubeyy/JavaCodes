import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;

public class CreateMapFromListUsingStreams {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
		System.out.println("Enter number of elements in list");
		int n=sc.nextInt();
		
		System.out.println("Enter list elements");
		List <Integer> list=new ArrayList<>();
		for(int i=0;i<n;i++) {
			list.add(sc.nextInt());
		}
		
		Map<Integer,String> map=list.stream().collect(Collectors.toMap(key->key,value->value%2==0?"Even":"Odd",(x,y)->x));
		System.out.println(map);
    }
}
