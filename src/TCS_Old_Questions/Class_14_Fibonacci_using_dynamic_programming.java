package TCS_Old_Questions;

public class Class_14_Fibonacci_using_dynamic_programming {
	public static void main(String[] args) {
		int n = 10;
		int ans = fibonacci(n);
		System.out.println(ans);
		
		
		int ans2 = fibMemoized(n, new int[n+1]);
		System.out.println(ans2);
	}
	
	//using recursion
	static int fibonacci(int n) {
		if(n == 0 || n == 1) {
			return n;
		}
		
		int prev = fibonacci(n-1);
		int prev2 = fibonacci(n-2);
		int sum = prev + prev2;
		
		return sum;
	}
	
	
	static int fibMemoized(int n, int[] qb) {
		if(n == 0|| n == 1) {
			return n;
		}
		if(qb[n] != 0) {
			return qb[n];
		}
		
		int prev = fibMemoized(n-1, qb);
		int prev2 = fibMemoized(n-2, qb);
		int sum = prev + prev2;
		
		qb[n] = sum;
		
		return sum;		
	}
}
