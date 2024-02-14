package chapter_09;

public class C {
	int field1;
	void method1() {}
	
	static int field2;
	static void method2() {}
	
	class D {		// 모든 필드와 메소드에 접근 가능
		void method() {
			field1 = 10;
			method1();
			
			field2 = 10;
			method2();
		}
	}
	
	static class E {
		void method() {
			// field1 = 10;    인스턴스 필드와 메소드는 접근 불가
			// method1();
			field2 = 10;
			method2();
		}
	}

}
