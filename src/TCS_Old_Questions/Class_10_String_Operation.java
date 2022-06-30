package TCS_Old_Questions;
/*
 * Three strings will be given as input in 3 different lines
 * These three words will be read one at a time, in three separate line
 * The first word should be changed like all vowels should be replaced by *
 * The second word should be changed like all consonants should be replaced by @
 * The third word should be changed like all char should be converted to upper case
 * Then concatenate the three words and print them
 * 
 * */

import java.util.*;

public class Class_10_String_Operation {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String str1 = scn.next();
		String str2 = scn.next();
		String str3 = scn.next();
		
		//For 1st string convert vowel into '*'
		//Creating a set for vowel letters
		HashSet<Character> set1 = new HashSet<Character>();
		set1.add('a');
		set1.add('e');
		set1.add('i');
		set1.add('o');
		set1.add('u');
		set1.add('A');
		set1.add('E');
		set1.add('I');
		set1.add('O');
		set1.add('U');
		
		ArrayList<Character> ans = new ArrayList<>();
		
		
		for(int i = 0; i < str1.length(); i++) {
			char c = str1.charAt(i);
			if(set1.contains(c)) {
				ans.add('*');
			}else {
				ans.add(c);
			}
		}
		
		//Replacing 2nd string consonants as @
		for(int i = 0; i < str2.length(); i++) {
			char c = str2.charAt(i);
			if(set1.contains(c)) {
				ans.add(c);
			}else {
				ans.add('@');
			}
		}
		
		//Doing all uppercase
		String str4 = str3.toUpperCase();
		for(int i = 0; i < str4.length(); i++) {
			ans.add(str4.charAt(i));
		}
		
		System.out.print(ans);
	}
}
