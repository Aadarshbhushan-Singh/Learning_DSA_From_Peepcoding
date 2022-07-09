package Bit_Manipulation;
import java.util.*;

public class Class_02_swap_even_odd_bits {
	public static void main(String[] args) {
		int n = 34;
		
		int om = 0x55555555;
		int em = 0xAAAAAAAA;
		
		int odds = (n & om);
		int evens = (n & em);
		
		odds <<= 1;
		evens >>= 1;
		
		n = odds | evens;
		
		System.out.println(n);
	}

}
