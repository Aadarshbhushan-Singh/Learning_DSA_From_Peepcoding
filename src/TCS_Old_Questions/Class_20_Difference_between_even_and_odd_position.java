package TCS_Old_Questions;

public class Class_20_Difference_between_even_and_odd_position {
	public static void main(String[] args) {
		String str = "9834698765123";
		
		int sumEven = 0, sumOdd = 0;
		for(int i = 0; i < str.length(); i++) {
			int c = Character.getNumericValue(str.charAt(i));
//			System.out.println(c);
			if(i % 2 == 0) {
				sumEven+=c;
			}else {
				sumOdd+=c;
			}
		}
		
		System.out.println(Math.abs(sumEven-sumOdd));
		
		int x = 10;
		char c = (char) 10;
		System.out.println(c);
		System.out.println(x);
			
		
	}
}
