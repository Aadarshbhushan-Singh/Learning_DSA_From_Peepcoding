package Object_Oriented_Practice;

class Class_02_01{
	public void run() {
		System.out.println("Class 02_01 running");
	}
}

class Class_02_02 extends Class_02_01{
	public void run() {
		System.out.println("Class_02_02 running");
	}
}


class Class_02_03 extends Class_02_01{
	public void run(String str)
	{
		System.out.println("String: " + str);
	}
}
public class Class_02_polymorphism {
	public static void main(String[] args) {
		System.out.println("Program starts here: ");
		
		//This will call super class run method
		Class_02_01 obj1 = new Class_02_01();
		obj1.run();
		
		
		//This will call child class run method 
		Class_02_02 obj2 = new Class_02_02();
		obj2.run();
		
		//If we pass the argument child class run will be called else super class run will be called
		//This is called method orverriding
		Class_02_03 obj3 = new Class_02_03();
		obj3.run();
		obj3.run("Aadarsh");
		
	}
}
