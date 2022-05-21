package HashMap_and_Heaps;
import java.util.*;

public class Class_01_HashMap_Functions {
	public static void main(String[] args) {
		HashMap<String, Integer> hm = new HashMap<>();
		
		hm.put("Aadarsh", 48);
		hm.put("Pranjal", 32);
		hm.put("Deepak", 12);
		hm.put("Rakshit", 54);
		hm.put("Aditya", 34);
		
		System.out.println(hm);
		
		hm.put("Sunny", 44);
		hm.put("Aadarsh", 98);
		System.out.println(hm);
		
		System.out.println(hm.get("Aadarsh"));
		System.out.println(hm.get("Gorilla"));
		
		System.out.println(hm.containsKey("Aditya"));
		System.out.println(hm.containsKey("Rahul"));
		
		Set<String> keys = hm.keySet();
		System.out.println(keys);
		
		for(String key: keys) {
			System.out.print(key + " ");
		}
		
		for(String key: keys) {
			Integer value = hm.get(key);
			System.out.println(key + " : " + value);
		}
		
		
	}
}
