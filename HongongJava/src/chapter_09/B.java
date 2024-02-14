package chapter_09;

public class B {
	// 인스턴스 필드
	C field1 = new C();
	D field2 = new D();
	
	// 인스턴스 메소드 - 둘 다 가능
	void method1() {
		C var1 = new C();
		D var2 = new D();
	}
	
	// 정적 필드 초기화
	// static C field3 = new C();   정적 멤버 클래스가 아님
	static D field4 = new D();
	
	// 정적 메소드
	static void method2() {
		// C var1 = new C();    정적 멤버 클래스가 아님
		D var2 = new D();
	}
	
	// 인스턴스 멤버 클래스
	class C {}
	
	// 정적 멤버 클래스
	static class D {}
}
