package general_Practice;

public class Class_17_Selling_Products_Hackerearth {
	public static void main(String[] args) {
		System.out.println(sellingProduct(50));
	}
	
	
	static int sellingProduct(int base10) {
		String binaryBase10 = decToBinary(base10);
		String str = "";
		for(int i = 0; i < binaryBase10.length(); i++) {
			if(binaryBase10.charAt(i) == '1') {
				str += '0';
			}else if(binaryBase10.charAt(i) == '0') {
				str += '1';
			}
		}
		
		int decimal=Integer.parseInt(str,2); 
		
		
		return decimal;
	}
	
	static String decToBinary(int n)
    {
        int[] binaryNum = new int[1000];
   
        int i = 0;
        while (n > 0) 
        {
            binaryNum[i] = n % 2;
            n = n / 2;
            i++;
        }
        
        String ans = "";
   
        for (int j = i - 1; j >= 0; j--) {
        	ans += binaryNum[j];
    	}
	
		return ans;
    }
}
