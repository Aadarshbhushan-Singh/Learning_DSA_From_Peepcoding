package TCS_Old_Questions;

//Find prime number from 1 to 100
public class Class_24_Prime_Number {
	public static void main(String[] args) {
		int upperRange = 100;
		boolean[] arr = new boolean[upperRange];
		for(int i = 2; i < Math.sqrt(upperRange); i++) {
			int num = i;
			for(int a = num+i; a < upperRange; a = a + i) {
				arr[a] = true;
			}
		}
		
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] == false) {
				System.out.println(i);
			}
		}
	}
}
