package general_Practice;

//Leetcode 66
public class Class_62_plusOne {
	public static void main(String[] args) {
		int[] arr = {9,9,9,9};
		int[] arr2 = {1,2,3};
		
		int[] ans1 = plusOne(arr);
		int[] ans2 = plusOne(arr2);
		
		for(int ele: ans1) {
			System.out.print(ele + " ");
		}
		System.out.println();
		for(int ele: ans2) {
			System.out.print(ele + " ");
		}
	}
	 public static int[] plusOne(int[] digits) {
	        int[] result = new int[digits.length + 1];
	        
	        for(int i = digits.length-1; i >= 0; i--){
	            if(digits[i] + 1 <= 9){
	                digits[i]++;
	                return digits;
	            }else{
	                digits[i] = 0;
	            }
	        }
	        
	        result[0] = 1;
	        return result;
	    }
}	
