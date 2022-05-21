package dynamic_Programming;

public class Class_03_Climbing_Stairs_Jump {
	public static void main(String[] args) {
		int[] arr = {3,3,0,2,2,3};
//		the answer of this array will be {8,5,0,3,2,1,1}
		
		int n = arr.length;
		int[] dp = new int[n+1];
		
		dp[n] = 1;
		for(int i = n-1; i >= 0; i--) {
			int sum = 0;
			for(int j = i+1; j < (n+1) && j <= (i+arr[i]); j++) {
				sum = sum + dp[j];
				dp[i] = sum;
			}
		}
		
		
		for(int ele: dp) {
			System.out.print(ele + " ");
		}
	}
}
