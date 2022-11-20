package general_Practice;

public class Class_72_find_next_greater_element_conditional {
	public static void main(String[] args) {
       
        System.out.println(solution(10));
	}
	public static int solution(int N) {
		int ans =  smallestNumber(N);
		return ans;
	}
	
	static int getSum(int n)
    {
        int sum = 0;
        while (n != 0)
        {
            sum = sum + n % 10;
            n = n / 10;
        }
        return sum;
    }
    static int smallestNumber(int N){

        int i=getSum(N);
        int d=i*2;
        int k=N;
        while (k<100000){
            if(getSum(k)==d){
                return k;
            }
            k++;
        }
        return 0;
    }
}
