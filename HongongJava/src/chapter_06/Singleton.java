package chapter_06;

public class Singleton {
	
	private static Singleton singleton = new Singleton();
	
	private Singleton() {
		// private 생성자로 외부에서 인스턴스를 생성하지 못하게 막음
	}
	
	static Singleton getInstance() {
		return singleton;
	}
}
