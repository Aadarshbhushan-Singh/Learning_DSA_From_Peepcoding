package TCS_Old_Questions;

public class Class_23_LCM {
	public static void main(String[] args) {
		int x = 36;
		int y = 24;
		
		int origX = x;
		int origY = y;
		
		int gcd = 0;
		//Find gcd first
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
		System.out.println("GCD " + gcd);
		
		//LCM = (n1 * n2) / GCD
		System.out.println((origX * origY) / gcd);
	}
	
}
