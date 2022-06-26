package TCS_Old_Questions;

/*
 * Example 1
Input: nayannamantenet
Output: nayan naman tenet

Example 2
Input: aaaaa
Output: a a aaa
 * */

public class Class_3_palindrome_in_a_string {
	public static void main(String[] args) {
		String str = "aaabbbccc";
		System.out.println(check3Palindrome("nayannamantenet"));
	}
	
	static boolean check3Palindrome(String str) {
		String subString = "";
		for(int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			subString+=c;
			if(checkPalindrome(subString) == true) {
				for(int j = i+1; j < str.length(); j++) {
					String s1 = str.substring(i+1, j+1);
					String s2 = str.substring(j+1, str.length());
					if(checkPalindrome(s1) == true && checkPalindrome(s2) == true) {
						System.out.print(subString + " " + s1 + " " + s2 + "\n");
						return true;
					}
				}
			}
		}
		
		
		return false;
	}
	
	
	
	static boolean checkPalindrome(String str) {
		int i = 0;
		int j = str.length()-1;
		while(i < j) {
			char x = str.charAt(i);
			char y = str.charAt(j);
			if(x == y) {
				i++;
				j--;
			}else {
				return false;
			}
		}
		
		return true;
	}
}
