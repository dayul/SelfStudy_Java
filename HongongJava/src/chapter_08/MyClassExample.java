package chapter_08;

public class MyClassExample {

	public static void main(String[] args) {
		
		System.out.println("(1) ----------------");
		
		MyClass my1 = new MyClass();
		my1.rc.turnOn();
		my1.rc.setVolume(5);
		
		System.out.println("(2) ----------------");
		
		MyClass my2 = new MyClass(new Audio());
		
		System.out.println("(3) ----------------");
		
		MyClass my3 = new MyClass();
		my3.methodA();
		
		System.out.println("(4) ----------------");
		
		MyClass my4 = new MyClass();
		my4.methodB(new Television());

	}

}
