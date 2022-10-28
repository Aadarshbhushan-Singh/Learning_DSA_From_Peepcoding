package TCS_Old_Questions;

import java.util.ArrayList;
import java.util.Arrays;

public class Class_40_complete_q_queries {
	public static void main(String[] args) {
		int N = 3;
		int[] A = {1,2,3};
		int Q = 3;
		int[][] P = {{2,1,2},{1,0,0},{3,2,0}};
		
		int[] ans = query_game(N, A, Q, P);
		for(int i = 0; i < ans.length; i++) {
			System.out.println(ans[i]);
		}
	}
	
	static int[] query_game(int N, int[] A, int Q, int[][] P) {
		ArrayList<Integer> arr = new ArrayList<>();
		for(int i = 0; i < Q; i++) {
			if(P[i][0] == 1) {
				reverseArray(A);
			}else if(P[i][0] == 2) {
				swap(A, P[i][1], P[i][2]);
			}else if(P[i][0] == 3) {
				arr.add(printPosition(A, P[i][1]));
			}
		}
		
		int size = arr.size();
		int[] finalArr = new int[size];
		for(int i = 0; i < size; i++) {
			finalArr[i] = arr.get(i);
		}
		
		return finalArr;
	}
	
	static void reverseArray(int[] a){
		int i, t;
		int n = a.length;
        for (i = 0; i < n / 2; i++) {
            t = a[i];
            a[i] = a[n - i - 1];
            a[n - i - 1] = t;
        }
	}
	
	static void swap(int[] a, int i, int j) {
		i--;
		j--;
		int temp = a[i];
		a[i] = a[j];
		a[j] = temp;
	}
	
	static int printPosition(int[] a, int x) {
		int index = -1;
		for(int i = 0; i < a.length; i++) {
			if(a[i] == x) {
				index = i;
				break;
			}
		}
		index++;
		return index;
	}
	
	static void printArray(int[] a) {
		for(int i = 0; i < a.length; i++) {
			System.out.print(a[i]);
		}
		System.out.println();
	}
	
	
}
