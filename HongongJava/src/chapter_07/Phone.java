package chapter_07;
// 추상 클래스
public abstract class Phone {
	
	// 필드
	public String owner;
	
	// 생성자
	public Phone(String owner) {
		this.owner = owner;
	}
	
	// 메소드
	public void turnOn() {
		System.out.println("폰 전원을 킵니다.");
	}
	
	public void turnOff() {
		System.out.println("폰 전원을 끕니다.");
	}

}
