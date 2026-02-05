import java.util.*;
public class SortingMapByValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Character,Integer> map=new HashMap<>();
		map.put('a', 2);
		map.put('b', 1);
		map.put('c', 45);
		map.put('d', 96);
		
		System.out.println(map);
		
		List<Map.Entry<Character,Integer>> list=new ArrayList<>();
		for(Map.Entry<Character, Integer> m:map.entrySet()) {
			list.add(m);
		}
		
	
		Collections.sort(list,(a,b)->a.getValue()-b.getValue());
		System.out.println(list);
	}

}