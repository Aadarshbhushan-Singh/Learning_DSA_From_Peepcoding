package TCS_Old_Questions;
import java.util.*;

public class Class_34_Task_division_of_cricket_net {
	public static void main(String[] args) {
		int[] L = {0, 4, 23};
		int[] R = {3, 5, 24};
		
		int[][] result = Availability(L.length, L, R);
		
		for(int i = 0; i < result.length; i++) {
			System.out.println(result[i][0] + " " + result[i][1]);
		}
	}
	
	static int[][] Availability(int N, int[] L, int[] R) {
		 ArrayList<ArrayList<Integer> > solution = new ArrayList<ArrayList<Integer> >();
		 if(L[0] != 0) {
			 ArrayList<Integer> arr = new ArrayList<>();
			 arr.add(0);
			 arr.add(L[0]);
			 solution.add(arr);
		 }
		 int i = 1;
		 for(i = 1; i < N; i++) {
			 if(R[i-1] != L[i]) {
				 ArrayList<Integer> arr = new ArrayList<>();
				 arr.add(R[i-1]);
				 arr.add(L[i]);
				 solution.add(arr);
				 
			 }
		 }
		 
		 if(R[i-1] != 1000000000) {
			 ArrayList<Integer> arr = new ArrayList<>();
			 arr.add(R[i-1]);
			 arr.add( 1000000000);
			 solution.add(arr);
		 }
		
		 int len = solution.size();
		 int[][] result = new int[len][2];
		 for(int j = 0; j < solution.size(); j++) {
			result[j][0] = solution.get(j).get(0);
			 result[j][1] = solution.get(j).get(1);
		 }
		
		 return result;
	}
}


/*
 * 1 4 9 23
 * 3 9 22 1000
 * 
 * 0 4 9 23
 * 3 9 22 1000
 * 
 * */
