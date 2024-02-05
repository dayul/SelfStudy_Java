package chapter_07;

public class PhoneExample {

	public static void main(String[] args) {
		
		// Phone pho = new Phone();	추상 클래스이므로 X
		
		SmartPhone smartPhone =  new SmartPhone("감자바");
		
		smartPhone.turnOn();		// 추상 클래스의 메소드
		smartPhone.internetSearch();	// 자식 클래스의 메소드
		smartPhone.turnOff();		// 추상 클래스의 메소드

	}

}
