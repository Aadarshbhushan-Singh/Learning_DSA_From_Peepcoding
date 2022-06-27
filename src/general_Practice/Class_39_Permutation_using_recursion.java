package general_Practice;

public class Class_39_Permutation_using_recursion {
	public static void main(String[] args) {
		printPermutation("", "abc");
	}
	
	static void printPermutation(String ans, String str) {
		if(str.length() == 0) {
			System.out.println(ans);
		}
		
		for(int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			String left = str.substring(0, i);
			String right = str.substring(i+1);
			String remString = right + left;
			
			printPermutation(ans + ch, remString);
		}
		
	}
	
//	static void printPermutation(String str, String ans) {
//		if(str.length() == 0) {
//			System.out.println(ans);
//		}
//		
//		for(int i = 0; i < str.length(); i++) {
//			char ch = str.charAt(i);
//			String left = str.substring(0, i);
//			String right = str.substring(i+1);
//			String remString = left + right;
//			
//			printPermutation(remString, ans + ch);
//		}
//		
//	}
}
