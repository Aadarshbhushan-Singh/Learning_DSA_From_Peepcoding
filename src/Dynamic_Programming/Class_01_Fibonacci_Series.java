package Dynamic_Programming;

public class Class_01_Fibonacci_Series {
	public static void main(String[] args) {
		int n = 10;
		
//		int ans = fibonacciRecursion(n);
		int[] qb = new int[n+1];
		int ans = fibonacciDP(n, qb);
		System.out.println(ans);
		
	}
	
	//Fibonacci using recursion - time complexity is O(2^n)
	public static int fibonacciRecursion(int n) {
		if(n == 0 || n == 1) {
			return n;
		}
		
		System.out.println("Call " + n);
		int f1 = fibonacciRecursion(n-1);
		int f2 = fibonacciRecursion(n-2);
		int f = f1 + f2;
		
		return f;
	}
	
	public static int fibonacciDP(int n, int[] qb) {
		if(n == 0 || n == 1) {
			return n;
		}
		
		if(qb[n] != 0) {
			return qb[n];
		}
		
		System.out.println("Call " + n);
		int f1 = fibonacciDP(n-1, qb);
		int f2 = fibonacciDP(n-2, qb);
		int f = f1 + f2;
		qb[n] = f;
		
		return f;
	}
}
