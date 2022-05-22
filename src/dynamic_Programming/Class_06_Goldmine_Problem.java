package dynamic_Programming;

public class Class_06_Goldmine_Problem {
	public static void main(String[] args) {
		int[][] arr =  {{4,3,6,0},{3,1,2,4},{2,3,5,4},{1,2,0,2}};
		
		int x = arr.length;
		int y = arr[0].length;
		
		/*
		 * size and meaning: 
		 * size: dp will be of same size that of array
		 * meaning: in dp we will store the max value that each cell can mine
		 * 
		 * direction: solve it from rightmost column to leftmost column
		 * 
		 * */
		
		int[][] dp = new int[x][y];
		
		for(int i = 0; i < x; i++) {
			dp[i][y-1] = arr[i][y-1];
		}
		
		for(int j = y-2; j >= 0; j--) {
			for(int i = x-1; i >= 0; i--) {
				if(i == x-1) {
					dp[i][j] = Math.max(dp[i][j+1], dp[i-1][j+1]) + arr[i][j];
				}else if(i == 0) {
					dp[i][j] = Math.max(dp[i][j+1], dp[i+1][j+1]) + arr[i][j];
				}else {
					dp[i][j] = Math.max(Math.max(dp[i-1][j+1], dp[i][j+1]), dp[i+1][j+1]) + arr[i][j];
				}
			}
		}
		
		int max = Integer.MIN_VALUE;
		for(int i = 0; i < x; i++) {
			if(dp[i][0] > max) {
				max = dp[i][0];
			}
		}
		
		System.out.println(max);
	
		
	}
}
