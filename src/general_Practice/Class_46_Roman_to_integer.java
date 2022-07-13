package general_Practice;
import java.util.*;

public class Class_46_Roman_to_integer {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String str = scn.next();
		
		HashMap<Character, Integer> map = new HashMap<>();
		
		map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);
        
        int len = str.length();
        
        int sum = 0;
        sum = sum + map.get(str.charAt(len-1));
        for(int i = len-2; i>=0; i--) {
        	char ch = str.charAt(i);
        	char ch1 = str.charAt(i+1);
        	
        	if(map.get(ch) < map.get(ch1)) {
        		sum = sum - map.get(ch);
        	}else {
        		sum = sum + map.get(ch);
        	}
        }
        
        System.out.println(sum);
		
	}
}
