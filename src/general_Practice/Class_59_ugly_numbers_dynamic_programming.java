package general_Practice;

public class Class_59_ugly_numbers_dynamic_programming {
	public static void main(String[] args) {
		int n = 12;
		int[] dp = new int[n+1];
		dp[0] = 1;
		findUglyNumber(dp, n);
		for(int ele: dp) {
			System.out.print(ele + " ");
		}
		
	}
	
	public static void findUglyNumber(int[] dp, int n) {
		int pt2=0;
	    int pt3=0;
	    int pt5=0;
	    for(int i=1;i<n;i++){
	        int x=dp[pt2]*2;
	        int y=dp[pt3]*3;
	        int z=dp[pt5]*5;
	       
	       if(x<=y&&x<=z ) {
	        
	           dp[i]=dp[pt2]*2;
	                  pt2++;
	       }
	        if(y<=x&&y<=z) {
	        
	           dp[i]=dp[pt3]*3;
	                  pt3++;
	       }  
	            if(z<=x && z<=y ) {
	        
	           dp[i]=dp[pt5]*5;
	                  pt5++;
	       } 
	        
	    }
	}
}
