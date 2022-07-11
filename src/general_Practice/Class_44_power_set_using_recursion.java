package general_Practice;
import java.util.*;

public class Class_44_power_set_using_recursion {
	public static void main(String[] args) {
		ArrayList<String> ans = new ArrayList<>();
		String str = "abc";
		
		findPowerSet(str, 0, ans, "");
		
		System.out.println(ans);
	}
	
	public static void findPowerSet(String str, int index, ArrayList<String> ans, String currString) {
		if(index >= str.length()) {
			ans.add(currString);
			return;
		}
		
		findPowerSet(str, index+1, ans, currString);
		findPowerSet(str, index+1, ans, (currString + str.charAt(index)));
	}
	
	
}
