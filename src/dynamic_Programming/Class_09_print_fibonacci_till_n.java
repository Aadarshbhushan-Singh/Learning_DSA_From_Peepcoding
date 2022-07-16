package dynamic_Programming;

public class Class_09_print_fibonacci_till_n {
	public static void main(String[] args) {
		int n = 10;
		
		long[] x = new long[n];
		x = printFibb(n);
		for(long ele: x) {
			System.out.println(ele + " ");
		}
		
	}
	
	public static long[] printFibb(int n) 
    {
        long[] dp = new long[n];
        if(n == 2){
            dp[0] = (long)1;
            dp[1] = (long)1;
            return dp;
        }else if(n == 1){
            dp[0] = (long)1;
            return dp;
        }else if(n < 0){
            return dp;
        }
        printFibonacci((long)n, dp);
        return dp;
    }
    
    public static long printFibonacci(long n, long[] dp){
        if(n == 1){
            dp[(int)n-1] = (long)1;
            return (long)1;
        }else if(n == 2){
            dp[(int)n-1] = (long)1;
            return (long)1;
        }
        
        if(dp[(int)n-1] > 0){
            return dp[(int)n-1];
        }
        
        long nm1 = printFibonacci(n-1, dp);
        long nm2 = printFibonacci(n-2, dp);
        
        long sum = nm1 + nm2;
        dp[(int)n-1] = sum;
        
        return sum;
    }
}
