package Object_Oriented_Practice;

public class Class_06_understanding_static_keyword {
	
	//static variable ia available throughout the class and can be called as global variable
	static int x= 10;
	
	
	//A static block runs (and runs only once) when the class is loaded first time. 
	static {
		System.out.println("Static block");
	}
	
	//We can create multiple static block and all will be executed in the sequence they are
	static {
		System.out.println("Static block 2");
	}
	
	
	/* In java, program is under a class. We cannot use the methods or variable inside the function withot making an object of the class.
	 * But we need to start somewhere in order to execute the java file. So, we declare the main function as static. It means inorder to execute the function,
	 * there is not need to create the object of the class.
	 * 
	 *  *
	 * */
	public static void main(String[] args) {
		System.out.println("Hello world");
		
		System.out.println("Value of x is: " + x);
	}
}
