package chapter_07;

public class InstanceofExample {
	
	public static void method1(Parent par) {
		if(par instanceof Child) {		// Child 타입으로 변환이 가능한지 확인
			Child chi = (Child) par;
			System.out.println("method1 - Child로 변환 성공");
		}
		else {
			System.out.println("method1 - Child로 변환 실패");
		}
	}
	
	public static void method2(Parent par) {
		Child chi = (Child) par;		// ClassCastException 발생 가능성 있음
		System.out.println("method2 - Child로 변환 성공");
	}

	
	public static void main(String[] args) {
		
		Parent parA = new Child();
		method1(parA);
		method2(parA);
		
		Parent parB = new Parent();
		method1(parB);
		method2(parB);
	}

}
