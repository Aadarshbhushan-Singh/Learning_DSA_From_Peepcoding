package Exception_Handling_Practice;

public class Class_01_Try_Catch_Finally {
	public static void main(String[] args) {
		try {
			int[] a = new int[5];
			a[50] = 30/0;
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Array Out of BOund");
			System.out.println("Message : " + e.getMessage());
		}catch(ArithmeticException e) {
			System.out.println("Cannot divide by zero ");
		}catch(Exception e) {
			
		}
		finally {
			System.out.println("Finally executed");
		}
	}
}
