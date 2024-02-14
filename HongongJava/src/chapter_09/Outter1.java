package chapter_09;

public class Outter1 {

	String field1 = "Outter-field";
	void method1() {
		System.out.println("Outter-method");
	}
	
	class Nested {
		String field2 = "Nested-field";
		void method2() {
			System.out.println("Nested-method");
		}
		
		void print() {
			System.out.println(this.field2); 	// 중첩 객체 참조
			this.method2();
			
			System.out.println(Outter1.this.field1);	// 바깥 객체 참조
			Outter1.this.method1();
		}
	}
}
