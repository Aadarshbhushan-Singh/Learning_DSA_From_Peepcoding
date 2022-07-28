package general_Practice;
import java.util.*;

public class Class_61_roman_to_integer {
	public static void main(String[] args) {
		String roman = "CDXLIII";
		int ans = romanToInt("CDXLIII");
		System.out.println(ans);
	}
	 public static int romanToInt(String s) {
	        HashMap<Character, Integer> map = new HashMap<>();
	        map.put('I', 1);
	        map.put('V', 5);
	        map.put('X', 10);
	        map.put('L', 50);
	        map.put('C', 100);
	        map.put('D', 500);
	        map.put('M', 1000);
	        
	        int sum = 0;
	        char lastChar = s.charAt(s.length() -1);
	        sum = sum + map.get(lastChar);
	        
	        for(int i = s.length() -2; i >= 0; i--){
	            if(map.get(s.charAt(i)) >= map.get(s.charAt(i+1))){
	                sum = sum + map.get(s.charAt(i));
	            }else{
	                sum = sum - map.get(s.charAt(i));
	            }
	        }
	        
	        return sum;
	    }
}
