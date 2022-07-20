package general_Practice;

public class Class_50_count_pair_sum {
	public static void main(String[] args) {
		int[] arr = {1,1,5,7};
		int k = 6;
		
		int left = 0;
		int right = arr.length-1;
		while(left < right) {
			int sum = arr[left] + arr[right];
			if(sum < k) {
				left++;
			}else if(sum > k) {
				right--;
			}else {
				System.out.println(arr[left] + " " + arr[right]);
				left++;
				right--;
			}
		}
		
		
	}
}
