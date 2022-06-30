package TCS_Old_Questions;

public class Class_19_count_crossing_biker {
	public static void main(String[] args) {
		int[] arr = {0,1,0,1,1};
		
		int ans = 0;
		
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] == 1) {
				continue;
			}else {
				int num = searchOne(arr, i);
				ans+=num;
			}
		}
		
		System.out.println(ans);
	}
	
	static int searchOne(int[] arr, int ind) {
		int count = 0;
		for(int i = ind; i< arr.length; i++) {
			if(arr[i] == 1) {
				count++;
			}
		}
		
		return count;
	}
}
