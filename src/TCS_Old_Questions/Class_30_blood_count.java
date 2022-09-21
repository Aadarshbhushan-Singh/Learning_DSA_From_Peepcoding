package TCS_Old_Questions;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Class_30_blood_count {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int testcases = scn.nextInt();
		
		while(testcases > 0) {
			int num = scn.nextInt();
			String str = String.valueOf(num);
			char[] ch = str.toCharArray();
			Arrays.sort(ch);
			String increasing = str.valueOf(ch);
			 String decreasing = "";
			    
			 for(int i = ch.length - 1; i >= 0; i--)
			 {
				 decreasing = decreasing + ch[i];
			 }
			 
			 int numIncreasing = Integer.parseInt(increasing);
			 int numDecreasing = Integer.parseInt(decreasing);
			 
			 if(num == numIncreasing) {
				 System.out.println("Healthy");
			 }else if(num == numDecreasing) {
				 System.out.println("Unhealthy");
			 }else {
				 System.out.println("Precautions Needeed");
			 }
			testcases--;
		}
	}
}
