package general_Practice;

public class Class_43_Check_palindrome_using_recursion {
	public static void main(String[] args) {
		System.out.println(checkPalindrome("adg", 0, 2));
	}
	
	
	public static boolean checkPalindrome(String str, int s, int e) {
		if(s >= e) {
			return true;
		}
		if(str.charAt(s) != str.charAt(e)) {
			return false;
		}
		
		return checkPalindrome(str, s+1, e-1);
	}
}
