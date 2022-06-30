package TCS_Old_Questions;

//array:  1, 2, 1, 3, 2, 5, 3, 7, 5, 11, 8, 13, 13, 17…..
//index:  1  2  3  4  5  6  7  8  1  10  11 12   13 14

public class Class_15_find_nth_term_in_series {
	public static void main(String[] args) {
		int n = 14;
		if(n % 2 == 0) {
			System.out.println(findNthPrimeNumber(n/2));
		}
//		else {
//		}
		System.out.println(findFibonacci((n/2), new int[(n/2)+1]));
	}
	
	//This function finds nth prime number
	static int findNthPrimeNumber(int n) {
		int x = 0;
		int i = 2;
		while(x < n) {
			if(isPrime(i) == true) {
				x++;
			}
			i++;
		}
		
		return i-1;
	}
	
	//This function checks if the given number is prime or not
	static boolean isPrime(int n) {
		int i = 2;
		while(i <= Math.sqrt(n)) {
			if(n % i == 0) {
				return false;
			}
			i++;
		}
		return true;
	}
	
	//Find nth fibonacci number
	static int findFibonacci(int n, int[] qb) {
		if(n == 0 || n == 1) {
			return n;
		}
		if(qb[n] != 0) {
			return qb[n];
		}
		
		int prev1 = findFibonacci(n-1, qb);
		int prev2 = findFibonacci(n-2, qb);
		int sum = prev1 + prev2;
		
		qb[n] = sum;
		return sum;
	}
	
}
