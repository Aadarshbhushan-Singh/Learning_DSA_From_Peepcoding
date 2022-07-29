package general_Practice;

public class Class_63_bit_reduction{
	public static void main(String[] args) {
		int[] arr = {1,4,5,8,16,30};
		System.out.println(bitReduction(arr));
	}
	
	static long bitReduction(int []a) {
	    int sum = 0;
	    for(int i = 0; i < a.length; i++){
	        sum = sum + a[i];
	    }
	    
	    return sum;
	}

	static void reduceArray(int[] arr){
	    for(int i = 0; i < arr.length; i++){
	        int ele = arr[i];
	        if(isPowerOf2(ele) == true){
	            continue;
	        }else if(ele % 2 == 0){
	            int product = 1;
	            while(ele % 2 == 0){
	                product = product * 2;
	                ele = ele / 2;
	            }
	            arr[i] = product;
	        }else{
	            arr[i] = 1;
	        }
	    }
	}

	static boolean isPowerOf2(int n){
	    if((n & (n-1)) == 0){
	        return true;
	    }else{
	        return false;
	    }
	}

}
