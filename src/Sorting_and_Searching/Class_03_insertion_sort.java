package Sorting_and_Searching;

public class Class_03_insertion_sort {
	public static void main(String[] args) {
		int[] arr = {7,3,4,2,6,4,5,8};
		int size = arr.length;
		insertionSort(arr, size);
		
		for(int ele: arr) {
			System.out.print(ele + " ");
		}
	}
	
	static void insertionSort(int[] arr, int n) {
		for(int i = 1; i < n; i++) {
			placeCorrect(arr, i);
		}
	}
	
	static void placeCorrect(int[] arr, int end) {
		for(int i = end-1; i >= 0; i--) {
			if(arr[i] > arr[end]) {
				int temp = arr[i];
				arr[i] = arr[end];
				arr[end] = temp;
				end--;
			}else {
				break;
			}
		}
	}
}
