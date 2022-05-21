package general_Practice;

public class Class_26_Selection_Sort {
	public static void main(String[] args) {
		int[] arr = {1,5,3,7,5,6,9,8};
		
		printArray(arr);
		selectionSort(arr);
		System.out.println();
		printArray(arr);
		
		
	}
	
	//getMaxInd is of n complexity so the total time complexity will be O(n^2)
	public static void selectionSort(int[] arr) {
		for(int i = arr.length-1; i >= 0; i--) {
			int maxInd=getMaxInd(arr, i);
			swap(arr, maxInd, i);
		}
	}
	
	//This returns the index of maximum element
	public static int getMaxInd(int[] arr, int x) {
		int maxInd = 0;
		for(int i = 0; i <= x; i++) {
			if(arr[i] > arr[maxInd]) {
				maxInd = i;
			}
		}
		return maxInd;
	}
	
	
	
	public static void swap(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}

	public static void printArray(int[] arr) {
		for(int ele: arr) {
			System.out.print(ele + " ");
		}
	}
}

