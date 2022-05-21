package general_Practice;

public class Class_24_Merge_Sort {
	public static void main(String[] args) {
		
		int[] arr1 = {1,3,4,6,7,9};
		int[] arr2 = {1,2,4,6,8};
		
		int[] arr3 = {3,6,5,4,1,9,6,7};
		
		int[] ans = mergeSort(arr3, 0, arr3.length-1);
		
		for(int ele: ans) {
			System.out.print(ele + " ");
		}
	}
	
	public static int[] mergeSort(int[] arr, int l, int r) {
		if(l == r) {
			int[] a = new int[1];
			a[0] = arr[l];
			return a;
		}
		
		int m = (l+r)/2;
		
		int[] leftArr = mergeSort(arr, l, m);
		int[] rightArr = mergeSort(arr, m+1, r);
		int[] ans = mergeTwoSortedArray(leftArr, rightArr);
		
		return ans;
	}
	
	public static int[] mergeTwoSortedArray(int[] arr1, int[] arr2) {
		int len1 = arr1.length;
		int len2 = arr2.length;
		int[] ans = new int[len1+len2];
		
		int first = 0;
		int second = 0;
		int count = 0;
		
		while(first < len1 && second < len2) {
			if(arr1[first] < arr2[second]) {
				ans[count] = arr1[first];
				count++;
				first++;
			}else if(arr1[first] > arr2[second]) {
				ans[count] = arr2[second];
				count++;
				second++;
			}else if(arr1[first] == arr2[second]) {
				ans[count] = arr1[first];
				count++;
				ans[count] = arr2[second];
				count++;
				first++;
				second++;
			}
		}
		
		while(first < len1) {
			ans[count] = arr1[first];
			count++;
			first++;
		}
		
		while(second < len2) {
			ans[count] = arr2[second];
			count++;
			second++;
		}
		
		return ans;
	}
}
