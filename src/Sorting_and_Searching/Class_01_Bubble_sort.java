package Sorting_and_Searching;

public class Class_01_Bubble_sort {
	public static void main(String[] args) {
		int[] arr = {7,3,4,2,6,4,5,8};
		int size = arr.length;
		bubbleSort(arr, size);
		
		for(int ele: arr) {
			System.out.print(ele + " ");
		}
	}
	
	static void bubbleSort(int[] arr, int n) {
		
		for(int i = n-2; i >=0; i--) {
			for(int j = 0; j < i; j++) {
				if(arr[j] > arr[j+1]) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
		
		
	}
}
