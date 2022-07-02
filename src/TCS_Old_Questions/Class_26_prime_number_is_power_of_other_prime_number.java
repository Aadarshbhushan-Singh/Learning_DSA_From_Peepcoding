package TCS_Old_Questions;

import java.util.*;

public class Class_26_prime_number_is_power_of_other_prime_number {
	public static void main(String[] args) {
		int x = 625;
		
		System.out.println(fillHashMap(x));
//		fillHashMap(x);
	}
	
	static boolean fillHashMap(int n) {
		int primeType = 0;
		
		for(int i = 2; i <= n; i++) {
			if(n % i == 0) {
				primeType++;
				if(primeType > 1) {
					return false;
				}
				while(n % i == 0) {
					n = n / i;
				}
			}
			
		}
		
		return true;
		
	}
}
