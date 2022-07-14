package Object_Oriented_Practice;

class MyClass{
	private String name;
	private int age;
	
	protected String course;
	
	public void setter(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public void getter() {
		System.out.println("Name: " + this.name + " Age: " + this.age);
	}
	
	public void setCourse(String course) {
		this.course = course;
	}
	
	public void getCourse() {
		System.out.println(course);
	}
}

public class Class_03_encaptulation {
	public static void main(String[] args) {
		MyClass obj1 = new MyClass();
		obj1.setter("Aadarsh", 21);
		obj1.getter();
		
		obj1.setCourse("CSE");
		obj1.getCourse();
	}
}
