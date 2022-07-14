package Object_Oriented_Practice;

abstract class Mobile{
	public void call() {
		System.out.println("Calling...");
	}
	
	public void sendText() {
		System.out.println("Sending text...");
	}
	
	abstract void move();
	abstract void walk();
	
}


class Samsung extends Mobile{
	public void move() {
		System.out.println("Moving...");
	}
	
	public void walk() {
		System.out.println("Walking...");
	}
}
public class Class_01_abstract_class {
	public static void main(String[] args) {
		Samsung obj1 = new Samsung();
		obj1.call();
		obj1.sendText();
		obj1.move();
		obj1.walk();
	}
}
