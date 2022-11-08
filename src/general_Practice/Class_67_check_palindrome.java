package general_Practice;

public class Class_67_check_palindrome {
	public static void main(String[] args) {
		System.out.println(isPalindrome("aadsaa"));
	}
	
	static boolean isPalindrome(String s) {
		int start = 0;
		int end = s.length() -1;
		
		while(start < end) {
			char c1 = s.charAt(start);
			char c2 = s.charAt(end);
			if(c1 != c2) {
				return false;
			}
			start++;
			end--;
		}
		
		return true;
	}
}
