import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FirstNonRepeatingCharacterUsingStreams {
    	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string");
		String str=sc.nextLine();
		
	
		
		String letters[]=str.replaceAll("\\s+","").split("");
		Map<Object, Integer> map=Stream.of(letters).collect(Collectors.toMap(x->x, v->1,Integer::sum,LinkedHashMap::new));
		
		for(Map.Entry<Object, Integer> e:map.entrySet()) {
			if(e.getValue()==1) {
				System.out.println("The character is:"+e.getKey());
				return;
			}
		}
		
		
		
		
	}
    
}
