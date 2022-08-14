package Sorting_and_Searching;

public class Class_02_Selection_sort {
	public static void main(String[] args) {
		int[] arr = {7,3,4,2,6,4,5,8};
		int size = arr.length;
		selectionSort(arr, size);
		
		for(int ele: arr) {
			System.out.print(ele + " ");
		}
	}
	
	static void selectionSort(int[] arr, int n) {
		for(int i = n-1; i >= 0; i--) {
			int maxIndex = findMaxIndex(arr, 0, i);
			int temp = arr[i];
			arr[i] = arr[maxIndex];
			arr[maxIndex] = temp;
		}
	}
	
	static int findMaxIndex(int[] arr, int start, int end) {
		int maxIndex = start;
		for(int i = start + 1; i <= end; i++) {
			if(arr[i] > arr[maxIndex]) {
				maxIndex = i;
			}
		}
		
		return maxIndex;
	}
}
