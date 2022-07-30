package general_Practice;
import java.util.*;

public class Class_65_check_if_number_is_power_of_two {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		
		if((n & (n-1)) == 0) {
			System.out.println("True");
		}else {
			System.out.println("False");
		}
	}
}
