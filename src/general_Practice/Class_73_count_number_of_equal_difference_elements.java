package general_Practice;
import java.util.*;

public class Class_73_count_number_of_equal_difference_elements {
	public static void main(String[] args) {
		String A = "ZZXYOz";//"abc";//"zzzX";//"dBacaAA";
		String B = "OOYXZZ";//"ABC";//zzzX";//"caBdaaA";
		
		System.out.println(solution(A, B));
		
	}
	
	public static int solution (String A, String B) {
		int count = 0;
		int sL = A.length();
		HashMap<Character, Integer> l = new HashMap<>();
		
		
		int nCheck = 1;
		int si = 0;
		while(nCheck <= sL) {
			int li = si + nCheck;
			for(int i = si; i < li; i++) {
				l.put(A.charAt(i), l.getOrDefault(A.charAt(i), 0) + 1);
			}
			for(int i = si; i < li; i++) {
				if(l.containsKey(B.charAt(i))) {
					int letterCount = l.getOrDefault(B.charAt(i), 0);
					if(letterCount > 1)  {
						l.put(B.charAt(i), l.getOrDefault(B.charAt(i), 0) - 1);
					} else {
						l.remove(B.charAt(i));
					}
				} else {
					break;
				}
			}
			
			if(l.isEmpty()) {
				count++;
			}
			l.clear();
			if(li < sL) {
				si++;
			} else {
				nCheck++;
				si = 0;
			}	
			
		}
		return count;
	}
	
}
