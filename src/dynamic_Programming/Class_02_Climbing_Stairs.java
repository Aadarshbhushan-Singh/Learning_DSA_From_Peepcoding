package dynamic_Programming;

public class Class_02_Climbing_Stairs {
	public static void main(String[] args) {
		int n = 10;
		int[] qb = new int[n+1];
		int ans = climbingStairs(n, qb);
//		int ans = climbingStairsTabular(n);
		System.out.println(ans);
	}
	
	//This is using general dp concept
	public static int climbingStairs(int n, int[] qb) {
		if(n == 0) {
			return 1;
		}else if(n < 0) {
			return 0;
		}
		
		if(qb[n] != 0) {
			return qb[n];
		}
		
		System.out.println("Call " + n);
		int nm1 = climbingStairs(n-1, qb);
		int nm2 = climbingStairs(n-2, qb);
		int nm3 = climbingStairs(n-3, qb);
		
		int ans = nm1 + nm2 + nm3;
		qb[n] = ans;
		
		return ans;
	}
	
	//This is done using tabular form
	public static int climbingStairsTabular(int n) {
		int[] dp = new int[n+1];
		
		dp[0] = 1;
		for(int i = 1; i < n+1; i++) {
			if(i == 1) {
				dp[i] = dp[i-1];
			}else if(i == 2) {
				dp[i] = dp[i-1] + dp[i-2];
			}else {
				dp[i] = dp[i-1] + dp[i-2] + dp[i-3];
			}
		}
		
		return dp[n];
	}
}
