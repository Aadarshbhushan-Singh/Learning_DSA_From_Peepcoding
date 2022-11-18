package general_Practice;
import java.util.*;

public class Class_70_change_case {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String input = scn.next();
		String newStr = "";
		for(int i = 0; i < input.length(); i++) {
			char c = input.charAt(i);
			if(Character.isLowerCase(c) == true) {
				newStr = newStr + Character.toUpperCase(c);
			}else {
				newStr = newStr + Character.toLowerCase(c);
			}
		}
		
		int start = 0;
		int end = 0;
		while(end < newStr.length()) {
			char ch = newStr.charAt(end);
			if(Character.isLowerCase(ch) == true) {
				System.out.println(newStr.substring(start, end));
				start = end;
			}
			end++;
			
		}
		System.out.println(newStr.substring(start, end));
	}
}
