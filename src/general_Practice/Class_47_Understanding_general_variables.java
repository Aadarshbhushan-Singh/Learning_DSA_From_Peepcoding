package general_Practice;

/* When value is not initialized in array, following value is assigned by default.
 * String -> Null
 * int -> 0
 * boolean -> false
 * long -> 0
 * float -> 0.0
 * double -> 0.0
 * 
 * 
 * If we simply declare a variable (String, array, long...) and not initialize it, it will throw error.
 * 
 * */
import java.math.RoundingMode;
import java.text.DecimalFormat;

public class Class_47_Understanding_general_variables {
	public static void main(String[] args) {
		long[] x = new long[5];
		System.out.println(x[0]);
		
		
		boolean bool;
		//This will throw error because bool has not been initialized.
		//Similarly this will happen with others type of variables also. 
//		System.out.println(bool);
		
		
		//Printint only 2 length of decimal value
		
//		double input = 3.14159265359;
//		 System.out.format("double : %.2f", input);
		
		double pi = 3.141592653;
		System.out.printf("%.2f\n", pi);
		String str = String.format("%.2f", pi);
		System.out.println("pi: " + pi);
		System.out.println(str);
		
	}
}
