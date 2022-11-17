package general_Practice;
import java.util.*;

public class Class_69_Z_number {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n1 = 0;
		int n2 = scn.nextInt();
		int c = 0;
		
		for(int i = n1; i <= n2; i++) {
			if(initialCheck(i) == true) {
				c++;
			}
		}
		
		System.out.println(c);
	}
	
	public static boolean initialCheck(int n) {
		if(n >= 0 && n <= 9) {
			return true;
		}
		String str = String.valueOf(n);
		int c1 = Character.getNumericValue(str.charAt(0));
		int c2 = Character.getNumericValue(str.charAt(1));
		if(c1 > c2) {
			return check1(n);
		}else {
			return check2(n);
		}
	}
	public static boolean check1(int n) {
		
		String str = String.valueOf(n);
		int i = 0;
		while(i < str.length()-1) {
			int c1 = Character.getNumericValue(str.charAt(i));
			int c2 = Character.getNumericValue(str.charAt(i+1));
			if(i % 2 == 0) {
				if(c1 > c2) {
					i++;	
				}else {
					return false;
				}
			}else {
				if(c1 < c2) {
					i++;
				}else {
					return false;
				}
			}
		}
		return true;
	}
	
	public static boolean check2(int n) {
		if(n >= 0 && n <= 9) {
			return true;
		}
		String str = String.valueOf(n);
		int i = 0;
		while(i < str.length()-1) {
			int c1 = Character.getNumericValue(str.charAt(i));
			int c2 = Character.getNumericValue(str.charAt(i+1));
			if(i % 2 == 0) {
				if(c1 < c2) {
					i++;	
				}else {
					return false;
				}
			}else {
				if(c1 > c2) {
					i++;
				}else {
					return false;
				}
			}
		}
		return true;
	}
}
