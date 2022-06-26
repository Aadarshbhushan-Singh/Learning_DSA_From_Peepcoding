package TCS_Old_Questions;
import java.util.*;

/*
 * 	Suppose n1=11 and n2=15.
	There is the number 11, which has repeated digits, but 12, 13, 14 and 15 have no repeated digits. So, the output is 4.
	For range 101 - 200, we have 72 characters which has repeated digit
 * */
public class Class_04_Print_number_with_repeated_digit_in_range_with_hashmap {
	public static void main(String[] args) {
		int num = 23;
		int count = 0;
		int n1 = 11;
		int n2 = 15;
		for(int i =n1; i <= n2; i++) {
			if(haveRepeatedDigit(i) == false) {
				count++;
			}
		}
		
		System.out.println(count);
	}
	
	//This function return true if the number has repeated digit
	static boolean haveRepeatedDigit(int num) {
		HashMap<Integer, Integer> map = new HashMap<>();
		while(num > 0) {
			int d = num % 10;
			if(map.containsKey(d)) {
				return true;
			}else {
				map.put(d, 1);
			}
			num = num / 10;
		}
		return false;
	}
}
