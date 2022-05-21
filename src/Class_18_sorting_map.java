import java.util.*;

public class Class_18_sorting_map {
	public static void main(String[] args) {
		Map<String, Integer> map1 = new HashMap<String, Integer>();
		
		map1.put("Ram", 34);
		map1.put("Ram2", 23);
		map1.put("Ram45", 89);
		map1.put("Ram23", 67);
		map1.put("Ram5", 34);
		
		System.out.println(map1);
		
		Map<String, Integer> tmap= new TreeMap<>(map1);
		
		System.out.println(tmap);
	}
}
