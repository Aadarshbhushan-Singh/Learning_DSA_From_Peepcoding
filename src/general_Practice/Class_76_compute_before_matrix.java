package general_Practice;
import java.util.*;


public class Class_76_compute_before_matrix {
	public static void main(String[] args) {
		List<Integer> list1 = new ArrayList<>();
		list1.add(2);
		list1.add(1);
		List<Integer> list2 = new ArrayList<>();
		list2.add(5);
		list2.add(4);
		List<List<Integer>> list = new ArrayList<List<Integer>>();
		list.add(list1);
		list.add(list2);
		List<List<Integer>> ans = findBeforeMatrix(list);
		System.out.println(ans);
	}
	
	public static List<List<Integer>> findBeforeMatrix(List<List<Integer>> after){
		int N = after.size();
		int M = after.get(0).size();
		System.out.println(N+ " " + M);
		int[][] after1 = new int[N][M];
		for(int i = 0; i < N; i++) {
			for(int j = 0; j < M; j++) {
				int x = after.get(i).get(j);
				after1[i][j] = x;
			}
		}
		
		int before[][] = new int[N][M];
		before[0][0] = after1[0][0];
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < M; j++) {
					if (i == 0 && j == 0)
						continue;
					else if (i == 0)
						before[i][j] = after1[i][j] - after1[i][j - 1];
					else if (j == 0)
						before[i][j] = after1[i][j] - after1[i - 1][j];
					else
						before[i][j] = after1[i][j] + after1[i - 1][j - 1] - after1[i - 1][j] - after1[i][j - 1];
			}
		}
		
		// Return the before[][] matrix
		List<List<Integer>> finalAns = new ArrayList<List<Integer>>();
		int a = before.length;
		int b = before[0].length;
		for(int i = 0; i < a; i++) {
			List<Integer> temp = new ArrayList<>();
			for(int j = 0; j < b; j++) {
				temp.add(before[i][j]);
			}
			finalAns.add(temp);
		}
		
		return finalAns;
	}
}
