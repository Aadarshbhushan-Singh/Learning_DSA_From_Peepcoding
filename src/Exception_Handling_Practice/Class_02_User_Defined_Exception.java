package Exception_Handling_Practice;

class ExceptionAadarsh extends Exception{
	public ExceptionAadarsh(String s) {
		super(s);
	}
}
public class Class_02_User_Defined_Exception {
	public static void main(String[] args) {
		try {
			int a = 10;
			if(a == 10) {
				throw new ExceptionAadarsh("My Exception");
			}
		}catch(ExceptionAadarsh e) {
			System.out.println("Exception aadarsh caught");
			System.out.println(e.getMessage());
		}finally {
			System.out.println("Finally executed");
		}
	}
}
