package chapter_08;

public class ImplementationC implements InterfaceC {
	public void methodA() {		// InterfaceA의 실체 메소드 구현
		System.out.println("ImplementationC-methodA 실행");
	}
	
	public void methodB() {		// InterfaceB의 실체 메소드 구현
		System.out.println("ImplementationC-methodB 실행");
	}
	
	public void methodC() {		// InterfaceC의 실체 메소드 구현
		System.out.println("ImplementationC-methodC 실행");
	}
}
