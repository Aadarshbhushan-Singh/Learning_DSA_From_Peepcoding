package general_Practice;

public class Class_33_Selection_Sort_Revise {
	public static void main(String[] args) {
		int[] arr = {7,6,1,4,1,8};
		
//		System.out.println(findMax(arr, arr.length-1));
		selectionSort(arr);
		for(int ele: arr) {
			System.out.print(ele);
		}
	}
	
	//Selection Sorting
	static void selectionSort(int[] arr) {
		int n = arr.length;
		for(int i = n-1; i >= 0; i--) {
			int max = findMax(arr, i);
			swap(arr, i, max);
		}
		
		
	}
	
	//This returns index of maximum value
	static int findMax(int[] arr, int ind) {
		int max = 0;
		for(int i = 1; i <= ind; i++){
			if(arr[i] > arr[max]) {
				max = i;
			}
		}
		return max;
	}
	
	//Swapping function
	static void swap(int[] arr, int x, int y) {
		int temp = arr[x];
		arr[x] = arr[y];
		arr[y] = temp;
	}

}
