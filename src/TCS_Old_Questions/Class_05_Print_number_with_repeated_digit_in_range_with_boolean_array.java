package TCS_Old_Questions;
/*
 * 	Suppose n1=11 and n2=15.
	There is the number 11, which has repeated digits, but 12, 13, 14 and 15 have no repeated digits. So, the output is 4.
	For range 101 - 200, we have 72 characters which has repeated digit
 * */

public class Class_05_Print_number_with_repeated_digit_in_range_with_boolean_array {
	public static void main(String[] args) {
		int num = 2345;
		int count = 0;
		int n1 = 101;
		int n2 = 200;
		for(int i =n1; i <= n2; i++) {
			if(haveRepeatedDigit(i) == false) {
				count++;
			}
		}
		
		System.out.println(count);
		System.out.println(haveRepeatedDigit(num));
	}
	
	static boolean haveRepeatedDigit(int num) {
		boolean[] booleanArr = new boolean[10];
		while(num > 0) {
			int d = num % 10;
			if(booleanArr[d] == true) {
				return true;
			}else {
				booleanArr[d] = true;
			}
			num = num / 10;
		}
		
		return false;
	}
}
