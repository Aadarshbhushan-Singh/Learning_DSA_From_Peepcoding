package TCS_Old_Questions;

import java.util.Arrays;

public class Class_42_check_permutation {
	public static void main(String[] args) {
		System.out.println(isPermutation("zkbf", "fzbk"));
	}
	public static String isPermutation(String input1, String input2) {
		char[] strArr1 = input1.toCharArray();
		char[] strArr2 = input2.toCharArray();
		
		Arrays.sort(strArr1);
		Arrays.sort(strArr2);
		
		String finalString1 = String.valueOf(strArr1);
		String finalString2 = String.valueOf(strArr2);
		
		if(finalString1.equals(finalString2)) {
			return "yes";
		}else {
			return "no";
		}
	}
}
