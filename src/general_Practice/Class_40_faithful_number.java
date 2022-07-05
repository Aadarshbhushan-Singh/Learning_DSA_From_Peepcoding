package general_Practice;

public class Class_40_faithful_number {
	public static void main(String[] args) {
		int x = 7;
		System.out.println(nthFaithfulNum(x));
		
	}
	//Convert int number to binary and multiply each digit from last with increasing power of 7
	// 4 = 100 -> 7^0 * 0 + 7^1 * 0 + 7 ^ 2 * 1 = 49
	
	//This function finds nth faithful number
	static Long nthFaithfulNum(int N) {
        String binaryN = Integer.toBinaryString(N);
        char[] arr = binaryN.toCharArray();
        
        // System.out.println(binaryN);
        int pow = 0;
        Long sum = 0L;
        for(int i = arr.length-1; i >= 0; i--){
            int x = Character.getNumericValue(arr[i]);
            sum = sum + ((long) Math.pow(7, pow) * x);
            pow++;
        }
        
        return sum;
	}
}
