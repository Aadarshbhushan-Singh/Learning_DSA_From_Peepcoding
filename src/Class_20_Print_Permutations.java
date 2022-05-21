import java.util.*;

public class Class_20_Print_Permutations {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String str = scn.next();
		
		printPermutations(str, "");
	}
	
	public static void printPermutations(String str, String asf){
		if(str.length() == 0) {
			System.out.println(asf);
			return;
		}
		
		for(int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			String lSide = str.substring(0, i); //lSide -> Left side of question
			String rSide = str.substring(i+1); //rSide -> Right side of question
			String rof = lSide + rSide;
			printPermutations(rof, asf + c);
		}
	}
}
