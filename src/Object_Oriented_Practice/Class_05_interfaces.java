package Object_Oriented_Practice;

interface NewMobile{
	public default void call() {
		System.out.println("Calling");
	}
	
	public void camera();
	void calendar();
	void map();
}

abstract class Lava implements NewMobile{
	public void camera() {
		System.out.println("Camera working");
	}
	
	public abstract void calendar();
	public abstract void map();

	
}

class Lava2 extends Lava{
	public void calendar() {
		System.out.println("calendar");
	}
	
	public void map() {
		System.out.println("map");
	}
}


public class Class_05_interfaces {
	public static void main(String[] args) {
		Lava2 obj1 = new Lava2();
		obj1.call();
		obj1.camera();
		obj1.map();
	}
}
