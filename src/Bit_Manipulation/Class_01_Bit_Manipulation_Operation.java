package Bit_Manipulation;

public class Class_01_Bit_Manipulation_Operation {
	public static void main(String[] args) {
		//x will be stored as binary in RAM
		int x = 3;
		
		//Here we are checking for 2nd bit.
		
		//on
		int onMask = (1 << 2); //1 will be treated as 0001 and <<2 will make it 0100
		System.out.println(x | onMask);
		
		//off
		int offMask = ~(1 << 2); //1 will be treated as 0001 and << 2 will make it 0100 and ~() will make it 1011
		System.out.println(x & offMask);
		
		//toggle
		int toogleMask = (1 << 2);
		System.out.println(x ^ toogleMask);
		
		//check
		//When done operation with checkMask, if the bit is 0, it will return 0 else 1
		int checkMask = (1 << 2);
		if((x & checkMask) == 0) {
			System.out.println("True");
		}else {
			System.out.println("False");
		}
	}
}
