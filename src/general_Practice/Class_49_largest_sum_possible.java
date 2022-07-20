package general_Practice;

public class Class_49_largest_sum_possible {
	public static void main(String[] args) {
		int N = 3;
		int S = 20;
		System.out.println(findLargest(N, S));
	}
	
	 static String findLargest(int N, int S){
	        
	        if(S == 0 && N > 1){
	            return "-1";
	        }
	        int origS = S;
	        String ans = "";
	        for(int i = 0; i < N; i++){
	            if(S >= 9){
	                ans+='9';
	                S = S-9;
	            }else if(S < 9 && S > -1){
	                ans+=S;
	                S = S-S;
	            }
	        }
	        
	        int sum = 0;
	        for(int i = 0; i < ans.length(); i++){
	            sum = sum + Character.getNumericValue(ans.charAt(i));
	        }
	        
	        // System.out.println(sum + " " + S);
	        
	        if(sum == origS){
	            return ans;
	        }
	        
	        return "-1";
	    }
}
