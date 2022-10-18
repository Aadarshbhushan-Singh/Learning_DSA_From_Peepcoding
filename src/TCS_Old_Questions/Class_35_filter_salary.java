package TCS_Old_Questions;

import java.util.ArrayList;

public class Class_35_filter_salary {
	public static void main(String[] args) {
		int[][] A = {{1,1}, {2,2}, {3,2}, {4,3}, {5,5}};
		int[][] queries = {{1,5,2}, {2,4,1}};
		int N = A.length;
		int[] ans = filter(N, A, queries);
		for(int ele: ans) {
			System.out.println(ele);
		}
	}
	
	static int[] filter(int N, int[][] A, int[][] queries) {
		ArrayList<Integer> arr = new ArrayList<>();
		
		int i = 0;
		while(i < queries.length) {
			int count = 0;
			int start = queries[i][0];
			int end = queries[i][1];
			int limit = queries[i][2];
			for(int j = start-1; j <= end-1; j++) {
				if(A[j][1] > limit) {
					count++;
				}
			}
			arr.add(count);
			i++;
		}
		
		
		int[] ans = new int[arr.size()];
		for(int j = 0; j < arr.size(); j++) {
			ans[j] = arr.get(j);
		}
		return ans;
	}
}
