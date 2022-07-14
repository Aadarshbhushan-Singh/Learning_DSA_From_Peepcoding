package Object_Oriented_Practice;

class VIT{
	public void SCOPE() {
		System.out.println("SCOPE");
	}
	
	protected void SITE() {
		System.out.println("SITE");
	}
}

class VIT2 extends VIT{
	
}

class VIT3 extends VIT2{
	
}

public class Class_04_inheritance {
	public static void main(String[] args) {
		VIT2 obj1 = new VIT2();
		obj1.SCOPE();
		obj1.SITE();
		
		VIT3 obj2 = new VIT3();
		obj2.SCOPE();
		obj2.SITE();
	}
}
