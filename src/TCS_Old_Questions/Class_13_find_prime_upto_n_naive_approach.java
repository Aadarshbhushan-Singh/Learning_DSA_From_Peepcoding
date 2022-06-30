package TCS_Old_Questions;
import java.util.*;


public class Class_13_find_prime_upto_n_naive_approach {
	public static void main(String[] args) {
		int n = 6;
		int x = 0;
		int i = 2;
		while(true) {
			if(x == 6) {
				break;
			}
			
			if(isPrime(i) == true) {
				System.out.println(i);
				x++;
			}
			i++;
		}
		
		
	}
	
	static boolean isPrime(int n) {
		if(n == 1) {
			return false;
		}
		int i = 2;
		boolean flag = true;
		while(i <= Math.sqrt(n)) {
			if(n % i == 0) {
				flag = false;
				break;
			}
			i++;
		}
		return flag;
	}
}