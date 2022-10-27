package TCS_Old_Questions;
import java.util.*;

public class Class_39_count_pairs {
	public static void main(String[] args) {
		int N = 3;
		int[] A = {2,2,2};
		int X = 2;
		long ans = count_pairs(N, A, X);
		System.out.println(ans);
	}
	
	static long count_pairs(int N, int[] A, int X) {
		long count = 0;
		int[] arr = new int[A.length+1];
		arr[0] = 0;
		for(int i = 1; i < arr.length; i++) {
			arr[i] = A[i-1];
		}
		for(int i = 1; i <= N; i++) {
			for(int j = 1; j <= N; j++) {
				if(i < j) {
					if(arr[i] == arr[j]) {
						if((i * j) % X == 0) {
							count++;
						}
					}
				}
			}
		}
		
		return count;
	}
}
