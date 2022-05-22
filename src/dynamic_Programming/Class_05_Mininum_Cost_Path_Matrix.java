package dynamic_Programming;

public class Class_05_Mininum_Cost_Path_Matrix {
	public static void main(String[] args) {
		int[][] arr = {{4,3,6,0},{3,1,2,4},{2,3,5,4},{1,2,0,2}};
		
		int x = arr.length;
		int y = arr[0].length;
		
		int[][] dp = new int[x][y];
		
		dp[x-1][y-1] = arr[x-1][y-1];
		
		for(int i = x-1; i >= 0; i--) {
			for(int j = y-1; j >= 0; j--) {
				if(i == x - 1 && j == y -1 ) {
					continue;
				}else if(j == y - 1) {
					dp[i][j] = dp[i+1][j] + arr[i][j];
				}else if(i == x -1) {
					dp[i][j] = dp[i][j+1] + arr[i][j];
				}else {
					dp[i][j] = Math.min(dp[i][j+1], dp[i+1][j]) + arr[i][j];
				}
			}
		}
		
		System.out.println("Minimum Cost = " + dp[0][0]);
	}
}
