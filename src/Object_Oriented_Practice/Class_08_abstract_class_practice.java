package Object_Oriented_Practice;

public class Class_08_abstract_class_practice {
	public static void main(String[] args) {
		B obj = new B();
		obj.toCapital("Hello");
		obj.toSmall("Hi");
		
		Samsung sam = new Samsung();
		sam.show();
		
		Iphone iph = new Iphone();
		iph.show();
		
		getPhone(sam);
		getPhone(iph);
	}
	
	public static void getPhone (Samsung sum) {
		System.out.println("Got Samsung phone");
	}
	
	public static void getPhone (Iphone iph) {
		System.out.println("God Iphone");
	}
	
	public static abstract class A{
		public void toCapital(String str) {
			System.out.println(str.toUpperCase());
		}
		
		public abstract void toSmall(String str);
	}
	
	public static class B extends A{
		public void toSmall(String str) {
			System.out.println(str.toLowerCase());
		}
	}
	
	
	//abstraction
	public static abstract class  Phone{
		public abstract void show();
	}
	
	public static class Samsung extends Phone{
		public void show() {
			System.out.println("Samsung");
		}
	}
	
	public static class Iphone extends Phone{
		public void show() {
			System.out.println("Iphone");
		}
	}
}
