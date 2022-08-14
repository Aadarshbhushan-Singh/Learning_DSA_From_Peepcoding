package Sorting_and_Searching;

public class Class_04_merge_sort_method_1 {
	public static void main(String[] args) {
		int[] arr = {7,3,4,2,6,4,5,8};
		int size = arr.length;
		int[] sortedArray = mergeSort(arr, 0, size-1);
		
		for(int ele: sortedArray) {
			System.out.print(ele + " ");
		}
	}
	
	static int[] mergeSort(int[] arr, int start, int end) {
		if(start >= end) {
			int[] newArr = new int[1];
			newArr[0] = arr[start];
			return newArr;
		}
		
		int mid = (start + end) / 2;
		
		int[] leftArray = mergeSort(arr, start, mid);
		int[] rightArray = mergeSort(arr, mid + 1, end);
		
		int[] finalAns = mergeArray(leftArray, rightArray);
		
		return finalAns;
	}
	
	static int[] mergeArray(int[] arr1, int[] arr2) {
		int first = 0;
		int second = 0;
		int[] ans = new int[arr1.length + arr2.length];
		int i = 0;
		while(first < arr1.length && second < arr2.length) {
			if(arr1[first] < arr2[second]) {
				ans[i] = arr1[first];
				first++;
			}else {
				ans[i] = arr2[second];
				second++;
			}
			
			
			i++;
		}
		
		
		if(first < arr1.length) {
			while(first < arr1.length) {
				ans[i] = arr1[first];
				first++;
				i++;
			}
		}else if(second < arr2.length) {
			while(second < arr2.length) {
				ans[i] = arr2[second];
				second++;
				i++;				
			}
		}
		
		
		return ans;
	}
	
	
}
