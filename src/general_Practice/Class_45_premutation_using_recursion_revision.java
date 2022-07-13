package general_Practice;

public class Class_45_premutation_using_recursion_revision {
	public static void main(String[] args) {
		String str = "abc";
		
		printPermutation("abc", "");
	}
	
	public static void printPermutation(String str, String ans) {
		if(str.length() == 0) {
			System.out.println(ans);
			return;
		}
		
		for(int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			String leftString = str.substring(0, i);
			String rightString = str.substring(i+1);
			String ros = leftString + rightString;
			
			printPermutation(ros, ans + ch);
		}
	}
}
