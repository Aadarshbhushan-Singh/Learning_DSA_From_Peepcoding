package general_Practice;
import java.util.*;
import java.util.Arrays;
import java.util.Collections;


public class Class_Practice {	
	
	
	public static void main(String[] args) {
//		System.out.println(isReversedNumber(987));
//		int[] arr = {1,2,4,5,6,3,7,8,10};
//		int ans = findMissingNumber(arr);
//		System.out.println(ans);
		
		String[] arr = {"basketball", "tennis", "tt"};
		String ans = longest(arr);
		System.out.println(ans);
		
		List<String> list = new LinkedList<String>(); 
//		List<Object> list2 = list;
				
	}
	
//	public static boolean isReversedNumber(int number) {
//		int num = number, reversed = 0;
//	    while(num != 0) {
//	      int digit = num % 10;
//	      reversed = reversed * 10 + digit;
//	      num /= 10;
//	    }
//		
//	    
//	    if (number == reversed) {
//	    	return true;
//	    }
//	    return false;
//	}
	
	public static String longest(String[] wordList) {
		String ans = "";
		for(String ele: wordList) {
			if(ele.length() > ans.length()) {
				ans = ele;
			}
		}
		
		return ans;
	}
}


