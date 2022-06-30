package TCS_Old_Questions;
/*
 * Find the nth term in given series. (N<30)
 * 1, 1, 2, 3, 4, 9, 8, 27, 16, 81, 32, 243,64, 729, 128, 2187 
 * */

import java.util.*;

public class Class_09_Find_nth_term_in_given_Series {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println(returnNumber(1));
		
		System.out.println(returnNumber(16));
		System.out.println(returnNumber(13));
	}
	
	static int returnNumber(int n) {
		if(n % 2 == 0) {
			return (int)Math.pow(3, (n/2)-1);
		}else {
			return (int)Math.pow(2,  (n/2));
		}
	}
}
