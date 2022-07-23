package general_Practice;

public class Class_54_ways_to_tile_a_floor {
	public static void main(String[] args) {
		System.out.println(numberOfWays(5));
	}
	static Long numberOfWays(int N) {
        if(N == 1 || N == 2){
            return (long)N;
        }
       Long[] dp = new Long[N+1];
       dp[0] = (long)0;
       dp[1] = (long)1;
       dp[2] = (long)2;
       
       findWays(dp, N);
       Long ans = dp[N];
       return ans;
    }
    
    static void findWays(Long[] dp, int n){
        if(n > 2){
            for(int i = 3; i <= n ; i++){
                dp[i] = (dp[i-1] + dp[i-2])%1000000007;
            }
        }
    }
}
