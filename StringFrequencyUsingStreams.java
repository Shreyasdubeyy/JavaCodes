import java.util.*;
import java.util.stream.*;
public class StringFrequencyUsingStreams {
    public static void main(String[] args) {
       //Using toMap
        Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string");
		String line=sc.nextLine();
		
		Map<Object, Integer> entry=List.of(line.toLowerCase().split("")).stream().filter(x->!x.equals(" ")).collect(Collectors.toMap(k->k, k->1,Integer::sum,LinkedHashMap::new));
		
		System.out.println(entry);
    }
}
