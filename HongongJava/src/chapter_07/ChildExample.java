package chapter_07;

public class ChildExample {

	public static void main(String[] args) {
		
		Child chi = new Child();
		
		Parent par = chi;	// 자동 타입 변환
		par.method1();
		par.method2(); 		// 재정의된 메소드 호출
		// par.method3() : 호출 불가능
	}

}
