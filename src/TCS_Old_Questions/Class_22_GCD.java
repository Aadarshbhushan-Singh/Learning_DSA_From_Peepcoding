package TCS_Old_Questions;

public class Class_22_GCD {
	public static void main(String[] args) {
		int x = 41;
		int y = 24;
		
		int gcd = 0;
		while(true) {
			int rem = x % y;
			if(rem == 0) {
				gcd = y;
				break;
			}else {
				x = y;
				y = rem;
			}
		}
		
		System.out.println(gcd);
	}
}
