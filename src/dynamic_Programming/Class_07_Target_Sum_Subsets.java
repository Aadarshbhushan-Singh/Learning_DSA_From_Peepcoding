package dynamic_Programming;

public class Class_07_Target_Sum_Subsets {
	public static void main(String[] args) {
		int[] arr = {4,2,3,1,7};
		int tar = 10;
		
		int x = arr.length;
		boolean[][] dp = new boolean[x+1][tar+1];
		
		/*
		 * We are making one matrix of size x+1 - target + 1
		 * we are storing the boolean value that where the elements in array which come before i can form the particular sum or not
		 * 
		 * */
		
		for(int i = 0; i < x + 1; i++) {
			for(int j = 0; j < tar + 1; j++) {
				if(i == 0 && j == 0) {
					dp[i][j] = true;
				} else if (i == 0) {
					dp[i][j] = false;
				} else if (j == 0) {
					dp[i][j] = true;
				}else {
					if(dp[i-1][j] == true) {
						dp[i][j] = true;
					} else {
						int val = arr[i - 1];
						if(j >= val) {
							if(dp[i-1][j-val] == true) {
								dp[i][j] = true;
							}
						}
					}
				}
			}
		}
		
		System.out.println(dp[x][tar]);
	}
}
