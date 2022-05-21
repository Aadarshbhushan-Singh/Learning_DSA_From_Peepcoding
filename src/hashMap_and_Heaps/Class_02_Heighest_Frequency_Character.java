package hashMap_and_Heaps;
import java.util.*;

public class Class_02_Heighest_Frequency_Character {
	public static void main(String[] args) {
		String str = "aslkdfasfasdlkfjasasdfadsfasdfaasdfasdf";
		
		HashMap<Character, Integer> hm = new HashMap<>();
		
		for(int i = 0; i < str.length(); i++) {
			char ele = str.charAt(i);
			if(hm.containsKey(ele)) {
				int freq = hm.get(ele);
				hm.put(ele, freq+1);
			}else {
				hm.put(ele, 1);
			}
		}
		
		Set<Character> keys = hm.keySet();
		
		int maxFreq = 0;
		char ele = '3';
		for(char key: keys) {
			int val = hm.get(key);
			if(val > maxFreq) {
				maxFreq = val;
				ele = key;
			}
		}
		System.out.print(ele + " " + maxFreq);
		
		
		
	}
}
