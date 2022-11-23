package general_Practice;

import java.util.Scanner;

public class Class_74_print_pattern_X {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n, i, j, c = 1;
		n = scn.nextInt();
		for(i = 1; i <= (2 * n) - 1; i++){	
			for (j = 1; j <= (2 * n) - 1; j++ ){
				if (i == j || i + j == 2 * n) {
					System.out.print(c + " ");
				}else {
					System.out.print(" ");
				}
			}
			System.out.println();
			if (i < n)
				c++;
			else
				c-- ;
			System.out.println();
		}
		
	}
}
