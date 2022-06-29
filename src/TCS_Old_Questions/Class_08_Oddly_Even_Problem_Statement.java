package TCS_Old_Questions;

/*
 * Given a maximum of 100 digit numbers as input, find the difference between the sum of odd and even position digits


 * */
public class Class_08_Oddly_Even_Problem_Statement {
	public static void main(String[] args) {
		String str = "4567";
		
		int sumOdd = 0;
		int sumEven = 0;
		
		for(int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			String strC = String.valueOf(c);
			int num = Integer.parseInt(strC);
			if(i % 2 == 0) {
				sumOdd += num;
			}else {
				sumEven += num;
			}
		}
		
		System.out.println(Math.abs(sumOdd  - sumEven));
	}
}
