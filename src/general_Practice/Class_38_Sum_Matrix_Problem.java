package general_Practice;

public class Class_38_Sum_Matrix_Problem {
	public static void main(String[] args) {
		int[][] arr = {{2,3,4,5},{3,4,5,6},{4,5,6,7},{5,6,7,8}};
		int n = arr.length;
		int q = 7;
		
		int ans = searchSum(q, n);
		System.out.println(ans);
	}
	
	public static int searchSum(int q, int n) {
		if(q > n+n){
            return 0;
        }
        if(q <= n+1){
            return q-1;
        }else{
            return (n+n+2-q-1);
        }
	}

}
