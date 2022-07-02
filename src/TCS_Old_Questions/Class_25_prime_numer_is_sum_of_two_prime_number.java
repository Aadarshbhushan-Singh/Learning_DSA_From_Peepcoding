package TCS_Old_Questions;

//If sum of two numbers is prime, then always one number should be 2 bacause other prime number sum always gives even number
public class Class_25_prime_numer_is_sum_of_two_prime_number {
	public static void main(String[] args) {
		int x = 13;
		
		if(isPrime(x) == true) {
			if(isPrime(x-2) == true) {
				System.out.println(2 + " " + (x - 2));
			}else {
				System.out.println("Not possible");
			}
		}else {
			System.out.println("Not possible");
		}
		
	}
	
	static boolean isPrime(int n) {
		for(int i = 2; i <= Math.sqrt(n); i++) {
			if(n % i == 0) {
				return false;
			}
		}
		
		return true;
	}
}

