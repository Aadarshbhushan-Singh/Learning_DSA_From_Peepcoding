package general_Practice;

public class Class_28_Even_Odd_Number_According_to_index {
	public static void main(String[] args) {
		/*
		 * Given an array arr[] of size N containing equal number of odd and even numbers.
		 * Arrange the numbers in such a way that all the even numbers get the even index and odd numbers get the odd index.
		 * 
		 * */
		
		int[] arr = {3, 6, 12, 1, 5, 8};
		
		solve(arr);
		
		for(int ele: arr) {
			System.out.print(ele + " ");
		}
		
		
	}
	
	public static void solve(int[] arr) {
		int even = 0;
		int odd = 1;
		
		int N = arr.length;
		while(true) {
			while(even < N && arr[even] % 2 == 0) {
				even += 2;
			}
			
			while(odd < N && arr[odd] % 2 != 0) {
				odd+=2;
			}
			
			if(even >=N || odd >=N) {
				break;
			}
			
			swap(arr, even, odd);
			
		}
	}
	
	public static void swap(int[] arr, int even, int odd) {
		int temp = arr[even];
		arr[even] = arr[odd];
		arr[odd] = temp;
	}
}
