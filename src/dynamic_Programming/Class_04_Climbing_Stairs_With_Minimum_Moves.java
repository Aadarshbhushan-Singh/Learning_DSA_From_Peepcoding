package dynamic_Programming;

public class Class_04_Climbing_Stairs_With_Minimum_Moves {
	public static void main(String[] args) {
		int[] arr = {3,2,4,2,0,2,3,1,2,2};
//		the answer of this array will be {8,5,0,3,2,1,1}
		
		int n = arr.length;
		Integer[] dp = new Integer[n+1];
		
		dp[n] = 0;
		
		for(int i = n-1; i >= 0; i--) {
			int min = Integer.MAX_VALUE;
			if(arr[i] > 0) {
				for(int j = i+1; j <= (i + arr[i]) && j < dp.length; j++) {
					if(dp[j] != null) {
						min = Math.min(min, dp[j]);
					}
				}
			}
			
			if(min != Integer.MAX_VALUE) {
				dp[i] = min+1;
			}
		}
		
		System.out.println(dp[0]);
		
	}
}
