package TCS_Old_Questions;
/*
 * Number:   0,0,2,1,4,2,6,3,8,4, 10, 5, 12,6,14,7,16,8
 * Indexing: 1,2,3,4,5,6,7,8,9,10 11 12  13 ..........
 * Concept: If n == odd return n-1 else return n/2-1
 * */

import java.util.*;

public class Class_11_find_term_in_series {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		
		if(n % 2 != 0) { //n is odd
			System.out.println(n-1);
		}else {
			System.out.println((n/2)-1);
		}
		
	}
}
